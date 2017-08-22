package com.oracle.entity;

/**
 * Created by Administrator on 2017/8/22.
 */
public class Document_form {
    private int fieldid;
    private int prid;
    private  int docid;
    private String fieldtag;
    private String fieldnaem;
    private  String fieldvalue;

    public int getFieldid() {
        return fieldid;
    }

    public void setFieldid(int fieldid) {
        this.fieldid = fieldid;
    }

    public int getPrid() {
        return prid;
    }

    public void setPrid(int prid) {
        this.prid = prid;
    }

    public int getDocid() {
        return docid;
    }

    public void setDocid(int docid) {
        this.docid = docid;
    }

    public String getFieldtag() {
        return fieldtag;
    }

    public void setFieldtag(String fieldtag) {
        this.fieldtag = fieldtag;
    }

    public String getFieldnaem() {
        return fieldnaem;
    }

    public void setFieldnaem(String fieldnaem) {
        this.fieldnaem = fieldnaem;
    }

    public String getFieldvalue() {
        return fieldvalue;
    }

    public void setFieldvalue(String fieldvalue) {
        this.fieldvalue = fieldvalue;
    }
}
