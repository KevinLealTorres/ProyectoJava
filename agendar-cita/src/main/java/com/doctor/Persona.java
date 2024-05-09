package com.doctor;
/**
 * Clase abstracta que contiene los elementos compartidos por todos los roles
*/
abstract public class Persona {
		private static String id;
		private static String nombre;

		public Persona(String id, String nombre) {
			this.id = id;
			this.nombre = nombre;
		};
}
