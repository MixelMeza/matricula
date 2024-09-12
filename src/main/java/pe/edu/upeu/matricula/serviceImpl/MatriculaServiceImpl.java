package pe.edu.upeu.matricula.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import pe.edu.upeu.matricula.dao.MatriculaDao;
import pe.edu.upeu.matricula.entity.Matricula;
import pe.edu.upeu.matricula.service.MatriculaService;


@Service
public class MatriculaServiceImpl implements MatriculaService{
    @Autowired
    private MatriculaDao matriculaDao;
	@Override
	public Matricula create(Matricula m) {
		// TODO Auto-generated method stub
		return matriculaDao.create(m);
	}

	@Override
	public Matricula update(Matricula m) {
		// TODO Auto-generated method stub
		return matriculaDao.update(m);
	}

	@Override
	public void delete(Long id) {
		matriculaDao.delete(id);
		
	}

	@Override
	public Matricula read(Long id) {
		// TODO Auto-generated method stub
		return matriculaDao.read(id);
	}

	@Override
	public List<Matricula> readAll() {
		// TODO Auto-generated method stub
		return matriculaDao.readAll();
	}

}