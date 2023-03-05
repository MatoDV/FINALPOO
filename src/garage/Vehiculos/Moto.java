package garage.Vehiculos;

public class Moto extends Vehiculo {
    public int cilindrada;

    public Moto(String marca,int cilindrada,int kilometraje){
        super(marca,2,kilometraje);
        this.cilindrada=cilindrada;
    }
    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
