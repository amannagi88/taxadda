package com.tax.tableentities;

import java.sql.Timestamp;
import java.util.Date;

/**
 * RegPass generated by hbm2java
 */
public class RegPass implements java.io.Serializable {

    private Integer pkId;
    private int registerId;
    private byte[] currentEncrpPassword;
    private byte[] currentEncrpSalt;
    private Timestamp dateCreated;
    private Timestamp dateUpdated;

    public Integer getPkId() {
        return this.pkId;
    }

    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }

    public int getRegisterId() {
        return this.registerId;
    }

    public void setRegisterId(int registerId) {
        this.registerId = registerId;
    }

    public byte[] getCurrentEncrpPassword() {
        return this.currentEncrpPassword;
    }

    public void setCurrentEncrpPassword(byte[] currentEncrpPassword) {
        this.currentEncrpPassword = currentEncrpPassword;
    }

    public byte[] getCurrentEncrpSalt() {
        return this.currentEncrpSalt;
    }

    public void setCurrentEncrpSalt(byte[] currentEncrpSalt) {
        this.currentEncrpSalt = currentEncrpSalt;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Timestamp getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Timestamp dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

}
