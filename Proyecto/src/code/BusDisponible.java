package code;

import java.util.ArrayList;

public class BusDisponible {
    private ArrayList<Bus> buses;
    private ArrayList<Bus> busesDisponibles;

    public BusDisponible(){
        Horarios horario = new Horarios();
        buses = new ArrayList<>();

        for (Recorridos origen:Recorridos.values()) {
            for (Recorridos destino : Recorridos.values()) {
                for (int i = 1; i < 4 ; i++) {
                    Bus1 bus1 = new Bus1(origen, destino, (horario.Horario(i)));
                    addBus(bus1);
                    Bus2 bus2 = new Bus2(origen, destino, (horario.Horario(i)));
                    addBus(bus2);

                }
            }
        }
    }

    public void addBus(Bus bus){
        buses.add(bus);
    }
    public void addBusDisponible(Bus bus){
        busesDisponibles.add(bus);
    }
    public Bus getBus(int indice){
        if (indice >= 0 && indice < buses.size()) {
            return buses.get(indice);
        } else {
            return null;
        }
    }

    public void filtrarBuses(Recorridos origenElegido, Recorridos destinoElegido, String horarioElegido){
        busesDisponibles = new ArrayList<>();
        for (int i = 0; i < buses.size(); i++) {
            if (buses.get(i).getOrigen() == origenElegido && buses.get(i).getDestino() == destinoElegido && buses.get(i).getHorario() == horarioElegido ){
                addBusDisponible(buses.get(i));
            }
        }
    }

    public ArrayList<Bus> getBusesDisponibles(){
        return busesDisponibles;
    }

}
