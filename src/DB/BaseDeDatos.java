package DB;

import java.util.ArrayList;
import java.util.Arrays;

import Dominio.*;

public class BaseDeDatos {
  public static ArrayList<Ciudad> ciudades = new ArrayList<>();


  static public void inicializarCiudades() {
    ciudades = new ArrayList<>();
    Pais argentina = new Pais("Argentina");
    Provincia tucuman = new Provincia(argentina, "Tucuman");
    Provincia salta  = new Provincia(argentina, "Salta");
    ciudades.add(new Ciudad(0,"Las Talitas", tucuman));
    ciudades.add(new Ciudad(1,"Monteros", tucuman));
    ciudades.add(new Ciudad(2, "Cafayate", salta));
  }

  public static Ciudad buscarCiudad(int codigo) {
    Ciudad ciudadEncontrada = new Ciudad();
    for (Ciudad ciudad: ciudades) {
      if (ciudad.getCodigo() == codigo){
        ciudadEncontrada.setNombre(ciudad.getNombre());
        ciudadEncontrada.setPerteneceA(ciudad.getPerteneceA());
      }
    }
    return ciudadEncontrada;
  }
}
