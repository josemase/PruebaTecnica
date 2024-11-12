package com.parameta.test.services;

import com.parameta.test.models.Empleado;
import com.parameta.test.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    @Autowired
    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public void saveEmpleado(Empleado empleado) {
        empleadoRepository.save(empleado);
    }
}
