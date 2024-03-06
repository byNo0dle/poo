package com.ufostyle.poo.domain.herencia;

public class Persona {

  private Integer personaId;
  private String dni;
  private String nombres;
  private String apellidos;
  private String domicilio;
  private String telefono;

  public Persona() {
  }

  public Persona(Integer personaId, String dni, String nombres, String apellidos, String domicilio, String telefono) {
    this.personaId = personaId;
    this.dni = dni;
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.domicilio = domicilio;
    this.telefono = telefono;
  }

  public Integer getPersonaId() {
    return personaId;
  }

  public void setPersonaId(Integer personaId) {
    this.personaId = personaId;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
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

  public String getDomicilio() {
    return domicilio;
  }

  public void setDomicilio(String domicilio) {
    this.domicilio = domicilio;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }
}
