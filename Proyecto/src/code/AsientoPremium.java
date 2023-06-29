package code;
public class AsientoPremium extends Asiento {
    private int precio;

    public AsientoPremium(int precio, int x, int y, int escala){
        super(precio, x, y, escala);
    }
    public int getPrecio(){
        return precio;
    }
}