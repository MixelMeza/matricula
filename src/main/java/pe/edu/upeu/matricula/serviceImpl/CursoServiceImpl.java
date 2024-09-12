package pe.edu.upeu.matricula.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import pe.edu.upeu.matricula.dao.CursoDao;
import pe.edu.upeu.matricula.entity.Curso;
import pe.edu.upeu.matricula.service.CursoService;


@Service
public class CursoServiceImpl implements CursoService{
    @Autowired
    private CursoDao cursoDao;
	@Override
	public Curso create(Curso c) {
		// TODO Auto-generated method stub
		return cursoDao.create(c);
	}

	@Override
	public Curso update(Curso c) {
		// TODO Auto-generated method stub
		return cursoDao.update(c);
	}

	@Override
	public void delete(Long id) {
		cursoDao.delete(id);
		
	}

	@Override
	public Curso read(Long id) {
		// TODO Auto-generated method stub
		return cursoDao.read(id);
	}

	@Override
	public List<Curso> readAll() {
		// TODO Auto-generated method stub
		return cursoDao.readAll();
	}

}
