package Dominio;
public class Provincia {
    private Pais perteneceA;
    private String nombre;
    
    public Provincia(Pais perteneceA, String nombre){
        this.perteneceA = perteneceA;
        this.nombre = nombre;
    }
}
