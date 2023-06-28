package code;

import java.util.ArrayList;

public class Bus {
    private ArrayList<Asiento> asientosBus;

    public Bus(){
        asientosBus = new ArrayList<Asiento>();
    }
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


}
