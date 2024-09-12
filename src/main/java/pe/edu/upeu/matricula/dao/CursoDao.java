package pe.edu.upeu.matricula.dao;

import java.util.List;

import pe.edu.upeu.matricula.entity.Curso;


public interface CursoDao {
    Curso create(Curso a);
    Curso update(Curso a);
    void delete(Long id);
    Curso read(Long id);
    List<Curso> readAll();
    
}
