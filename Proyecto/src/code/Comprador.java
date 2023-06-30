package code;

import java.util.SplittableRandom;

public class Comprador {

    private String horarioElegido;
    private Recorridos destinoElegido;
    private Recorridos origenElegido;
    private Bus busElegido;
    private Asiento asientoElegido;

    public Comprador(){
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



}
