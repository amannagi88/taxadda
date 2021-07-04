/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tax.services;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import com.tax.dao.TaxDao;
import com.tax.form.SessionForm;
import com.tax.tableentities.UserTransactionPayment;
import com.tax.util.Signature;
import java.sql.Timestamp;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.json.JSONObject;

/**
 *
 * @author Dell India
 */
public class FilingAction extends DispatchAction {

    public ActionForward saveStep1(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
        SessionForm sessForm = (SessionForm) req.getSession(false).getAttribute("sessionForm");
        TaxDao usDao = null;
        try {
            String pan = "", adhaar = "", mobile = "";
            if (req.getParameter("param1") != null) {
                pan = req.getParameter("param1");
            }
            if (req.getParameter("param2") != null) {
                adhaar = req.getParameter("param2");
            }
            if (req.getParameter("param3") != null) {
                mobile = req.getParameter("param3");
            }
            usDao = new TaxDao();
            int id = usDao.saveStepOne(new String[]{pan, adhaar, mobile}, sessForm.getUserId());
            if (id > 0) {
                sessForm.setTransactionId(id);
                res.setContentType("text/html");
                res.setHeader("Cache-control", "no-cache");
                res.setHeader("Access-Control-Allow-Headers", "Content-Type");
                res.getWriter().write("" + id);//SUCCESS
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ActionForward saveStep2(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
        SessionForm sessForm = (SessionForm) req.getSession(false).getAttribute("sessionForm");
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        try {

            try {
                RazorpayClient razorpay = new RazorpayClient("rzp_test_uChk2k5T5fBncw", "fGdL8jeVsk8jCUSwG3wqD0zt");
                JSONObject orderRequest = new JSONObject();
                orderRequest.put("amount", 30000); // amount in the smallest currency unit
                orderRequest.put("currency", "INR");
                orderRequest.put("receipt", "order_rcptid_11");
                orderRequest.put("payment_capture", false);

                Order order = razorpay.Orders.create(orderRequest);//Razor Pay Order
                System.out.println(order);

                UserTransactionPayment payment = new UserTransactionPayment();
                payment.setActiveStatus(1);
                payment.setTransactionAmt(300);
                payment.setOrderId(order.get("id") + "");
                req.getSession(false).setAttribute("orderId", order.get("id"));
                payment.setTransactionId(sessForm.getTransactionId());
                payment.setCreateDt(ts);
                payment.setTransactionDate(ts);
                payment.setUpdateDt(ts);
                new TaxDao().savePojo(payment);

            } catch (RazorpayException e) {
                // Handle Exception
                System.out.println(e.getMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ActionForward loadStep3(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
        SessionForm sessForm = (SessionForm) req.getSession(false).getAttribute("sessionForm");
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapping.findForward("payment");
    }

    public ActionForward paymentSuccess(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
        SessionForm sessForm = (SessionForm) req.getSession(false).getAttribute("sessionForm");
        TaxDao usDao = null;
        try {
            String razorpay_order_id = "";
            String razorpay_payment_id = "";
            String razorpay_signature = "";

            if (req.getParameter("razorpay_order_id") != null) {
                razorpay_order_id = req.getParameter("razorpay_order_id");
            }
            if (req.getParameter("razorpay_payment_id") != null) {
                razorpay_payment_id = req.getParameter("razorpay_payment_id");
            }
            if (req.getParameter("razorpay_signature") != null) {
                razorpay_signature = req.getParameter("razorpay_signature");
            }

            String generated_signature = Signature.calculateRFC2104HMAC(razorpay_order_id + "|" + razorpay_payment_id, "fGdL8jeVsk8jCUSwG3wqD0zt");

            if (generated_signature.equals(razorpay_signature)) {
                
                if(sessForm!=null){
                    usDao = new TaxDao();
                    UserTransactionPayment pay = usDao.getPojo(sessForm.getTransactionId());
                    if(pay!=null){
                        pay.setBankAmt(pay.getTransactionAmt());
                        pay.setBankVerified(1);
                        usDao.updatePojo(pay);
                    }
                }                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapping.findForward("payment_success");
    }

    public ActionForward paymentFailure(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
        SessionForm sessForm = (SessionForm) req.getSession(false).getAttribute("sessionForm");
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapping.findForward("payment_failure");
    }

}
