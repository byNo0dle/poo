package com.ufostyle.poo.domain.abstractclasses;

public class Cuadrado extends Figura{

  private Double lado;

  public Cuadrado() {
  }

  public Cuadrado(Double x, Double y, Double lado) {
    super(x, y);
    this.lado = lado;
  }

  @Override
  public Double calcularArea() {
    Double resultado = lado * lado;
    return resultado;
  }
}
