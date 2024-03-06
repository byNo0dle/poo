package com.ufostyle.poo.domain.entities;

import com.ufostyle.poo.domain.repositories.DibujableRepository;
import com.ufostyle.poo.domain.repositories.FiguraRepository;
import com.ufostyle.poo.domain.repositories.RotableRepository;

public class CirculoEntity implements FiguraRepository, DibujableRepository, RotableRepository {

  private Double radio;

  public CirculoEntity() {
  }

  public CirculoEntity(Double radio) {
    this.radio = radio;
  }

  @Override
  public Double calcularArea() {
    Double pi = 3.14;
    Double resultado = pi * radio * radio;
    return resultado;
  }

  @Override
  public void dibujar() {
    System.out.println("Hola, estoy dibujando un círculo");
  }

  @Override
  public void rotar() {
    System.out.println("Hola, estoy rotando un círculo");
  }
}
