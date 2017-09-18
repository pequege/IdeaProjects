package Dominio;

import java.util.Date;

public class ServicioAlojamiento extends PaqueteServicio{
    private int estrellas;

    public void setEstrellas(int estrellas) {
        if(estrellas >= 1 && estrellas<= 5){
            this.estrellas = estrellas;
        }
    }

    public ServicioAlojamiento(Date desde, Date hasta, Servicio servicio, int estrellas) {
        super(desde, hasta, servicio);
        this.estrellas = estrellas;
    }
}
