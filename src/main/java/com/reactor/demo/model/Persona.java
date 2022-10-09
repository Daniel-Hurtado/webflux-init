/**
 * 
 */
package com.reactor.demo.model;

/**
 * @author Alejandro.Hurtado
 *
 */
public class Persona {
	private Integer idPersona;
	private String nombres;
	private Integer edad;
	
	/**
	 * @param idPersona
	 * @param nombres
	 * @param edad
	 */
	public Persona(Integer idPersona, String nombres, Integer edad) {
		super();
		this.idPersona = idPersona;
		this.nombres = nombres;
		this.edad = edad;
	}
	
	/**
	 * @return the idPersona
	 */
	public Integer getIdPersona() {
		return idPersona;
	}
	/**
	 * @param idPersona the idPersona to set
	 */
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}
	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}
	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	/**
	 * @return the edad
	 */
	public Integer getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombres=" + nombres + ", edad=" + edad + "]";
	}
}
