package pe.edu.upeu.matricula.service;


import java.util.List;

import pe.edu.upeu.matricula.entity.Empleado;




public interface EmpleadoService {
    Empleado create(Empleado a);
    Empleado update(Empleado a);
    void delete(Long id);
    Empleado read(Long id);
    List<Empleado> readAll();
    
}