package com.ufostyle.poo.domain.entities;

public class Persona {

  private Integer personaId;
  private String nombre;
  private Integer edad;

  public Persona() {
  }

  public Persona(Integer personaId, String nombre, Integer edad) {
    this.personaId = personaId;
    this.nombre = nombre;
    this.edad = edad;
  }

  public Integer getPersonaId() {
    return personaId;
  }

  public void setPersonaId(Integer personaId) {
    this.personaId = personaId;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Integer getEdad() {
    return edad;
  }

  public void setEdad(Integer edad) {
    this.edad = edad;
  }

  @Override
  public String toString() {
    return "Persona{" +
        "personaId=" + personaId +
        ", nombre='" + nombre + '\'' +
        ", edad=" + edad +
        '}';
  }
}
