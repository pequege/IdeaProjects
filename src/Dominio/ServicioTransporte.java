package Dominio;

import java.util.Date;

public class ServicioTransporte extends PaqueteServicio{
    private int camas;

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public ServicioTransporte(int camas, Date desde, Date hasta, Servicio servicio) {
        super(desde, hasta, servicio);
        this.camas = camas;
    }
}
