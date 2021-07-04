/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tax.dao;

import com.tax.tableentities.RegPass;
import com.tax.tableentities.UserDetails;
import com.tax.tableentities.UserRegistration;
import com.tax.tableentities.UserTransaction;
import com.tax.tableentities.UserTransactionPayment;
import com.tax.util.BeanObject;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Dell India
 */
public class TaxDao {

    private final SessionFactory fac = HiberUtil.getSessionFactory();

    public UserRegistration checkUserExists(String userName) {
        Session sess = fac.openSession();
        UserRegistration apReg1 = new UserRegistration();
        try {
            String query = "select count(*) as existCount,tur.user_id,tur.user_type_id,tur.user_name"
                    + " from tax_user_registration tur where "
                    + " trim(tur.user_name)='" + userName.trim() + "'";

            List existList = sess.createSQLQuery(query).list();
            if (checkListEmpty(existList)) {
                Object[] arr = (Object[]) existList.get(0);
                if (arr[1] != null) {
                    apReg1.setUserId((Integer) arr[1]);
                    apReg1.setUserTypeId((Integer) arr[2]);
                    apReg1.setUserName((String) arr[3]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sess.close();
        }
        return apReg1;
    }

    public int saveUser(UserRegistration apReg, UserDetails apuReg, RegPass ps, HttpServletRequest req) {
        Session sess = fac.openSession();
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        try {
            sess.beginTransaction().begin();
            sess.save(apReg);
            apuReg.setCreateDt(ts);
            apuReg.setUpdateDt(ts);
            sess.save(apuReg);
            int pkId1 = apReg.getUserId();
            int pkId2 = apuReg.getEntityId();

            //cad.setRegisterId(pkId1);
            ps.setRegisterId(pkId1);
            ps.setDateCreated(ts);
            ps.setDateUpdated(ts);
            sess.save(ps);
            //sess.save(cad);
            sess.beginTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            sess.close();
        }
        return apReg.getUserId();
    }

    public int saveStepOne(String[] param, int userId) {
        Session sess = fac.openSession();
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        UserTransaction userTrans = new UserTransaction();
        try {
            userTrans.setUserId(userId);
            userTrans.setTransactionIsStr(System.currentTimeMillis() + "");
            userTrans.setCreateDt(ts);
            userTrans.setUpdateDt(ts);
            userTrans.setActiveStatus(1);
            userTrans.setPanNo(param[0]);
            userTrans.setAdhaarNo(param[1]);
            userTrans.setMobileNo(param[2]);
            sess.beginTransaction().begin();
            sess.save(userTrans);
            sess.beginTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            sess.close();
        }
        return userTrans.getTransactionId();
    }

    public String getUserName(String firstName, String lastName) {
        String query = "";
        Session sess = fac.openSession();
        List lis = null;
        String returnValue = null;
        Object[] arr = null;
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        try {
            query = " select count(*) as existsCount,1 as vall,'" + firstName.trim() + "_" + lastName.trim() + ts.toString() + new Timestamp(System.currentTimeMillis()).toString().substring(20, 23) + "' as new_user "
                    + " from scpd_user_registration where user_name = trim('" + firstName.trim() + "_" + lastName.trim() + "') ";
            lis = sess.createSQLQuery(query).list();
            if (lis != null && lis.size() > 0) {
                arr = (Object[]) lis.get(0);
                returnValue = (String) arr[0];
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sess.close();
        }
        return returnValue;
    }

    public static boolean checkListEmpty(List lis) {
        return (lis == null || lis.size() == 0) ? false : true;
    }

    public boolean savePojo(Object pojo) {
        Session sess = fac.openSession();
        try {
            sess.beginTransaction().begin();
            sess.save(pojo);
            sess.beginTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            sess.close();
        }
        return true;
    }

    public List getAllUserTransactions(int userId) {
        Session sess = fac.openSession();
        String query = "";
        List returnList = null;
        BeanObject bean = null;
        try {
            query = "select a.transaction_id_str,pan_no,adhaar_no,mobile_no,\n"
                    + "if(c.bank_verified=1,'Paid','Pending'),bank_amt\n"
                    + "from tax_user_transaction a, tax_user_transaction_attachment b\n"
                    + ",tax_user_transaction_payment c\n"
                    + "where a.user_id=:userId and a.transaction_id=b.transaction_id\n"
                    + "and a.transaction_id=c.transaction_id;";

            List list = sess.createSQLQuery(query).setInteger("userId", userId).list();

            Object[] arr = null;
            if (list != null && list.size() > 0) {
                returnList = new ArrayList();
                for (int y = 0; y < list.size(); y++) {
                    bean = new BeanObject();
                    arr = (Object[]) list.get(y);
                    bean.setStringValue1(arr[0] + "");//Transaction Id
                    bean.setStringValue2(arr[1] + "");//Pan
                    bean.setStringValue3(arr[2] + "");//Adhar                    
                    bean.setStringValue4(arr[3] + "");       //Mobile             
                    bean.setStringValue5(arr[4] + "");//Payment Status 
                    bean.setStringValue6(arr[5] + "");//Paid Amt
                    returnList.add(bean);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sess.close();
        }
        return returnList;
    }

    public UserTransactionPayment getPojo(int transactionId) {
        Session sess = fac.openSession();
        UserTransactionPayment ac = null;
        try {
            ac = (UserTransactionPayment) sess.get(UserTransactionPayment.class, transactionId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            sess.close();
        }
        return ac;
    }

    public boolean updatePojo(Object pojo) {
        Session sess = fac.openSession();
        try {
            sess.beginTransaction().begin();
            sess.update(pojo);
            sess.beginTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            sess.close();
        }
        return true;
    }

}
