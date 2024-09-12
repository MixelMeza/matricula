package pe.edu.upeu.matricula.service;

import java.util.List;

import pe.edu.upeu.matricula.entity.Matricula;


public interface MatriculaService {
    Matricula create(Matricula a);
    Matricula update(Matricula a);
    void delete(Long id);
    Matricula read(Long id);
    List<Matricula> readAll();
    
}
