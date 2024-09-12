package pe.edu.upeu.matricula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.matricula.entity.Curso;


@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{

}