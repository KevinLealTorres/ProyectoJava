public class Administrador extends Persona {
		private String contrasena;

		public Administrador(String id, String nombre, String contrasena) throws Exception {
				super(id, nombre);
				if(contrasena.length < 4) throw new Exception("Tu contraseña debe tener 4 caracteres o mas");
				this.contrasena = contrasena;
		}

		public void darAltaDoctor(Doctor doctor) {
				//logica
		}

		public void darAltaPaciente(Paciente paciente) {
				//logica
		}

		public void agendarCita(Cita cita) {
				//logica
		}

		public void verCalendario() {
				//logica
		}
}
