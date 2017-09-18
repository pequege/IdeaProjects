package Dominio;

import java.text.CharacterIterator;
import DB.BaseDeDatos;

public class Ciudad {
  private int codigo;
  private String nombre;
  private Provincia perteneceA;

  public int getCodigo() {
    return codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public Provincia getPerteneceA() {
    return perteneceA;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setPerteneceA(Provincia perteneceA) {
    this.perteneceA = perteneceA;
  }

  public Ciudad() {
  }

  public Ciudad(int codigo, String nombre, Provincia perteneceA){
    this.codigo = codigo;
    this.nombre = nombre;
    this.perteneceA = perteneceA;
  }

  @Override
  public String toString() {
    return "Ciudad{" +
            "codigo=" + codigo +
            ", nombre='" + nombre + '\'' +
            ", perteneceA=" + perteneceA +
            '}';
  }
}
