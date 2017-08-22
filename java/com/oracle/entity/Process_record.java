package com.oracle.entity;

import java.util.Date;

/**
 * Created by Administrator on 2017/8/22.
 */
public class Process_record {
    private int prid;
    private int empid;
    private int docid;
    private String prtitle;
    private int starus;
    private Date starttime;
    private Date endtime;
    private int backnodeid;

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

    public int getDocid() {
        return docid;
    }

    public void setDocid(int docid) {
        this.docid = docid;
    }

    public String getPrtitle() {
        return prtitle;
    }

    public void setPrtitle(String prtitle) {
        this.prtitle = prtitle;
    }

    public int getStarus() {
        return starus;
    }

    public void setStarus(int starus) {
        this.starus = starus;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public int getBacknodeid() {
        return backnodeid;
    }

    public void setBacknodeid(int backnodeid) {
        this.backnodeid = backnodeid;
    }
}
