package com.doctor;

public class Doctor extends Persona {
	private Especialidades especialidad;

	// Constructor vacío
	public Doctor() {
	}

	// Constructor completo
	public Doctor(String id, String nombre, Especialidades especialidad) {
		super(id, nombre);
		this.especialidad = especialidad;
	}

	public Especialidades getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidades especialidad) {
		this.especialidad = especialidad;
	}
}
