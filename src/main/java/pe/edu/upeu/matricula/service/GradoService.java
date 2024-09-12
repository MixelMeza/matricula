package pe.edu.upeu.matricula.service;


import java.util.List;

import pe.edu.upeu.matricula.entity.Grado;




public interface GradoService {
    Grado create(Grado a);
    Grado update(Grado a);
    void delete(Long id);
    Grado read(Long id);
    List<Grado> readAll();
    
}
