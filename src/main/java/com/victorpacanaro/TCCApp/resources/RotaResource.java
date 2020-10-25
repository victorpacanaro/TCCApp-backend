package com.victorpacanaro.TCCApp.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.victorpacanaro.TCCApp.domain.Rotas;
import com.victorpacanaro.TCCApp.services.RotasService;

@RestController
@RequestMapping(value="/rotas") //endpoint rest 
public class RotaResource {
	
	@Autowired
	private RotasService service; 
	
	@RequestMapping (value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Rotas obj = service.find(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
