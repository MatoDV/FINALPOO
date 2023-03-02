package mundial;

import java.util.ArrayList;

public class Equipo extends Partido{
    private String nombre;
    private ArrayList <Partido> partidosJugados;
    private int puntos;
    public int sumarpuntos;

    Equipo(String nombre) {
        this.setNombre(nombre);
    }
    public void sumarpuntos(){
        this.setPuntos(3);
        sumarpuntos=puntos+sumarpuntos;
        this.setPuntos(sumarpuntos);
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
