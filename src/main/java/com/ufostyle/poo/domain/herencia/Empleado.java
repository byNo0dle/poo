package com.ufostyle.poo.domain.herencia;

public class Empleado extends Persona {

  private Integer num_legajo;
  private String cargo;
  private Double sueldo;

  public Empleado() {
  }

  public Empleado(Integer personaId, String dni, String nombres, String apellidos,String domicilio,
                  String telefono, Integer num_legajo, String cargo, Double sueldo) {
    super(personaId, dni, nombres, apellidos, domicilio, telefono);
    this.num_legajo = num_legajo;
    this.cargo = cargo;
    this.sueldo = sueldo;
  }

  public Integer getNum_legajo() {
    return num_legajo;
  }

  public void setNum_legajo(Integer num_legajo) {
    this.num_legajo = num_legajo;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public Double getSueldo() {
    return sueldo;
  }

  public void setSueldo(Double sueldo) {
    this.sueldo = sueldo;
  }
}
