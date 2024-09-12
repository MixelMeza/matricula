package pe.edu.upeu.matricula.service;

import java.util.List;

import pe.edu.upeu.matricula.entity.Curso;




public interface CursoService {
    Curso create(Curso a);
    Curso update(Curso a);
    void delete(Long id);
    Curso read(Long id);
    List<Curso> readAll();
    
}