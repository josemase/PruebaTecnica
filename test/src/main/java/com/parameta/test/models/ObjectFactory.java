package com.parameta.test.models;

import jakarta.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public AddEmpleadoRequest createAddEmpleadoRequest() {
        return new AddEmpleadoRequest();
    }

    public AddEmpleadoResponse createAddEmpleadoResponse() {
        return new AddEmpleadoResponse();
    }

    public Empleado createEmpleado() {
        return new Empleado();
    }
}