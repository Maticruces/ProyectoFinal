package code;
public class AsientoVIP extends Asiento {
    private int precio;

    public AsientoVIP(int precio){
        this.precio = precio;
    }
    public int getPrecio(){
        return precio;
    }
    public String getTipo(){
        return "Asiento VIP";
    }
}
