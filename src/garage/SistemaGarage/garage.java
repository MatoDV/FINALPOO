package garage.SistemaGarage;

public class Garage {
    public double precioRuedas;
    public int capacidadMax;
    public int capacidadActual;

    Garage(double precioRuedas){
        this.setPrecioRuedas(200);
    }
    Garage(int capacidadMax, int capacidadActual){
        this.setCapacidadMax(10);
        this.setCapacidadActual(5);
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

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

}
