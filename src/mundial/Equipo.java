package mundial;

import java.util.ArrayList;
import java.util.Date;

public class Equipo extends Partido{
    private String nombre;
    private ArrayList <Partido> partidosJugados;

    Equipo(Date fecha, Equipo local, Equipo visitante) {
        super(fecha, local, visitante);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
