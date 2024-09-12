package pe.edu.upeu.matricula.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import pe.edu.upeu.matricula.dao.GradoDao;
import pe.edu.upeu.matricula.entity.Grado;
import pe.edu.upeu.matricula.service.GradoService;


@Service
public class GradoServiceImpl implements GradoService{
    @Autowired
    private GradoDao gradoDao;
	@Override
	public Grado create(Grado g) {
		// TODO Auto-generated method stub
		return gradoDao.create(g);
	}

	@Override
	public Grado update(Grado g) {
		// TODO Auto-generated method stub
		return gradoDao.update(g);
	}

	@Override
	public void delete(Long id) {
		gradoDao.delete(id);
		
	}

	@Override
	public Grado read(Long id) {
		// TODO Auto-generated method stub
		return gradoDao.read(id);
	}

	@Override
	public List<Grado> readAll() {
		// TODO Auto-generated method stub
		return gradoDao.readAll();
	}

}