package pe.edu.upeu.matricula.daoImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;

import pe.edu.upeu.matricula.dao.MatriculaDao;
import pe.edu.upeu.matricula.entity.Matricula;
import pe.edu.upeu.matricula.repository.MatriculaRepository;


@Component
public class MatriculaDaoImpl  implements MatriculaDao{
    @Autowired
    private MatriculaRepository matriculaRepository;
	@Override
	public Matricula create(Matricula m) {
		// TODO Auto-generated method stub
		return matriculaRepository.save(m);
	}

	@Override
	public Matricula update(Matricula m) {
		// TODO Auto-generated method stub
		return matriculaRepository.save(m);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		matriculaRepository.deleteById(id);
	}

	@Override
	public Matricula read(Long id) {
		// TODO Auto-generated method stub
		return matriculaRepository.findById(id).get();
	}

	@Override
	public List<Matricula> readAll() {
		// TODO Auto-generated method stub
		return matriculaRepository.findAll();
	}

}