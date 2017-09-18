package Aplicacion;

import DB.BaseDeDatos;
import Dominio.EnumBase;

public class Agencia{
  public static void main(String[] args) {
    BaseDeDatos.inicializarCiudades();

    CrearNuevoPaquete.CrearPaquete();
    CrearNuevoPaquete.AgregarDestino(1);
    CrearNuevoPaquete.AgregarPrecio(1000.00, EnumBase.CUADRUPLE);
  }
}
