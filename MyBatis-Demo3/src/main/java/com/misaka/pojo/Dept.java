package com.misaka.pojo;

import java.util.List;

public class Dept {

    private Integer did;

    private String deptName;

    private List<Emp> Emps;

    @Override
    public String toString() {
        return "Dept{" +
                "did=" + did +
                ", deptName='" + deptName + '\'' +
                ", Emps=" + Emps +
                '}';
    }

    public List<Emp> getEmps() {
        return Emps;
    }

    public void setEmps(List<Emp> emps) {
        Emps = emps;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
