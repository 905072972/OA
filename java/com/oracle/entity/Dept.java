package com.oracle.entity;

/**
 * Created by Administrator on 2017/8/22.
 */
public class Dept {
    private int deptid;
    private String deptname;
    private int updeptid;
    private int isuse;

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public int getUpdeptid() {
        return updeptid;
    }

    public void setUpdeptid(int updeptid) {
        this.updeptid = updeptid;
    }

    public int getIsuse() {
        return isuse;
    }

    public void setIsuse(int isuse) {
        this.isuse = isuse;
    }
}
