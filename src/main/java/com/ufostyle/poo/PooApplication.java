package com.ufostyle.poo;

import com.ufostyle.poo.domain.entities.*;
import com.ufostyle.poo.domain.herencia.Consultor;
import com.ufostyle.poo.domain.herencia.Empleado;
import com.ufostyle.poo.domain.polimorfismo.Jefe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

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

		/*// Agregar nuevos elementos a una lista.
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
		}*/

		/*// Utilizando LinkedList
		List<Persona> lista = new LinkedList<Persona>();
		// Agregar personas al final de la lista
		lista.add(new Persona(1, "Junior Raúl", 29));
		lista.add(new Persona(2, "Jostin Samuel", 23));
		lista.add(new Persona(3, "Marco Polo", 25));
		lista.add(new Persona(4, "Jamer Martín", 20));

		// Agregar al principio
		lista.add(0, new Persona(5, "Manolito Manuel", 98));

		System.out.println("---------------------FOREACH----------------------");
		// Recorrido foreach
		for (Persona perso:lista) {
			System.out.println("Esto es la listaPersona: " + perso.getNombre());
		}*/

		/*List<Persona> listaArray = new ArrayList<Persona>();
		listaArray.add(new Persona(1, "Junior Raúl", 29));
		listaArray.add(new Persona(2, "Jostin Samuel", 23));
		listaArray.add(new Persona(3, "Marco Polo", 25));
		listaArray.add(new Persona(4, "Jamer Martín", 20));

		LinkedList<Persona> listaLinked = new LinkedList<Persona>();
		listaLinked.add(new Persona(1, "Junior Raúl", 29));
		listaLinked.add(new Persona(2, "Jostin Samuel", 23));
		listaLinked.add(new Persona(3, "Marco Polo", 25));
		listaLinked.add(new Persona(4, "Jamer Martín", 20));*/

		/*// Remove en ArrayList
		listaArray.remove(1);

		//Remove en LinkedList
		String nombreBorrar = "Jostin Samuel";
		for (Persona persona2 : listaLinked) {
			if (persona2.getNombre().equals(nombreBorrar)) {
				listaLinked.remove(persona2);
				break;	// corto que deje de recorrer
			}
		}

		System.out.println("---------- Luego de eliminar ----------");
		// Recorrido por ForEach
		System.out.println("------- ArrayList -------");
		for (Persona persona : listaArray) {
			System.out.println("Prueba: " + persona.getNombre());
		}

		System.out.println("---------- LinkedList -----------");
		for (Persona persona : listaLinked) {
			System.out.println("Prueba: " + persona.getNombre());
		}

		// Tamaño Lista
		System.out.println("--- Que tamaño tienen las listas?? ---");
		System.out.println("ArrayList: " + listaArray.size());
		System.out.println("LinkedList: " + listaLinked.size());

		// Obtener primer objeto y ultimo con LinkedList
		System.out.println("--- Primer y Ultimo objeto (solo para LinkedList) ---");
		System.out.println("Primero de LinkedList: " + listaLinked.getFirst().toString());
		System.out.println("Ultimo de LinkedList: " + listaLinked.getLast().toString());

		// Borrar toda la lista
		System.out.println("------- Borrando listas -------");
		listaArray.clear();
		listaLinked.clear();

		// Comprobar si esta vacía
		System.out.println("----- Esta vacía alguna lista?? -----");
		System.out.println("ArrayList: " + listaArray.isEmpty());
		System.out.println("LinkedList: " + listaLinked.isEmpty());*/

		/*Stack<Integer> pila = new Stack<Integer>();

		System.out.println("Pila vacía: " + pila);
		System.out.println("Esta vacía? " + pila.isEmpty());

		// Agregar
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		pila.push(5);

		// Recorrido
		for (Integer pilita : pila) {
			System.out.println(pilita);
		}

		// Mostrar
		System.out.println("Pila: " + pila);
		System.out.println("Pila está vacía: " + pila.isEmpty());

		pila.pop();	// Eliminar el último registro que entró
		System.out.println("Está el número 3? " + pila.search(3));
		System.out.println("Último agregado: " + pila.peek());*/

		/*Map<Integer, String> mapaEmpleados = new HashMap<>();
		mapaEmpleados.put(2037, "Kevin");
		mapaEmpleados.put(2038, "Ivan");
		mapaEmpleados.put(2039, "Fabio");*/

		/*boolean estaono = mapaEmpleados.containsKey(2038);
		//boolean estaono = mapaEmpleados.containsValue("Camini");

		if (estaono == true) {
			System.out.println("El valor buscado está");
		}
		else {
			System.out.println("El valor buscado no existe");
		}*/

		//System.out.println(mapaEmpleados.values());
		//System.out.println(mapaEmpleados.keySet());

		//String nombre = mapaEmpleados.get(2039);
		//System.out.println("El empleado buscado es: " + nombre);

		//mapaEmpleados.remove(2037);


		try {
			Integer resultado = 3/0;
		}
		catch (Exception exception) {
			System.out.println("No se puede dividir por cero!!!");
		}

		Integer edades [] = {10, 20, 30, 40};
		try {
			System.out.println("La edad de la posición 4 es: " + edades [4]);
		}
		catch (Exception exception) {
			System.out.println("Intentaste acceder a un índice que no existe");
		}

	}

}
