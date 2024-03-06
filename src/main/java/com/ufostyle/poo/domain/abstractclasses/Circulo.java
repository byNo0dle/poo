package com.ufostyle.poo.domain.abstractclasses;

public class Circulo extends Figura{

  private Double radio;

  public Circulo() {
  }

  public Circulo(Double x, Double y, Double radio) {
    super(x, y);
    this.radio = radio;
  }

  @Override
  public Double calcularArea() {
    Double pi = 3.14;
    Double resultado = pi * radio * radio;
    return resultado;
  }
}
