package mundial;

import java.util.ArrayList;
import java.util.Date;

public class Equipo extends Partido{
    private String nombre;
    private ArrayList <Partido> partidosJugados;
    private int puntos;
    public int sumarpuntos;

    Equipo(Date fecha, Equipo local, Equipo visitante) {
        super(fecha, local, visitante);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getSumarpuntos() {
        return sumarpuntos;
    }

    public void setSumarpuntos(int sumarpuntos) {
        this.sumarpuntos = sumarpuntos;
    }
}
