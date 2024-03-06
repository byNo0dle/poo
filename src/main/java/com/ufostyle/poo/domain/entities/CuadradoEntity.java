package com.ufostyle.poo.domain.entities;

import com.ufostyle.poo.domain.repositories.DibujableRepository;
import com.ufostyle.poo.domain.repositories.FiguraRepository;

public class CuadradoEntity implements FiguraRepository, DibujableRepository {

  private Double lado;

  public CuadradoEntity() {
  }

  public CuadradoEntity(Double lado) {
    this.lado = lado;
  }

  @Override
  public Double calcularArea() {
    Double resultado = lado * lado;
    return resultado;
  }

  @Override
  public void dibujar() {
    System.out.println("Hola, estoy dibujando un cuadrado");
  }
}
