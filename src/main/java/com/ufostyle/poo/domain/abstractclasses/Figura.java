package com.ufostyle.poo.domain.abstractclasses;

public abstract class Figura {

  protected Double x; //posición en x
  protected Double y; //posición en y

  protected Figura() {
  }

  protected Figura(Double x, Double y) {
    this.x = x;
    this.y = y;
  }

  public abstract Double calcularArea();
}
