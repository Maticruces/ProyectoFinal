package code;
public class AsientoPremium extends Asiento {
    private int precio;

    public AsientoPremium(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTipo() {
        return "Asiento premium";
    }
}