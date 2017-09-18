package Dominio;

import java.util.Date;

public class PaqueteServicio {
    private Date desde;
    private Date hasta;
    private Servicio servicio;

    public Date getDesde() {
        return desde;
    }

    public void setDesde(Date desde) {
        this.desde = desde;
    }

    public Date getHasta() {
        return hasta;
    }

    public void setHasta(Date hasta) {
        this.hasta = hasta;
    }
    
    public PaqueteServicio(Date desde, Date hasta, Servicio servicio) {
        this.desde = desde;
        this.hasta = hasta;
        this.servicio = servicio;
    }

    public PaqueteServicio(){}
}
