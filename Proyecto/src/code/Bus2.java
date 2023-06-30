package code;

import java.lang.ref.SoftReference;

public class Bus2 extends Bus{
    private Recorridos origen;
    private Recorridos destino;
    private String horario;
    private int precioAsientoNormal;
    private int precioAsientoPremium;
    private int precioAsientoVIP;

    public Bus2(Recorridos origen, Recorridos destino, String horario){
        this.origen = origen;
        this.destino = destino;
        this.horario = horario;
        precioAsientoNormal = 1500;
        precioAsientoPremium = 2500;
        precioAsientoVIP = 4000;
    }

    public void agregarAsientos(){
        for (int i = 0; i < 14; i++) {
            AsientoNormal asientito = new AsientoNormal(1500);
            addAsiento(asientito);
        }
        for (int i = 0; i < 6; i++) {
            AsientoPremium asientito = new AsientoPremium(2500);
            addAsiento(asientito);
        }
        for (int i = 0; i < 10; i++) {
            AsientoVIP asientito = new AsientoVIP(4000);
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
        return 2;
    }
    public int precioAsientoNormal(){
        return precioAsientoNormal;
    }
    public int precioAsientoPremium() {
        return precioAsientoPremium;
    }
    public int precioAsientoVIP(){
        return precioAsientoVIP;
    }
}
