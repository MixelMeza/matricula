package pe.edu.upeu.matricula.dao;

import java.util.List;

import pe.edu.upeu.matricula.entity.Matricula;


public interface MatriculaDao {
    Matricula create(Matricula a);
    Matricula update(Matricula a);
    void delete(Long id);
    Matricula read(Long id);
    List<Matricula> readAll();
    
}
