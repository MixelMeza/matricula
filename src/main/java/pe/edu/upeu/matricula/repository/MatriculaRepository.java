package pe.edu.upeu.matricula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.matricula.entity.Matricula;


@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>{

}
