package com.oracle.entity;

/**
 * Created by Administrator on 2017/8/22.
 */
public class Process_node_define {
    private int nodeid;
    private int nodeno;
    private int pid;
    private String nodename;
    private int nodetype;
    private int nodebackid;

    public int getNodeid() {
        return nodeid;
    }

    public void setNodeid(int nodeid) {
        this.nodeid = nodeid;
    }

    public int getNodeno() {
        return nodeno;
    }

    public void setNodeno(int nodeno) {
        this.nodeno = nodeno;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename;
    }

    public int getNodetype() {
        return nodetype;
    }

    public void setNodetype(int nodetype) {
        this.nodetype = nodetype;
    }

    public int getNodebackid() {
        return nodebackid;
    }

    public void setNodebackid(int nodebackid) {
        this.nodebackid = nodebackid;
    }
}
