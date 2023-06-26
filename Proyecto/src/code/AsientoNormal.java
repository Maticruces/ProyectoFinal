package code;
public class AsientoNormal extends Asiento {
    private int precio;

    public AsientoNormal(int precio, int x, int y, int escala){
        super(precio, x, y, escala);
    }
    public int getPrecio(){
        return precio;
    }
}
