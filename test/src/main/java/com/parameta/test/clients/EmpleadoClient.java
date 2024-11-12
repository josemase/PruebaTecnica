package com.parameta.test.clients;

import com.parameta.test.models.AddEmpleadoRequest;
import com.parameta.test.models.AddEmpleadoResponse;
import com.parameta.test.models.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


@Component
public class EmpleadoClient extends WebServiceGatewaySupport {

    public AddEmpleadoResponse addClientToDB(AddEmpleadoRequest request) {
        SoapActionCallback callback = new SoapActionCallback("http://tempuri.org/addEmployeeRequest");
        return (AddEmpleadoResponse) getWebServiceTemplate().marshalSendAndReceive("http://localhost:8080/ws", request, callback);


    }





















    //
    /*public AddEmpleadoResponse sendEmpleado(AddEmpleadoRequest elChucho) {

        webServiceTemplate.setDefaultUri("http://localhost:8080/ws");


        return (AddEmpleadoResponse) webServiceTemplate.marshalSendAndReceive("http://localhost:8080/ws", elChucho);
    }*/
}
