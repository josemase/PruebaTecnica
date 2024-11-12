package com.parameta.test.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//import jakarta.xml.bind.annotation.*;

import java.time.LocalDate;

@Entity
@Table(name = "empleado")
//@XmlRootElement(name = "addEmployeeRequest")
public class Empleado {

    @Column(name = "nombres")
    String name;

    @Column(name = "apellidos")
    String lastname;

    @Column(name = "cargo")
    String role;

    @Column(name = "salario")
    Double salary;

    @Column(name = "fecha_vinculacion")
    LocalDate startDate;

    @Column(name = "fecha_nacimiento")
    LocalDate bornDate;


    @Column(name = "tipo_documento")
    String documentType;

    @Id
    @Column(name = "id_empleado")
    String documentNumber;




    public Empleado(String name, String documentNumber, String documentType, LocalDate bornDate, LocalDate startDate, Double salary, String role, String lastname) {
        this.name = name;
        this.documentNumber = documentNumber;
        this.documentType = documentType;
        this.bornDate = bornDate;
        this.startDate = startDate;
        this.salary = salary;
        this.role = role;
        this.lastname = lastname;

    }

    public Empleado() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }


}
