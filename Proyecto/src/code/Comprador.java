package code;

import java.util.SplittableRandom;

public class Comprador {
    private String horarioElegido;
    private Recorridos destinoElegido;
    private Recorridos origenElegido;
    private Bus busElegido;
    private Asiento asientoElegido;

    public Comprador(String horarioElegido, Recorridos destinoElegido, Recorridos origenElegido, Bus busElegido, Asiento asientoElegido){
        this.horarioElegido = horarioElegido;
        this.destinoElegido = destinoElegido;
        this.origenElegido = origenElegido;
        this.busElegido = busElegido;
        this.asientoElegido = asientoElegido;
    }


}
