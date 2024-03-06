package com.ufostyle.poo.domain.entities;

public class Alumno {

  private Integer alumnoId;
  private String nombres;
  private String apellidos;

  /**
   * Esto es un constructor vacio.
   */
  public Alumno() {
  }

  /**
   * Esto es un constructor con parametros.
   *
   * @param alumnoId
   * @param nombres
   * @param apellidos
   */
  public Alumno(Integer alumnoId, String nombres, String apellidos) {
    this.alumnoId = alumnoId;
    this.nombres = nombres;
    this.apellidos = apellidos;
  }

  public Integer getAlumnoId() {
    return alumnoId;
  }

  public void setAlumnoId(Integer alumnoId) {
    this.alumnoId = alumnoId;
  }

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  /**
   * Se implemento este método.
   */
  public void mostrarNombre() {
    System.out.println("Hola, soy un alumno y se decir mi nombre");
  }

  /**
   * Se implemento este método.
   *
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
