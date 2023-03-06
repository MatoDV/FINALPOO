package mundial;

import garage.SistemaGarage.Garage;
import garage.Vehiculos.Auto;
import garage.Vehiculos.Moto;
import garage.Vehiculos.Vehiculo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Equipo> GrupoA = new ArrayList<Equipo>();
        GrupoA.add(new Equipo("Valorant"));
        GrupoA.add(new Equipo("CSGO"));
        GrupoA.add(new Equipo("CS1.6"));
        GrupoA.add(new Equipo("RainbowSix"));

        ArrayList<Equipo> GrupoB = new ArrayList<Equipo>();
        GrupoB.add(new Equipo("ApexLegends"));
        GrupoB.add(new Equipo("PUBG"));
        GrupoB.add(new Equipo("Fortnite"));
        GrupoB.add(new Equipo("Warzone"));

        ArrayList<Equipo> GrupoC = new ArrayList<Equipo>();
        GrupoC.add(new Equipo("AlbionOnline"));
        GrupoC.add(new Equipo("WOW"));
        GrupoC.add(new Equipo("NewWorld"));
        GrupoC.add(new Equipo("LostArk"));

        ArrayList<Equipo> GrupoD = new ArrayList<Equipo>();
        GrupoD.add(new Equipo("Spiderman"));
        GrupoD.add(new Equipo("HogwartsLegacy"));
        GrupoD.add(new Equipo("FarCry3"));
        GrupoD.add(new Equipo("TombRider"));

        ArrayList<Equipo> GrupoE = new ArrayList<Equipo>();
        GrupoE.add(new Equipo("ResidentEvil7"));
        GrupoE.add(new Equipo("Outlast"));
        GrupoE.add(new Equipo("Outlast2"));
        GrupoE.add(new Equipo("FiveNightsAtFreddys"));

        ArrayList<Equipo> GrupoF = new ArrayList<Equipo>();
        GrupoF.add(new Equipo("NeedForSpeed"));
        GrupoF.add(new Equipo("GranTurismo"));
        GrupoF.add(new Equipo("Dirt5"));
        GrupoF.add(new Equipo("ForzaHorizon5"));

        ArrayList<Equipo> GrupoG = new ArrayList<Equipo>();
        GrupoG.add(new Equipo("Pes2006"));
        GrupoG.add(new Equipo("Fifa23"));
        GrupoG.add(new Equipo("NFL23"));
        GrupoG.add(new Equipo("NBA2k23"));

        ArrayList<Equipo> GrupoH= new ArrayList<Equipo>();
        GrupoH.add(new Equipo("WWE2K23"));
        GrupoH.add(new Equipo("UFC4"));
        GrupoH.add(new Equipo("MortalKombatArmageddon"));
        GrupoH.add(new Equipo("StreetFighterV"));

        Grupo fps = new Grupo();
        fps.generarPartidos(GrupoA);
        fps.getPartidos().get(0).gol(2, 1);
        fps.getPartidos().get(1).gol(3, 2);
        fps.getPartidos().get(2).gol(1, 4);
        fps.getPartidos().get(3).gol(2, 3);
        fps.getPartidos().get(4).gol(6, 5);
        fps.getPartidos().get(5).gol(4, 1);


        Grupo battleRoyale = new Grupo();
        battleRoyale.generarPartidos(GrupoB);
        battleRoyale.getPartidos().get(0).gol(2, 1);
        battleRoyale.getPartidos().get(1).gol(4, 6);
        battleRoyale.getPartidos().get(2).gol(3, 1);
        battleRoyale.getPartidos().get(3).gol(2, 1);
        battleRoyale.getPartidos().get(4).gol(2, 1);
        battleRoyale.getPartidos().get(5).gol(0, 1);

        Grupo mmoRpg = new Grupo();
        mmoRpg.generarPartidos(GrupoC);
        mmoRpg.getPartidos().get(0).gol(2, 1);
        mmoRpg.getPartidos().get(1).gol(3, 2);
        mmoRpg.getPartidos().get(2).gol(1, 4);
        mmoRpg.getPartidos().get(3).gol(2, 3);
        mmoRpg.getPartidos().get(4).gol(6, 5);
        mmoRpg.getPartidos().get(5).gol(4, 1);

        Grupo aventura = new Grupo();
        aventura.generarPartidos(GrupoD);
        aventura.getPartidos().get(0).gol(2, 1);
        aventura.getPartidos().get(1).gol(3, 2);
        aventura.getPartidos().get(2).gol(1, 4);
        aventura.getPartidos().get(3).gol(2, 3);
        aventura.getPartidos().get(4).gol(6, 5);
        aventura.getPartidos().get(5).gol(4, 1);

        Grupo terror = new Grupo();
        terror.generarPartidos(GrupoE);
        terror.getPartidos().get(0).gol(2, 1);
        terror.getPartidos().get(1).gol(3, 2);
        terror.getPartidos().get(2).gol(1, 4);
        terror.getPartidos().get(3).gol(2, 3);
        terror.getPartidos().get(4).gol(6, 5);
        terror.getPartidos().get(5).gol(4, 1);

        Grupo carreras = new Grupo();
        carreras.generarPartidos(GrupoF);
        carreras.getPartidos().get(0).gol(2, 1);
        carreras.getPartidos().get(1).gol(3, 2);
        carreras.getPartidos().get(2).gol(1, 4);
        carreras.getPartidos().get(3).gol(2, 3);
        carreras.getPartidos().get(4).gol(6, 5);
        carreras.getPartidos().get(5).gol(4, 1);

        Grupo deportes = new Grupo();
        deportes.generarPartidos(GrupoG);
        deportes.getPartidos().get(0).gol(2, 1);
        deportes.getPartidos().get(1).gol(3, 2);
        deportes.getPartidos().get(2).gol(1, 4);
        deportes.getPartidos().get(3).gol(2, 3);
        deportes.getPartidos().get(4).gol(6, 5);
        deportes.getPartidos().get(5).gol(4, 1);

        Grupo pelea = new Grupo();
        pelea.generarPartidos(GrupoH);
        pelea.getPartidos().get(0).gol(2, 1);
        pelea.getPartidos().get(1).gol(3, 2);
        pelea.getPartidos().get(2).gol(1, 4);
        pelea.getPartidos().get(3).gol(2, 3);
        pelea.getPartidos().get(4).gol(6, 5);
        pelea.getPartidos().get(5).gol(4, 1);

        ArrayList<Equipo> pasanOctavos = new ArrayList<Equipo>();
        pasanOctavos.addAll(fps.getEquiposQueAvanzan());
        pasanOctavos.addAll(battleRoyale.getEquiposQueAvanzan());
        pasanOctavos.addAll(mmoRpg.getEquiposQueAvanzan());
        pasanOctavos.addAll(aventura.getEquiposQueAvanzan());
        pasanOctavos.addAll(terror.getEquiposQueAvanzan());
        pasanOctavos.addAll(carreras.getEquiposQueAvanzan());
        pasanOctavos.addAll(deportes.getEquiposQueAvanzan());
        pasanOctavos.addAll(pelea.getEquiposQueAvanzan());


        Llave octavos = new Llave();
        octavos.generarPartido(pasanOctavos);
        octavos.getPartidos().get(0).gol(2, 3);
        octavos.getPartidos().get(1).gol(4, 1);
        octavos.getPartidos().get(2).gol(2, 5);
        octavos.getPartidos().get(3).gol(1, 0);
        octavos.getPartidos().get(4).gol(3, 1);
        octavos.getPartidos().get(5).gol(1, 3);
        octavos.getPartidos().get(6).gol(4, 5);
        octavos.getPartidos().get(7).gol(4, 3);


        ArrayList<Equipo> pasanCuartos = octavos.getEquiposQueAvanzan();

        Llave cuartos = new Llave();
        cuartos.generarPartido(pasanCuartos);
        cuartos.getPartidos().get(0).gol(0, 3);
        cuartos.getPartidos().get(1).gol(3, 1);
        cuartos.getPartidos().get(2).gol(4, 1);
        cuartos.getPartidos().get(3).gol(2, 5);

        ArrayList<Equipo> pasanSemis = cuartos.getEquiposQueAvanzan();

        Llave semis = new Llave();
        semis.generarPartido(pasanSemis);
        semis.getPartidos().get(0).gol(6, 1);
        semis.getPartidos().get(1).gol(0, 2);

        ArrayList<Equipo> pasanfinal = semis.getEquiposQueAvanzan();

        Llave finalMundial = new Llave();
        finalMundial.generarPartido(pasanfinal);
        finalMundial.getPartidos().get(0).gol(5, 4);
        ArrayList<Equipo> ganador = finalMundial.getEquiposQueAvanzan();

        System.out.println("-------------------------------------------------------------");
        System.out.println("----------------------------MUNDIAL----------------------------");

        System.out.println("-Equipos que avanzan a los cuartos de final:");
        for (Equipo equipo : pasanCuartos) {
            System.out.println(equipo.getNombre());
        }

        System.out.println("-Equipos que avanzan a las semifinales:");
        for (Equipo equipo : pasanSemis) {
            System.out.println(equipo.getNombre());
        }
        System.out.println("-Los equipos que avanzan a la final:");

        for (Equipo equipo : pasanfinal) {
            System.out.println(equipo.getNombre());
        }
        System.out.println(String.format("-El ganador del mundial es: %S", ganador.get(0).getNombre()));

        System.out.println("-------------------------------------------------------------");
        System.out.println("----------------------------GARAGE----------------------------");

        Garage garage = new Garage(10, 400);
        Auto vw = new Auto("vw", 4, 8000);
        Moto bmw = new Moto("bmw", 4, 2500);

        garage.añadirVehiculo(vw);
        garage.añadirVehiculo(bmw);

        System.out.println("Total de vehiculos: " + garage.getTotalVehiculos());
        System.out.println("Precio total de ruedas: " + garage.getTotalPrecioRuedas());
        System.out.println("Kilometraje promedio: " + garage.getKilometrajeTotal());


        for (Vehiculo vehiculo : garage.vehiculos) {
            System.out.println("Marca: " + vehiculo.getMarca() + ", Kilometraje: " + vehiculo.getKilometraje());
        }
    }
}
