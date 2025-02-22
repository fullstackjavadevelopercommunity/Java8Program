package com.manjeet.stream;

import java.util.Date;

public class Employee {
        private int empId;
        private String empName;
        private Double empSalary;
        private Date empJoiningDate;
        private String empGender;

        public Employee() {
        }

        public Employee(int empId, String empName, Double empSalary, Date empJoiningDate, String empGender) {
            this.empId = empId;
            this.empName = empName;
            this.empSalary = empSalary;
            this.empJoiningDate = empJoiningDate;
            this.empGender = empGender;
        }

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

        public Double getEmpSalary() {
            return empSalary;
        }

        public void setEmpSalary(Double empSalary) {
            this.empSalary = empSalary;
        }

        public Date getEmpJoiningDate() {
            return empJoiningDate;
        }

        public void setEmpJoiningDate(Date empJoiningDate) {
            this.empJoiningDate = empJoiningDate;
        }

        public String getEmpGender() {
            return empGender;
        }

        public void setEmpGender(String empGender) {
            this.empGender = empGender;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "empId=" + empId +
                    ", empName='" + empName + '\'' +
                    ", empSalary=" + empSalary +
                    ", empJoiningDate=" + empJoiningDate +
                    ", empGender='" + empGender + '\'' +
                    '}';
        }
    }
