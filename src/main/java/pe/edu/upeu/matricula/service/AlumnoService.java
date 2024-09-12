package pe.edu.upeu.matricula.service;

import java.util.List;

import pe.edu.upeu.matricula.entity.Alumno;




public interface AlumnoService {
    Alumno create(Alumno a);
    Alumno update(Alumno a);
    void delete(Long id);
    Alumno read(Long id);
    List<Alumno> readAll();
    
}