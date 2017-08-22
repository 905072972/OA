package com.oracle.entity;

import java.util.Date;

/**
 * Created by Administrator on 2017/8/22.
 */
public class Process_node_record {
    private int pnrid;
    private int nodeid;
    private int prid;
    private int empid;
    private int isagree;
    private String advice;
    private Date pnrtime;

    public int getPnrid() {
        return pnrid;
    }

    public void setPnrid(int pnrid) {
        this.pnrid = pnrid;
    }

    public int getNodeid() {
        return nodeid;
    }

    public void setNodeid(int nodeid) {
        this.nodeid = nodeid;
    }

    public int getPrid() {
        return prid;
    }

    public void setPrid(int prid) {
        this.prid = prid;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getIsagree() {
        return isagree;
    }

    public void setIsagree(int isagree) {
        this.isagree = isagree;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public Date getPnrtime() {
        return pnrtime;
    }

    public void setPnrtime(Date pnrtime) {
        this.pnrtime = pnrtime;
    }
}
