/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tax.services;

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
public class ServiceAction extends DispatchAction {

    public ActionForward services(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
        try {

        } catch (Exception e) {
        }
        return mapping.findForward("services");
    }

}
