package com.reactor.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reactor.demo.model.Persona;
import com.reactor.demo.repository.IPersonaRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/personas")
public class PersonaController {
	
	private static final Logger log = LoggerFactory.getLogger(PersonaController.class);
	
	@Autowired
	private IPersonaRepository repo;
	
	@GetMapping
	public Flux<Persona> listar(){
		return repo.listar();
	}
	
	@GetMapping("/listar-por-id")
	public Mono<Persona> listarPorId(@RequestParam Integer id){
		return repo.listarPorId(id);
	}
	
	@PostMapping
	public Mono<Persona> registrar(@RequestBody Persona p){
		return repo.registrar(p);
	}
	
	@PutMapping
	public Mono<Persona> modificar(@RequestBody Persona p){
		return repo.modificar(p);
	}
	
	@DeleteMapping
	public Mono<Void> eliminar(@RequestParam Integer id){
		return repo.eliminar(id);
	}
}
