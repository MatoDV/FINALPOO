package mundial;

import java.util.Date;

public class Partido extends EtapaMundial{
    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;
    Partido(){
        this.setResultado(new Resultado());
    }
    Partido(Date fecha,Equipo local, Equipo visitante,Resultado resultado){
        this.setFecha(fecha);
        this.setLocal(local);
        this.setVisitante(visitante);
        resultado=new Resultado();
        this.setResultado(resultado);
    }
    Partido(Equipo local,Equipo visitante,Date fecha){
        this.setFecha(fecha);
        this.setLocal(local);
        this.setVisitante(visitante);
        this.setResultado(new Resultado());
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }
}
