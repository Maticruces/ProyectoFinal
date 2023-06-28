package code;

import java.util.ArrayList;

public class BusDisponible {
    private ArrayList<Bus> buses;

    public BusDisponible(){
        buses = new ArrayList<>();
        Bus1 bus1 = new Bus1(Recorridos.CONCEPCION, Recorridos.SANTIAGO);
        addBus(bus1);

    }
    public void addBus(Bus bus){
        buses.add(bus);
    }
    public Bus getBus(int indice){
        if (indice >= 0 && indice < buses.size()) {
            return buses.get(indice);
        } else {
            return null;
        }
    }


}
