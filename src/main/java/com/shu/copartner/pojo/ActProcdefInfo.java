package com.shu.copartner.pojo;

import java.io.Serializable;

public class ActProcdefInfo implements Serializable {
    private String id;

    private String procDefId;

    private Integer rev;

    private String infoJsonId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProcDefId() {
        return procDefId;
    }

    public void setProcDefId(String procDefId) {
        this.procDefId = procDefId == null ? null : procDefId.trim();
    }

    public Integer getRev() {
        return rev;
    }

    public void setRev(Integer rev) {
        this.rev = rev;
    }

    public String getInfoJsonId() {
        return infoJsonId;
    }

    public void setInfoJsonId(String infoJsonId) {
        this.infoJsonId = infoJsonId == null ? null : infoJsonId.trim();
    }
}