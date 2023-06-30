package code;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class Comprador {

    private String horarioElegido;
    private Recorridos destinoElegido;
    private Recorridos origenElegido;
    private Bus busElegido;
    private Asiento asientoElegido;
    private ArrayList<Asiento> asientosElegido;

    public Comprador(){
        asientosElegido = new ArrayList<>();
    }
    public void setOrigen(Recorridos origenElegido){
        this.origenElegido = origenElegido;
    }
    public Recorridos getOrigenElegido(){
        return origenElegido;
    }

    public void setDestino(Recorridos destinoElegido){
        this.destinoElegido = destinoElegido;
    }

    public Recorridos getDestinoElegido(){
        return destinoElegido;
    }
    public void setHorario(String horarioElegido){
        this.horarioElegido = horarioElegido;
    }
    public String getHorarioElegido(){
        return horarioElegido;
    }

    public void setBus(Bus busElegido){
        this.busElegido = busElegido;
    }
    public Bus getBusElegido(){
        return busElegido;
    }

    public void setAsiento(Asiento asientoElegido){
        this.asientoElegido = asientoElegido;
    }
    public Asiento getAsientoElegido(){
        return asientoElegido;
    }
    public void addAsientosElegido(Asiento asiento){
        if(asiento != null) {
            asientosElegido.add(asiento);
        }
    }
    public void removeAsientosElegido(Asiento asiento){
        if(asiento != null) {
            asientosElegido.remove(asiento);
        }
    }

    public Asiento getAsientosElegido(int indice) {
        if (indice >= 0 && indice < asientosElegido.size()) {
            return asientosElegido.get(indice);
        } else {
            return null;
        }
    }
    public ArrayList<Asiento> getAsientosElegidos(){
        return asientosElegido;
    }



}
