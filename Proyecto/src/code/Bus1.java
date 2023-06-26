package code;

public class Bus1 extends Bus{
    public Bus1(){

    }

    public void agregarAsientos(int numAsientoNormal, int numAsientoPremium, int numAsientoVIP, int precioAsientoNormal, int precioAsientoPremium, int precioAsientoVIP){

        for (int i = 0; i < numAsientoNormal; i++) {
            AsientoNormal asientito = new AsientoNormal(precioAsientoNormal);
            addAsiento(asientito);
        }
        for (int i = 0; i < numAsientoPremium; i++) {
            AsientoPremium asientito = new AsientoPremium(precioAsientoPremium);
            addAsiento(asientito);
        }
        for (int i = 0; i < numAsientoVIP; i++) {
            AsientoVIP asientito = new AsientoVIP(precioAsientoVIP);
            addAsiento(asientito);
        }
    }
}
