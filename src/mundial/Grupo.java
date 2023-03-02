package mundial;

import java.util.ArrayList;
import java.util.Date;

public class Grupo extends EtapaMundial{
    public void generarPartidos(ArrayList<Equipo>equipos){
        for (int i=0;i<equipos.size();i++){
            for (int k=i+1;k<equipos.size();k++){
                getPartidos().add(new Partido(equipos.get(i),equipos.get(k),new Date()));
            }
        }
    }
    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {
        for (int i = 0; i <getPartidos().size() ; i++) {
            if (getPartidos().get(i).getResultado().ganoLocal()){
                getPartidos().get(i).getLocal().sumarpuntos();
            }else getPartidos().get(i).getVisitante().sumarpuntos();
            if (getPartidos().get(i).getLocal().getPuntos()>=6){
                this.equiposQueAvanzan.add(getPartidos().get(i).getLocal());
            } else if (getPartidos().get(i).getVisitante().getPuntos()>=6) {
                this.equiposQueAvanzan.add(getPartidos().get(i).getVisitante());
            }
        }
        return equiposQueAvanzan;
    }
}
