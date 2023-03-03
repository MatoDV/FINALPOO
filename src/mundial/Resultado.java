package mundial;

import java.util.Date;

public class Resultado extends Partido{
    private int golesLocal;
    private int golesVisitante;

    public boolean ganoLocal(){
        return golesLocal>golesVisitante;
    }
    public boolean empatan(){
        return golesLocal==golesVisitante;
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

}
