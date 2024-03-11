package com.ufostyle.poo.domain.entities;

public class Propietario {

  private Long propietarioId;
  private String nombre;
  private String apellido;

  public Propietario() {
  }

  public Propietario(Long propietarioId, String nombre, String apellido) {
    this.propietarioId = propietarioId;
    this.nombre = nombre;
    this.apellido = apellido;
  }

  public Long getPropietarioId() {
    return propietarioId;
  }

  public void setPropietarioId(Long propietarioId) {
    this.propietarioId = propietarioId;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  @Override
  public String toString() {
    return "Propietario{" +
        "propietarioId=" + propietarioId +
        ", nombre='" + nombre + '\'' +
        ", apellido='" + apellido + '\'' +
        '}';
  }
}
