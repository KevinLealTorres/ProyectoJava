package com.doctor; 
import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("""
				Agendador de citas:
				1) Agendar cita:
				2) Dar de alta doctor
				3) Dar de alta paciente
				>>>\s""");

		
		sc.close();	
	}
}
