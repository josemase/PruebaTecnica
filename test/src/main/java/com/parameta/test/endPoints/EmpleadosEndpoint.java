package com.parameta.test.endPoints;

import com.parameta.test.models.AddEmpleadoRequest;
import com.parameta.test.models.AddEmpleadoResponse;
import com.parameta.test.models.Empleado;
import com.parameta.test.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Endpoint
public class EmpleadosEndpoint {
    private static final String NAMESPACE_URI = "http://parameta.com/test";

    private final EmpleadoService empleadoService;
    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Autowired
    public EmpleadosEndpoint(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addEmpleadoRequest")
    @ResponsePayload
    public AddEmpleadoResponse addEmpleado(@RequestPayload AddEmpleadoRequest request) {
        System.out.println("Este es el request"+request);
        LocalDate bornDate = LocalDate.parse(request.getBornDate(), dateFormatter);
        LocalDate startDate = LocalDate.parse(request.getStartDate(), dateFormatter);
        Empleado chucho = new Empleado(
                request.getName(),
                request.getDocumentNumber(),
                request.getDocumentType(),
                bornDate,
                startDate,
                request.getSalary(),
                request.getRole(),
                request.getLastname()
        );
        empleadoService.saveEmpleado(chucho);

        AddEmpleadoResponse response = new AddEmpleadoResponse();
        response.setMessage("Empleado added successfully");
        return response;
    }
}