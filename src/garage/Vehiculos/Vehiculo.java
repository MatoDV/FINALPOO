package garage.Vehiculos;

public class Vehiculo {
    public String marca;
    public int cantRuedas;
    public int kilometraje;
    public Vehiculo(String marca,int cantRuedas,int kilometraje){
        this.marca=marca;
        this.cantRuedas=cantRuedas;
        this.kilometraje=kilometraje;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }
}
