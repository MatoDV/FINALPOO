package garage.Vehiculos;

public class Moto extends Vehiculo {
    public int cilindrada;
    public int cantRuedasMoto;

    Moto(){
    }
    Moto(String marca){
        this.setMarca(marca);
    }
    Moto(String marca,int cilindrada){
        this.setMarca(marca);
        this.setCilindrada(cilindrada);
    }
    public Moto(String marcaMoto, int cilindrada, int cantRuedasMoto){
        this.setMarca(marca);
        this.setCilindrada(cilindrada);
        this.setCantRuedasMoto(cantRuedasMoto);
    }


    public int getCantRuedasMoto() {
        return cantRuedasMoto;
    }
    public void setCantRuedasMoto(int cantRuedasMoto) {
        this.cantRuedasMoto = cantRuedasMoto;
    }
    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

}
