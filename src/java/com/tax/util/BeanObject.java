/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tax.util;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Promovision
 */
public class BeanObject implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    private int intValue1;
    private int intValue2;
    private int intValue3;
    private int intValue4;
    private int intValue5;
    private String stringValue1;
    private String stringValue2;
    private String stringValue3;
    private String stringValue4;
    private String stringValue5;
    private String stringValue6;

    public String getStringValue6() {
        return stringValue6;
    }

    public void setStringValue6(String stringValue6) {
        this.stringValue6 = stringValue6;
    }        

    public int getIntValue1() {
        return intValue1;
    }

    public void setIntValue1(int intValue1) {
        this.intValue1 = intValue1;
    }

    public int getIntValue2() {
        return intValue2;
    }

    public void setIntValue2(int intValue2) {
        this.intValue2 = intValue2;
    }

    public int getIntValue3() {
        return intValue3;
    }

    public void setIntValue3(int intValue3) {
        this.intValue3 = intValue3;
    }

    public int getIntValue4() {
        return intValue4;
    }

    public void setIntValue4(int intValue4) {
        this.intValue4 = intValue4;
    }

    public int getIntValue5() {
        return intValue5;
    }

    public void setIntValue5(int intValue5) {
        this.intValue5 = intValue5;
    }

    public String getStringValue1() {
        return stringValue1;
    }

    public void setStringValue1(String stringValue1) {
        this.stringValue1 = stringValue1;
    }

    public String getStringValue2() {
        return stringValue2;
    }

    public void setStringValue2(String stringValue2) {
        this.stringValue2 = stringValue2;
    }

    public String getStringValue3() {
        return stringValue3;
    }

    public void setStringValue3(String stringValue3) {
        this.stringValue3 = stringValue3;
    }

    public String getStringValue4() {
        return stringValue4;
    }

    public void setStringValue4(String stringValue4) {
        this.stringValue4 = stringValue4;
    }

    public String getStringValue5() {
        return stringValue5;
    }

    public void setStringValue5(String stringValue5) {
        this.stringValue5 = stringValue5;
    }
    
    public PropertyChangeSupport getPropertySupport() {
        return propertySupport;
    }

    public void setPropertySupport(PropertyChangeSupport propertySupport) {
        this.propertySupport = propertySupport;
    }
    
    private PropertyChangeSupport propertySupport;
    
    public BeanObject() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
