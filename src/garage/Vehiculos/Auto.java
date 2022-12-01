package garage.Vehiculos;

public class Auto {
    public int marcaAuto;
    public int cantPuerta;
    public int cantRuedasAuto;

    Auto(){
    }
    Auto(int marcaAuto){
        this.setMarcaAuto(marcaAuto);
    }
    Auto(int marcaAuto,int cantPuerta){
        this.setMarcaAuto(marcaAuto);
        this.setCantPuerta(cantPuerta);
    }
    Auto(int marcaAuto, int cantPuerta, int cantRuedasAuto){
        this.setMarcaAuto(marcaAuto);
        this.setCantPuerta(cantPuerta);
        this.setCantRuedasAuto(cantRuedasAuto);
    }

    public int getCantRuedasAuto() {
        return cantRuedasAuto;
    }
    public void setCantRuedasAuto(int cantRuedasAuto) {
        this.cantRuedasAuto = cantRuedasAuto;
    }
    public int getMarcaAuto() {
        return marcaAuto;
    }
    public void setMarcaAuto(int marcaAuto) {
        this.marcaAuto = marcaAuto;
    }
    public int getCantPuerta() {
        return cantPuerta;
    }
    public void setCantPuerta(int cantPuerta) {
        this.cantPuerta = cantPuerta;
    }

}
