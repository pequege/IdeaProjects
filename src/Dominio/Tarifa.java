package Dominio;
class Tarifa {
  private Double precio;
  private EnumBase base;

  public Double getPrecio() {
    return precio;
  }

  public EnumBase getBase() {
    return base;
  }

  public Tarifa(Double precio, EnumBase base){
    this.precio = precio;
    this.base = base;
  }

  @Override
  public String toString() {
    return "Tarifa: " + getBase().toString() + " > " + getPrecio();
  }
}
