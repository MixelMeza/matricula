package pe.edu.upeu.matricula.daoImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;

import pe.edu.upeu.matricula.dao.GradoDao;
import pe.edu.upeu.matricula.entity.Grado;
import pe.edu.upeu.matricula.repository.GradoRepository;


@Component
public class GradoDaoImpl  implements GradoDao{
    @Autowired
    private GradoRepository gradoRepository;
	@Override
	public Grado create(Grado g) {
		// TODO Auto-generated method stub
		return gradoRepository.save(g);
	}

	@Override
	public Grado update(Grado g) {
		// TODO Auto-generated method stub
		return gradoRepository.save(g);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		gradoRepository.deleteById(id);
	}

	@Override
	public Grado read(Long id) {
		// TODO Auto-generated method stub
		return gradoRepository.findById(id).get();
	}

	@Override
	public List<Grado> readAll() {
		// TODO Auto-generated method stub
		return gradoRepository.findAll();
	}

}