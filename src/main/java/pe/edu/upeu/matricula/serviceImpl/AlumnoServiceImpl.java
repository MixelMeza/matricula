package pe.edu.upeu.matricula.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import pe.edu.upeu.matricula.dao.AlumnoDao;
import pe.edu.upeu.matricula.entity.Alumno;
import pe.edu.upeu.matricula.service.AlumnoService;


@Service
public class AlumnoServiceImpl implements AlumnoService{
    @Autowired
    private AlumnoDao alumnoDao;
	@Override
	public Alumno create(Alumno a) {
		// TODO Auto-generated method stub
		return alumnoDao.create(a);
	}

	@Override
	public Alumno update(Alumno a) {
		// TODO Auto-generated method stub
		return alumnoDao.update(a);
	}

	@Override
	public void delete(Long id) {
		alumnoDao.delete(id);
		
	}

	@Override
	public Alumno read(Long id) {
		// TODO Auto-generated method stub
		return alumnoDao.read(id);
	}

	@Override
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		return alumnoDao.readAll();
	}

}