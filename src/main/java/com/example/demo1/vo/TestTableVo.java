package com.example.demo1.vo;

public class TestTableVo {
    private int deptNo;
    private String dName;

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
    private String loc;

    @Override
    public String toString() {
        return "TestTableVo{" +
                "deptNo=" + deptNo +
                ", dName='" + dName + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }

}
