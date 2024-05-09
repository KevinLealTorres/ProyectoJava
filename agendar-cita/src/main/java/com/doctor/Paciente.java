package com.doctor;
public class Paciente extends Persona {
		private Cita cita;

		public Paciente(String id, String nombre, Cita cita) {
				super(id, nombre);
				this.cita = cita;

		}
}
