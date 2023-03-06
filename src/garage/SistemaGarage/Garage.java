package garage.SistemaGarage;

import garage.Vehiculos.Vehiculo;

import java.util.ArrayList;

public class Garage {
    public double precioRuedas;
    public int capacidadMax;
    public ArrayList<Vehiculo> vehiculos;

    public Garage(int capacidadMax, double precioRuedas){
        this.setCapacidadMax(capacidadMax);
        this.setPrecioRuedas(precioRuedas);
        this.vehiculos=new ArrayList<>();
    }
    public void añadirVehiculo(Vehiculo vehiculo) {
        if (vehiculos.size() >= capacidadMax) {
            System.out.println("No hay mas espacio en el garage");
            return;
        } else {
            vehiculos.add(vehiculo);
        }
    }
    public void sacarVehiculo(Vehiculo vehiculo){
        vehiculos.remove(vehiculo);
    }
    public int getTotalVehiculos(){
        return vehiculos.size();
    }
    public double getTotalPrecioRuedas(){
        int totalRuedas = 0;
        for (Vehiculo vehiculo:vehiculos){
            if(vehiculo.getCantRuedas() == 2){
                totalRuedas += 2;
            } else if(vehiculo.getCantRuedas() == 4){
                totalRuedas += 4;
            }
        }
        return precioRuedas*totalRuedas;
    }
    public double getKilometrajeTotal(){
        double sum=0;
        for (Vehiculo vehiculo:vehiculos){
            sum+=vehiculo.getKilometraje();
        }
        return sum/vehiculos.size();
    }
    public double getPrecioRuedas() {
        return precioRuedas;
    }

    public void setPrecioRuedas(double precioRuedas) {
        this.precioRuedas = precioRuedas;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }


}
