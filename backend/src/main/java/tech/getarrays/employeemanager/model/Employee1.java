package tech.getarrays.employeemanager.model;

import javax.persistence.*;

@Entity
public class Employee1{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String major;
    private String emailId;
    private String Experience;
    private String college;
    private String college1;
    @Column(nullable = false, updatable = false)
    private String employeeCode;

    public Employee1() {}

    public Employee1(String name, String major, String emailId, String Experience, String college, String college1, String employeeCode) {
        this.name = name;
        this.major = major;
        this.emailId = emailId;
        this.Experience = Experience;
        this.college = college;
        this.college1 = college1;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public String getExperience() {
        return Experience;
    }

    public void setExperience(String Experience) {
        this.Experience = Experience;
    }
    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
    public String getCollege1() {
        return college1;
    }

    public void setCollege1(String college1) {
        this.college1 = college1;
    }
    
    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }
    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", emailId='" + emailId + '\'' +
                ", Experience='" + Experience + '\'' +
                ", college='" + college + '\'' +
                ", college1='" + college1 + '\'' +
                '}';
    }
}
