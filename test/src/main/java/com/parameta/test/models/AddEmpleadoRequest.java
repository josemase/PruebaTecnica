package com.parameta.test.models;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "addEmpleadoRequest", namespace = "http://parameta.com/test")
@XmlAccessorType(XmlAccessType.FIELD)
public class AddEmpleadoRequest {
    @XmlElement(namespace = "http://parameta.com/test")
    private String name;
    @XmlElement(namespace = "http://parameta.com/test")
    private String lastname;
    @XmlElement(namespace = "http://parameta.com/test")
    private String role;
    @XmlElement(namespace = "http://parameta.com/test")
    private Double salary;
    @XmlElement(namespace = "http://parameta.com/test")
    private String startDate;
    @XmlElement(namespace = "http://parameta.com/test")
    private String bornDate;
    @XmlElement(namespace = "http://parameta.com/test")
    private String documentType;
    @XmlElement(namespace = "http://parameta.com/test")
    private String documentNumber;
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getBornDate() {
        return bornDate;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }
}