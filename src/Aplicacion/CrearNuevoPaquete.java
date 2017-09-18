package Aplicacion;

import Dominio.*;
import DB.BaseDeDatos;

public class CrearNuevoPaquete {
  static Paquete paquete;

  static public void CrearPaquete(){
    Paquete paquete = new Paquete();
  }

  static public void AgregarDestino(int codigo){
    paquete.agregarDestinos(BaseDeDatos.buscarCiudad(codigo));
    System.out.println("Destino: " + BaseDeDatos.buscarCiudad(codigo).getNombre());
  }

  static public void AgregarPrecio(Double monto, EnumBase base){
    EnumBase.buscarBase(base);
    paquete.agregarPrecio(monto, base);
  }
}
