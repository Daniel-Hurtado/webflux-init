/**
 * 
 */
package com.reactor.demo.repository;

import com.reactor.demo.model.Persona;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Alejandro.Hurtado
 *
 */
public interface IPersonaRepository {
	
	Mono<Persona> registrar(Persona p);
	
	Mono<Persona> modificar(Persona p); 
	
	Flux<Persona> listar();
	
	Mono<Persona> listarPorId(Integer id);
	
	Mono<Void> eliminar(Integer id);
}
