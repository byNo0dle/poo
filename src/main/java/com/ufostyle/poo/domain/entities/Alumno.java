package com.ufostyle.poo.domain.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Alumno {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long alumnoId;
  private String nombres;
  private String apellidos;
  @Temporal(TemporalType.DATE)
  private Date fechaNac;

  /**
   * Esto es un constructor vacio.
   */
  public Alumno() {
  }

  public Alumno(Long alumnoId, String nombres, String apellidos, Date fechaNac) {
    this.alumnoId = alumnoId;
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.fechaNac = fechaNac;
  }

  public Long getAlumnoId() {
    return alumnoId;
  }

  public void setAlumnoId(Long alumnoId) {
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

  public Date getFechaNac() {
    return fechaNac;
  }

  public void setFechaNac(Date fechaNac) {
    this.fechaNac = fechaNac;
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
