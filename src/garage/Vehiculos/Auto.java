package garage.Vehiculos;

public class Auto extends Vehiculo{
    public int cantPuerta;

    public Auto(String marca,int cantPuerta,int kilometraje){
        super(marca,4,kilometraje);
        this.cantPuerta=cantPuerta;
    }

    public int getCantPuerta() {
        return cantPuerta;
    }
    public void setCantPuerta(int cantPuerta) {
        this.cantPuerta = cantPuerta;
    }
}
