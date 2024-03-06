package com.ufostyle.poo;

import com.ufostyle.poo.domain.entities.*;
import com.ufostyle.poo.domain.herencia.Consultor;
import com.ufostyle.poo.domain.herencia.Empleado;
import com.ufostyle.poo.domain.herencia.Persona;
import com.ufostyle.poo.domain.polimorfismo.Jefe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PooApplication.class, args);

		/*Alumno alu1 = new Alumno();
		Alumno alu2 = new Alumno(4, "Manolito Manuel", "Rojas Garcia");

		System.out.println("El código del alumno2 es: " + alu2.getAlumnoId());
		System.out.println("El nombre del alumno es: " + alu2.getNombres());
		System.out.println("El apellido del alumno es: " + alu2.getApellidos());

		alu1.setAlumnoId(3);
		alu1.setNombres("Kevin");
		alu1.setApellidos("Torres Camacho");

		System.out.println("------------------------------------------");
		System.out.println("El código del alumno1 es: " + alu1.getAlumnoId());
		System.out.println("El nombre del alumno es: " + alu1.getNombres());
		System.out.println("El apellido del alumno es: " + alu1.getApellidos());

		// Aca modificamos el código del alumno2
		alu2.setAlumnoId(40);

		System.out.println("------------------------------------------");
		System.out.println("El código del alumno2 es: " + alu2.getAlumnoId());
		System.out.println("El nombre del alumno es: " + alu2.getNombres());
		System.out.println("El apellido del alumno es: " + alu2.getApellidos());*/

		/*Empleado emple = new Empleado();
		emple.getNum_legajo();
		emple.getNombres();

		Consultor consul = new Consultor();
		consul.getNum_consultor();
		consul.getNombres();*/

		/*Persona vector [] = new Persona[5];
		vector [0] = new Persona();
		vector [1] = new Empleado();
		vector [2] = new Consultor();
		vector [3] = new Jefe();

		Persona perso = new Persona();
		Consultor consul = new Consultor();

		perso = consul;*/

		/*Alumno alu1 = new Alumno();
		Alumno alu2 = new Alumno(4, "Manolito Manuel", "Rojas Garcia");

		System.out.println("alumnoId: " + alu2.getAlumnoId());
		System.out.println("nombres: " + alu2.getNombres());
		System.out.println("apellidos: " + alu2.getApellidos());*/

		Pikachu pikachu = new Pikachu();
		Charmander charmander = new Charmander();
		Squirtle squirtle = new Squirtle();
		Bulbasaur bulbasaur = new Bulbasaur();

		squirtle.atacarAraniazo();
		squirtle.atacarHidrobomba();
		charmander.atacarAraniazo();
		charmander.atacarLanzaLlamas();
		bulbasaur.atacarAraniazo();
		bulbasaur.atacarDrenaje();
		pikachu.atacarAraniazo();
		pikachu.atacarImpactrueno();
	}

}
