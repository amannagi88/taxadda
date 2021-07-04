/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tax.services;

import com.tax.dao.TaxDao;
import com.tax.form.RegistrationForm;
import com.tax.form.SessionForm;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author Dell India
 */
public class BasicAction extends DispatchAction {

    public ActionForward quickITR(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
        RegistrationForm myForm = (RegistrationForm) form;
        try {
            myForm.setFirstName("");
            myForm.setPanNumber("");
        } catch (Exception e) {

        }
        return mapping.findForward("quickitr");
    }

    public ActionForward home(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
        try {

        } catch (Exception e) {
        }
        return mapping.findForward("home");
    }
    
    public ActionForward getAllFilings(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
        SessionForm sessForm = (SessionForm) req.getSession(false).getAttribute("sessionForm");
        try {
            List filings=new TaxDao().getAllUserTransactions(sessForm.getUserId());
            req.setAttribute("filings", filings);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapping.findForward("transactions");
    }

}
