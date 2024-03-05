package com.ufostyle.poo;

import com.ufostyle.poo.domain.entities.Alumno;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PooApplication.class, args);

		Alumno alu1 = new Alumno();
		Alumno alu2 = new Alumno(3, "Manolito Manuel", "Rojas Garcia");
	}

}
