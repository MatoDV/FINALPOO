package mundial;

import java.util.ArrayList;
import java.util.Date;

public class Llave extends EtapaMundial{
    public void generarPartido(ArrayList<Equipo>equipos){
        for (int i=0;i<equipos.size()-1;i+=2){
            getPartidos().add(new Partido(equipos.get(i),equipos.get(i+1),new Date()));
        }
    }
   @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {
        for (int i=0;i<getPartidos().size();i++){
            if (getPartidos().get(i).getResultado().ganoLocal()){
                this.equiposQueAvanzan.add(getPartidos().get(i).getLocal());
            }else this.equiposQueAvanzan.add(getPartidos().get(i).getVisitante());
        }
        return equiposQueAvanzan;
    }
}
