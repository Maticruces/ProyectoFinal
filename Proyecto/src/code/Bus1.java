package code;

import java.lang.ref.SoftReference;

public class Bus1 extends Bus{
    private Recorridos origen;
    private Recorridos destino;
    private String horario;
    private int precioAsientoNormal;
    private int precioAsientoPremium;
    private int precioAsientoVIP;

    public Bus1(Recorridos origen, Recorridos destino, String horario){
        this.origen = origen;
        this.destino = destino;
        this.horario = horario;
        precioAsientoNormal = 1000;
        precioAsientoPremium = 1500;
        precioAsientoVIP = 3000;
    }

    public void agregarAsientos(){

        for (int i = 0; i < 14; i++) {
            AsientoNormal asientito = new AsientoNormal(precioAsientoNormal);
            addAsiento(asientito);
        }
        for (int i = 0; i < 6; i++) {
            AsientoPremium asientito = new AsientoPremium(precioAsientoPremium);
            addAsiento(asientito);
        }
        for (int i = 0; i < 10; i++) {
            AsientoVIP asientito = new AsientoVIP(precioAsientoVIP);
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