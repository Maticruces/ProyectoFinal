package code;

import java.util.ArrayList;

public abstract class Bus {
    private ArrayList<Asiento> asientosBus;


    public Bus(){
        asientosBus = new ArrayList<Asiento>();
        agregarAsientos();
    }
    public abstract void agregarAsientos();
    public void addAsiento(Asiento asiento){
        asientosBus.add(asiento);
    }

    public Asiento getAsiento(int indice) {
        if (indice >= 0 && indice < asientosBus.size()) {
            return asientosBus.get(indice);
        } else {
            return null;
        }
    }

    public abstract Recorridos getOrigen();
    public abstract Recorridos getDestino();
    public abstract String getHorario();
    public abstract int tipo();


}
