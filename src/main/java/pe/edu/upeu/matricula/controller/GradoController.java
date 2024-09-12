package pe.edu.upeu.matricula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import pe.edu.upeu.matricula.entity.Grado;
import pe.edu.upeu.matricula.service.GradoService;


@RestController
@RequestMapping("/api/grados")
public class GradoController{
	
  
	@Autowired
	private GradoService gradoService;
	@GetMapping
	public ResponseEntity<List<Grado>> readAll(){
		try {
			List<Grado> grados = gradoService.readAll();
			if(grados.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(grados, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PostMapping
	public ResponseEntity<Grado> crear(@Valid @RequestBody Grado gra){
		try {
			Grado g = gradoService.create(gra);
			return new ResponseEntity<>(g, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/{id}")
	public ResponseEntity<Grado> getGradoId(@PathVariable("id") Long id){
		try {
			Grado g = gradoService.read(id);
			return new ResponseEntity<>(g, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Grado> delGrado(@PathVariable("id") Long id){
		try {
			gradoService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateGrado(@PathVariable("id") Long id, @Valid @RequestBody Grado gra){

		Grado g = gradoService.read(id);
			if (g.getId()>0) {
				return new ResponseEntity<>(gradoService.update(gra), HttpStatus.OK);

			} else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		
	}
}