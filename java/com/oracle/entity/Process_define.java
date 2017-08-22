package com.oracle.entity;

/**
 * Created by Administrator on 2017/8/22.
 */
public class Process_define {
    private int pid;
    private String pname;
    private int docid;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getDocid() {
        return docid;
    }

    public void setDocid(int docid) {
        this.docid = docid;
    }
}
