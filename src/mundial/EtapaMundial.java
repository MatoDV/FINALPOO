package mundial;

import java.util.ArrayList;

public class EtapaMundial {
    private String descripcionEtapa;
    private ArrayList <Partido> partidos;

    EtapaMundial(){
    }

    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }
    public void addPartido (Partido partido){

    }
    public ArrayList<Partido> getPartidos() {
        return partidos;
    }
    public ArrayList<Equipo> getEquiposQueAvanzan(){
        return null;
    }
}
