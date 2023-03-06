package garage.SistemaGarage;

import garage.Vehiculos.Auto;
import garage.Vehiculos.Moto;
import garage.Vehiculos.Vehiculo;

public class GarageTest {
    public static void main(String[] args) {
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
