package tech.getarrays.employeemanager.model;

import javax.persistence.*;

@Entity
public class Employee{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String year;
    private String emailId;
    private String department;
    private String collegeFees;
    private String hostelFees;
    private String busFees;
    private String totalFees;
    @Column(nullable = false, updatable = false)
    private String employeeCode;

    public Employee() {}

    public Employee(String name, String year, String emailId, String department, String collegeFees, String hostelFees, String busFees, String totalFees,String employeeCode) {
        this.name = name;
        this.year = year;
        this.emailId = emailId;
        this.department = department;
        this.collegeFees = collegeFees;
        this.hostelFees = hostelFees;
        this.busFees = busFees;
        this.totalFees=totalFees;
        this.employeeCode = employeeCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String getCollegeFees() {
        return collegeFees;
    }

    public void setCollegeFees(String collegeFees) {
        this.collegeFees = collegeFees;
    }
    public String getHostelFees() {
        return hostelFees;
    }

    public void setHostelFees(String hostelFees) {
        this.hostelFees = hostelFees;
    }
    public String getBusFees() {
        return busFees;
    }

    public void setBusFees(String busFees) {
        this.busFees = busFees;
    }
    public String getTotalFees() {
        return totalFees;
    }

    public void setTotalFees(String totalFees) {
        this.totalFees = totalFees;
    }
    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", emailId='" + emailId + '\'' +
                ", department='" + department + '\'' +
                ", collegeFees='" + collegeFees + '\'' +
                ", hostelFees='" + hostelFees + '\'' +
                ", busFees='" + busFees + '\'' +
                ", totalFees='" + totalFees + '\'' +
                '}';
    }
}
