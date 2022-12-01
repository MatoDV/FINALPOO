package garage.Vehiculos;

public class Moto {
    public int marcaMoto;
    public int cilindrada;
    public int cantRuedasMoto;

    Moto(){
    }
    Moto(int marcaMoto){
        this.setMarcaMoto(marcaMoto);
    }
    Moto(int marcaMoto, int cilindrada){
        this.setMarcaMoto(marcaMoto);
        this.setCilindrada(cilindrada);
    }
    Moto(int marcaMoto, int cilindrada, int cantRuedasMoto){
        this.setMarcaMoto(marcaMoto);
        this.setCilindrada(cilindrada);
        this.setCantRuedasMoto(cantRuedasMoto);
    }


    public int getCantRuedasMoto() {
        return cantRuedasMoto;
    }
    public void setCantRuedasMoto(int cantRuedasMoto) {
        this.cantRuedasMoto = cantRuedasMoto;
    }
    public int getMarcaMoto() {
        return marcaMoto;
    }
    public void setMarcaMoto(int marcaMoto) {
        this.marcaMoto = marcaMoto;
    }
    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

}
