package mundial;

import java.util.ArrayList;

public class EtapaMundial {
    private String descripcionEtapa;

    private ArrayList <Partido> partidos;
    public ArrayList<Equipo>equiposQueAvanzan;
    EtapaMundial(){
        this.partidos=new ArrayList<Partido>();
        this.equiposQueAvanzan=new ArrayList<Equipo>();
    }

    public ArrayList<Partido> addPartido (Partido partidos){
        this.partidos.add(partidos);
        return this.partidos;
    }
    public ArrayList<Partido> getPartidos() {
        return partidos;
    }
    public ArrayList<Equipo> getEquiposQueAvanzan(){
        return null;
    }
    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }
}
