// AddEmpleadoResponse.java
package com.parameta.test.models;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "addEmpleadoResponse", namespace = "http://parameta.com/test")
@XmlAccessorType(XmlAccessType.FIELD)
public class AddEmpleadoResponse {

    @XmlElement(namespace = "http://parameta.com/test")
    private String message;

    private Empleado empleado;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}