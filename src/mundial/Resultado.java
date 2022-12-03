package mundial;

import java.util.Date;

public class Resultado extends Partido{
    private int golesLocal;
    private int golesVisitante;

    Resultado(Date fecha, Equipo local, Equipo visitante) {
        super(fecha, local, visitante);
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }
    public boolean ganoLocal(){
        return false;
    }
    public boolean empate(){
        return false;
    }
}
