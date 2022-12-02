package garage.Vehiculos;

public class Auto extends Vehiculo{
    public int cantPuerta;
    public int cantRuedasAuto;

    Auto(){
    }
    Auto(String marca){
        this.setMarca(marca);
    }
    Auto(String marca,int cantPuerta){
        this.setMarca(marca);
        this.setCantPuerta(cantPuerta);
    }
    public Auto(String marca,int cantPuerta, int cantRuedasAuto){
        this.setMarca(marca);
        this.setCantPuerta(cantPuerta);
        this.setCantRuedasAuto(cantRuedasAuto);
    }

    public int getCantRuedasAuto() {
        return cantRuedasAuto;
    }
    public void setCantRuedasAuto(int cantRuedasAuto) {
        this.cantRuedasAuto = cantRuedasAuto;
    }
    public int getCantPuerta() {
        return cantPuerta;
    }
    public void setCantPuerta(int cantPuerta) {
        this.cantPuerta = cantPuerta;
    }

}
