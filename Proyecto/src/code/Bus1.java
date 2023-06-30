package code;

import java.lang.ref.SoftReference;

public class Bus1 extends Bus{
    private Recorridos origen;
    private Recorridos destino;
    private String horario;

    public Bus1(Recorridos origen, Recorridos destino, String horario){
        this.origen = origen;
        this.destino = destino;
        this.horario = horario;
    }

    public void agregarAsientos(){

        for (int i = 0; i < 14; i++) {
            AsientoNormal asientito = new AsientoNormal(1000);
            addAsiento(asientito);
        }
        for (int i = 0; i < 6; i++) {
            AsientoPremium asientito = new AsientoPremium(1500);
            addAsiento(asientito);
        }
        for (int i = 0; i < 10; i++) {
            AsientoVIP asientito = new AsientoVIP(3000);
            addAsiento(asientito);
        }
    }

    public Recorridos getOrigen(){
        return origen;
    }
    public Recorridos getDestino(){
        return destino;
    }

    public String getHorario(){
        return horario;
    }
    public int tipo(){
        return 1;
    }
}
