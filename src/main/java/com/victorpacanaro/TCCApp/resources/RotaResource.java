package com.victorpacanaro.TCCApp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.victorpacanaro.TCCApp.domain.Rotas;

@RestController
@RequestMapping(value="/rotas") //endpoint rest 
public class RotaResource {
	
	@RequestMapping (method = RequestMethod.GET)
	public List<Rotas> listar() {
		
		Rotas rot1 = new Rotas(1, "Rota A");
		Rotas rot2 = new Rotas(2, "Rota B");
		
		List<Rotas> lista = new ArrayList<>();
		lista.add(rot1);
		lista.add(rot2);
		
		return lista;
		
	}

}
