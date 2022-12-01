package garage.Vehiculos;

public class Auto {
    public String marcaAuto;
    public int cantPuerta;
    public int cantRuedasAuto;

    Auto(){
    }
    Auto(String marcaAuto){
        this.setMarcaAuto(marcaAuto);
    }
    Auto(String marcaAuto,int cantPuerta){
        this.setMarcaAuto(marcaAuto);
        this.setCantPuerta(cantPuerta);
    }
    public Auto(String marcaAuto, int cantPuerta, int cantRuedasAuto){
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
    public String getMarcaAuto() {
        return marcaAuto;
    }
    public void setMarcaAuto(String marcaAuto) {
        this.marcaAuto = marcaAuto;
    }
    public int getCantPuerta() {
        return cantPuerta;
    }
    public void setCantPuerta(int cantPuerta) {
        this.cantPuerta = cantPuerta;
    }

}
