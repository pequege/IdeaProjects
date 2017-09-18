package Dominio;

import java.util.ArrayList;

public class Paquete {
    private String nombre;
    private String descripcion;
    private Ciudad ciudadOrigen;
    private static ArrayList<Ciudad> destinos;
    private static ArrayList<Tarifa> tarifas;


  public static ArrayList<Ciudad> getDestinos() {
    return destinos;
  }

  public static ArrayList<Tarifa> getTarifas() {
    return tarifas;
  }

  public Paquete(){
      PaqueteServicio servicios = new PaqueteServicio();
      tarifas = new ArrayList<>();
      destinos = new ArrayList<>();

    }
    
  public static void agregarDestinos(Ciudad destino){
    destinos.add(destino);
  }

  public static void agregarPrecio(Double monto, EnumBase base){
    Tarifa tarifa = new Tarifa(monto, base);
    tarifas.add(tarifa);
    System.out.println(tarifa.toString());
  }
    
  public void agregarServicioAlojamiento(){

  }
}
 