/**
 * 
 */
package com.reactor.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.reactor.demo.model.Persona;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Alejandro.Hurtado
 *
 */
@Repository
public class PersonaRepositoryImpl implements IPersonaRepository{
	
	private static final Logger log = LoggerFactory.getLogger(PersonaRepositoryImpl.class);
	
	@Override
	public Mono<Persona> registrar(Persona p) {
		log.info(p.toString());
		return Mono.just(p);
	}

	@Override
	public Mono<Persona> modificar(Persona p) {
		log.info(p.toString());
		return Mono.just(p);
	}

	@Override
	public Flux<Persona> listar() {
		List<Persona> personas = new ArrayList<>();
		personas.add(new Persona(1, "Daniel", 26));
		personas.add(new Persona(2, "Camila", 24));
		personas.add(new Persona(3, "Pepita", 20));
		
		return Flux.fromIterable(personas);
	}

	@Override
	public Mono<Persona> listarPorId(Integer id) {
		return Mono.just(new Persona(1, "Daniel", 26));
	}

	@Override
	public Mono<Void> eliminar(Integer id) {
		return Mono.empty();
	}
	
}
