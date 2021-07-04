package com.tax.tableentities;

import java.sql.Timestamp;

/**
 * ScpdUserDetails generated by hbm2java
 */
public class UserTransactionAttachment implements java.io.Serializable {

    private Integer attachmentId;
    private Integer transactionId;
    private String transactionIdStr;
    private byte[] attachment;
    private int activeStatus;
    private Timestamp createDt;
    private Timestamp updateDt;

    public String getTransactionIdStr() {
        return transactionIdStr;
    }

    public void setTransactionIdStr(String transactionIdStr) {
        this.transactionIdStr = transactionIdStr;
    }

    public Integer getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(Integer attachmentId) {
        this.attachmentId = attachmentId;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public byte[] getAttachment() {
        return attachment;
    }

    public void setAttachment(byte[] attachment) {
        this.attachment = attachment;
    }

    public int getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(int activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Timestamp getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Timestamp createDt) {
        this.createDt = createDt;
    }

    public Timestamp getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(Timestamp updateDt) {
        this.updateDt = updateDt;
    }

}
