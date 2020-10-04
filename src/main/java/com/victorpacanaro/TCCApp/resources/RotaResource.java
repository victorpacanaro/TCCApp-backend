package com.victorpacanaro.TCCApp.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/rotas")
public class RotaResource {
	
	@RequestMapping (method = RequestMethod.GET)
	public String listar () {
		return "REST está funcionando";
		
	}

}
