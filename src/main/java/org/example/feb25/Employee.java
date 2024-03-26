package org.example.feb25;

import java.util.Date;

public class Employee {
    private int empId;
    private String empName;
    private String empAddress;
    private double empSal;
    private long empMobile;
    private String department;
    private String doj;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }

    public long getEmpMobile() {
        return empMobile;
    }

    public void setEmpMobile(long empMobile) {
        this.empMobile = empMobile;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", empSal=" + empSal +
                ", empMobile=" + empMobile +
                ", department='" + department + '\'' +
                ", doj=" + doj +
                '}';
    }
}
