package code;
public class AsientoVIP extends Asiento {
    private int precio;

    public AsientoVIP(int precio, int x, int y, int escala){
        super(precio, x, y, escala);
    }
    public int getPrecio(){
        return precio;
    }

}
