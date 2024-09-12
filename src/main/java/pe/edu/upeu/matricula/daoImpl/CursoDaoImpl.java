package pe.edu.upeu.matricula.daoImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;

import pe.edu.upeu.matricula.dao.CursoDao;
import pe.edu.upeu.matricula.entity.Curso;
import pe.edu.upeu.matricula.repository.CursoRepository;


@Component
public class CursoDaoImpl  implements CursoDao{
    @Autowired
    private CursoRepository cursoRepository;
	@Override
	public Curso create(Curso c) {
		// TODO Auto-generated method stub
		return cursoRepository.save(c);
	}

	@Override
	public Curso update(Curso c) {
		// TODO Auto-generated method stub
		return cursoRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cursoRepository.deleteById(id);
	}

	@Override
	public Curso read(Long id) {
		// TODO Auto-generated method stub
		return cursoRepository.findById(id).get();
	}

	@Override
	public List<Curso> readAll() {
		// TODO Auto-generated method stub
		return cursoRepository.findAll();
	}

}