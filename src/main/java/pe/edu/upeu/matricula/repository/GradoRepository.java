package pe.edu.upeu.matricula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.matricula.entity.Grado;


@Repository
public interface GradoRepository extends JpaRepository<Grado, Long>{

}
