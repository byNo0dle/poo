package com.ufostyle.poo.domain.polimorfismo;

import com.ufostyle.poo.domain.herencia.Persona;

public class Jefe extends Persona {

  private Integer jefeId;
  private String departamento_jefe;

  public Jefe() {
  }

  public Jefe(Integer personaId, String dni, String nombres, String apellidos, String domicilio,
              String telefono, Integer jefeId, String departamento_jefe) {
    super(personaId, dni, nombres, apellidos, domicilio, telefono);
    this.jefeId = jefeId;
    this.departamento_jefe = departamento_jefe;
  }

  public Integer getJefeId() {
    return jefeId;
  }

  public void setJefeId(Integer jefeId) {
    this.jefeId = jefeId;
  }

  public String getDepartamento_jefe() {
    return departamento_jefe;
  }

  public void setDepartamento_jefe(String departamento_jefe) {
    this.departamento_jefe = departamento_jefe;
  }
}
