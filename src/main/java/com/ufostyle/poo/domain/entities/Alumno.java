package com.ufostyle.poo.domain.entities;

public class Alumno {

  private Integer alumnoId;
  private String nombres;
  private String apellidos;

  /**
   * Se implemento este método
   */
  public void mostrarNombre() {
    System.out.println("Hola, soy un alumno y se decir mi nombre");
  }

  /**
   * Se implento este método
   * @param calificacion
   */
  public void saberAprobado(Double calificacion) {
    if (calificacion >= 13) {
      System.out.println("Aprobé la materia");
    }
    else {
      System.out.println("Uyyyyy no aprobé");
    }
  }
}
