package code;

import java.util.ArrayList;

public class Bus {
    private ArrayList<Asiento> asientosBus;

    public Bus(){
    }
    public void addAsiento(Asiento asiento){
        asientosBus.add(asiento);
    }

}
