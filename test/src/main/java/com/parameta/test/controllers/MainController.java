package com.parameta.test.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.parameta.test.clients.EmpleadoClient;
import com.parameta.test.models.AddEmpleadoRequest;
import com.parameta.test.models.AddEmpleadoResponse;
import com.parameta.test.models.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    private EmpleadoClient empleadoClient;

    private static final DateTimeFormatter dateWell = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @PostMapping
    public ResponseEntity<String> validator(@RequestParam(value = "Nombres", required = false) String name,
                                            @RequestParam(value = "Apellidos", required = false) String lastname,
                                            @RequestParam(value = "TipoDocumento", required = false) String typeId,
                                            @RequestParam(value = "NDocumento", required = false) String numberId,
                                            @RequestParam(value = "FechaNacimiento", required = false) String bornDate, // YYYY-MM-DD
                                            @RequestParam(value = "FechaVinculacion", required = false) String startDate, // YYYY-MM-DD
                                            @RequestParam(value = "Cargo", required = false) String role,
                                            @RequestParam(value = "Salario", required = false) String salary) {

        if (name == null || lastname == null || typeId == null || numberId == null || bornDate == null || startDate == null || role == null || salary == null) {
            return new ResponseEntity<>("{ Ningun parametro puede estar vacio }", HttpStatus.BAD_REQUEST);
        } else if (!validateFormat(bornDate) || !validateFormat(startDate)) {
            return new ResponseEntity<>("{ Las fechas tienen que estas en el siguiente formato: YYYY-MM-DD }", HttpStatus.BAD_REQUEST);
        } else if (!isLegalAge(LocalDate.parse(bornDate, dateWell))) {
            return new ResponseEntity<>("{ El empleado ingresado debe ser mayor de edad }", HttpStatus.UNPROCESSABLE_ENTITY);
        } else if (!isDoubleSalary(salary)) {
            return new ResponseEntity<>("{ El salario ingresado debe ser un numero }", HttpStatus.UNPROCESSABLE_ENTITY);
        }
        Double salarySent = Double.parseDouble(salary);
        Empleado chucho = new Empleado(name, numberId, typeId, LocalDate.parse(bornDate, dateWell), LocalDate.parse(startDate, dateWell), salarySent, role, lastname);
        AddEmpleadoRequest request = new AddEmpleadoRequest();
        request.setName(chucho.getName());
        request.setLastname(chucho.getLastname());
        request.setRole(chucho.getRole());
        request.setSalary(chucho.getSalary());
        request.setStartDate(chucho.getStartDate().toString());
        request.setBornDate(chucho.getBornDate().toString());
        request.setDocumentType(chucho.getDocumentType());
        request.setDocumentNumber(chucho.getDocumentNumber());
        AddEmpleadoResponse response = empleadoClient.addClientToDB(request);
        System.out.println(response.getMessage());
        return new ResponseEntity<>(getJson(chucho), HttpStatus.OK);
    }

    public static boolean validateFormat(String dateTest) {
        try {
            LocalDate.parse(dateTest, dateWell);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    private static boolean isLegalAge(LocalDate dateTest) {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dateTest, currentDate);
        return period.getYears() >= 18;
    }

    private static boolean isDoubleSalary(String salary) {
        try {
            Double.parseDouble(salary);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static String getJson(Empleado chucho)
    {
        int ageYears = (chucho.getBornDate().getYear()-LocalDate.now().getYear())*-1;
        int ageMonths = (chucho.getBornDate().getMonthValue()-LocalDate.now().getMonthValue())*-1;
        int ageDays = (chucho.getBornDate().getDayOfMonth()-LocalDate.now().getDayOfMonth());
        int bindingYears = (chucho.getStartDate().getYear()-LocalDate.now().getYear())*-1;
        int bindingMonths = (chucho.getStartDate().getMonthValue()-LocalDate.now().getMonthValue())*-1;
        int bindingDays = (chucho.getStartDate().getDayOfMonth()-LocalDate.now().getDayOfMonth());
        try {
        Map<String, Object> data = new HashMap<>();
        data.put("name", chucho.getName());
        data.put("lastName", chucho.getLastname());
        data.put("tipoDocumento", chucho.getDocumentType());
        data.put("numeroDocumento", chucho.getDocumentNumber());
        data.put("fechaNacimiento", ageYears+" años, "+ageMonths+" meses, "+ageDays+" dias");
        data.put("fechaVinculacion", bindingYears+" años, "+bindingMonths+" meses, "+bindingDays+" dias");
        data.put("cargo", chucho.getRole());
        data.put("salario", chucho.getSalary());
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(data);
        return jsonString;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}