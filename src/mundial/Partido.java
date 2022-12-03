package mundial;

import java.util.Date;

public class Partido extends EtapaMundial{
    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;

    Partido(Date fecha,Equipo local, Equipo visitante){
    }

    public Equipo getLocal() {
        return local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public Resultado getResultado() {
        return resultado;
    }
}
