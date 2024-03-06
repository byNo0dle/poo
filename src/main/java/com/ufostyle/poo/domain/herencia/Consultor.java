package com.ufostyle.poo.domain.herencia;

public class Consultor extends Persona {

  private String nombre_consultora;
  private Integer num_consultor;

  public Consultor() {
  }

  public Consultor(Integer personaId, String dni, String nombres, String apellidos,
                   String domicilio, String telefono, String nombre_consultora,
                   Integer num_consultor) {
    super(personaId, dni, nombres, apellidos, domicilio, telefono);
    this.nombre_consultora = nombre_consultora;
    this.num_consultor = num_consultor;
  }

  public String getNombre_consultora() {
    return nombre_consultora;
  }

  public void setNombre_consultora(String nombre_consultora) {
    this.nombre_consultora = nombre_consultora;
  }

  public Integer getNum_consultor() {
    return num_consultor;
  }

  public void setNum_consultor(Integer num_consultor) {
    this.num_consultor = num_consultor;
  }
}
