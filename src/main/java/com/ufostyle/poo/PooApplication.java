package com.ufostyle.poo;

import com.ufostyle.poo.domain.entities.*;
import com.ufostyle.poo.domain.herencia.Consultor;
import com.ufostyle.poo.domain.herencia.Empleado;
import com.ufostyle.poo.domain.polimorfismo.Jefe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

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

		/*Pikachu pikachu = new Pikachu();
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
		pikachu.atacarImpactrueno();*/

		// Agregar nuevos elementos a una lista.
		List<Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona(1, "Junior Raúl", 29));
		lista.add(new Persona(2, "Jostin Samuel", 23));
		lista.add(new Persona(3, "Marco Polo", 25));
		lista.add(new Persona(4, "Jamer Martín", 20));

		List<Alumno> listaAlumno = new ArrayList<Alumno>();
		listaAlumno.add(new Alumno(1, "Nick Francis", "Rojas Guerra"));
		listaAlumno.add(new Alumno(2, "Celia Rosa", "Villacorta Gonzales"));
		listaAlumno.add(new Alumno(3, "Genezareth Camini", "Vasquez Sabino"));
		listaAlumno.add(new Alumno(4, "Kevin", "Torres Camacho"));

		List<Animal> listaAnimal = new ArrayList<Animal>();
		listaAnimal.add(new Animal(1, "Es un perro bajito de color negro"));
		listaAnimal.add(new Animal(2, "Es un gato color blanco con manchas grises"));
		listaAnimal.add(new Animal(3, "Es color marron con poco de negro y en su pecho tiene color blanco y come mucho"));

		System.out.println("----------------------FOR---------------------");
		// Recorrer una lista por índice
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("Esto es la listaPersona: " + lista.get(i).getNombre());
		}

		System.out.println("---------------------FOREACH----------------------");
		// Recorrido foreach
		for (Persona perso:lista) {
			System.out.println("Esto es la listaPersona: " + perso.getNombre());
		}
	}

}
