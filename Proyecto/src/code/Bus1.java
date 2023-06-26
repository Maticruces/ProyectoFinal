package code;

import Exceptions.*;

import javax.swing.*;
import java.awt.*;

public class Bus1 extends JPanel {
    private DepositoM TVuelto, DIngreso;
    private Asiento AsientoComprado, Acomparacion;
    private boolean calcVuelto;
    private int precio, escala, serie;
    private int countm100, countm500, countb1000, Dinero;
    public static final int numAsientoNormal = 1;
    public static final int numAsientoPremium = 2;
    public static final int numAsientoVIP = 3;

    public Bus1(int numero, int precio, int x, int y, int escala){

        super();
        serie = numero;
        countm100 = 0;countm500 = 0;countb1000 = 0;
        Dinero = 0;
        AsientoComprado = new NoAsiento(0,0,0,0);Acomparacion = new NoAsiento(0,0,0,0);

        calcVuelto = false;

        TVuelto = new DepositoM();
        DIngreso = new DepositoM();

        this.escala = escala;
        setBounds(0, 0, 4*escala, 3*escala);
        this.precio = precio;

    }
    public void AgregarAsientos(int numAsientoNormal, int numAsientoPremium, int numAsientoVIP, int precioAsientoNormal, int precioAsientoPremium, int precioAsientoVIP){

        for (int i = 0; i < numAsientoNormal; i++) {
            AsientoNormal asientito = new AsientoNormal(precioAsientoNormal, 0, 0, escala);
        }
        for (int i = 0; i < numAsientoPremium; i++) {
            AsientoPremium asientito = new AsientoPremium(precioAsientoPremium, 0, 0, escala);
        }
        for (int i = 0; i < numAsientoVIP; i++) {
            AsientoVIP asientito = new AsientoVIP(precioAsientoVIP, 0, 0, escala);
        }
    }
    @Override
    public void paint(Graphics g) {
        paintBus1(g);
        if (AsientoComprado.getClass().getName() != Acomparacion.getClass().getName()) {//
            AsientoComprado.changeLocation(25 * escala / 32, 17 * escala / 8);
            AsientoComprado.paint(g);
        }
    }
    public int getcountm100() {
        return countm100;
    }
    public int getcountm500() {
        return countm500;
    }
    public int getcountb1000() {
        return countb1000;
    }
    public void setcountm100(int c) {
        countm100 = c;
    }
    public void setcountm500(int c) {
        countm500 = c;
    }
    public void setcountb1000(int c) {
        countb1000 = c;
    }
    public void comprarAsiento(int n) throws PagoInsuficienteException, NoHayAsientoException, YaComproException {
        if (Dinero < precio) throw new PagoInsuficienteException("El Monto de Pago no es suficiente para realizar la transaccion");
        if (AsientoComprado.getClass().getName() != Acomparacion.getClass().getName()) throw new YaComproException("Ya hay un Asiento comprado, Extraiga el ticket para proceder con otra compra");
        /*
        switch(n){
            case 1:
                AsientoComprado = ticket.getAsiento();
                if (AsientoComprado.getClass().getName() == Acomparacion.getClass().getName())
                    throw new NoHayAsientoException("Actualmente no hay mas tickets, lo sentimos");

                Dinero = Dinero - precio;
                break;

            default:
                throw new NoHayAsientoException("No se a ingresado una seleccion de Producto");
        }

         */
    }
    /*
    public Asiento getAsiento(){
        if (!calcVuelto) {
            while(Dinero > 0){
                if (Dinero >= 1000) {
                    TVuelto.addMoneda(new TicketVIP());
                    Dinero = Dinero - 1000;
                }else{
                    if (Dinero >= 500) {
                        TVuelto.addMoneda(new TicketPremium());
                        Dinero = Dinero - 500;
                    }else{
                        if (Dinero >= 100) {
                            TVuelto.addMoneda(new TicketNormal());
                            Dinero = Dinero - 100;
                        }
                    }
                }
            }
            calcVuelto = true;
        }
        return null;
    }

     */
    public void IngresaDinero(Moneda m) throws PagoIncorrectoException{
        if (m == null) throw new PagoIncorrectoException("Pago no valido");
        if (m.getValor() == 100){
            Dinero = Dinero + 100;
            DIngreso.addMoneda(m);
        }
        else if (m.getValor() == 500){
            Dinero = Dinero + 500;
            DIngreso.addMoneda(m);
        }
        else if (m.getValor() == 1000){
            Dinero = Dinero + 1000;
            DIngreso.addMoneda(m);
        }
    }
    public void paintBus1(Graphics g){

        g.setColor(Color.blue);
        g.fillRoundRect(escala/8,escala/8,12*escala/8, 20*escala/8,40,40); // expendedora color

        g.setColor(Color.black);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 3*escala/16));
        g.fillRoundRect(7*escala/32, 2*escala/8, 33*escala/32, 6*escala/4,60,60); // pantalla de productos
        g.drawRoundRect(escala/8,escala/8,12*escala/8, 20*escala/8, 20,20); // linea de contorno de la maquina
        g.fillRect(5*escala/16, 36*escala/16, 7*escala/8, escala/80); //salidas de producto linea
        g.fillRoundRect(7*escala/32, 21*escala/8, 3*escala/32, escala/4,20,20); //soporte izquierdo
        g.fillRoundRect(22*escala/32, 21*escala/8, 2*escala/32, escala/6,10,10); //soporte central izquierdo
        g.fillRoundRect(33*escala/32, 21*escala/8, 2*escala/32, escala/6,10,10); //soporte central derecho
        g.fillRoundRect(47*escala/32, 21*escala/8, 3*escala/32, escala/4,20,20); //soporte derecho
        g.fillRoundRect(11*escala/8, 8*escala/16, 6*escala/32, escala/12,0,0); // panel de numeros (dinero en pantalla)

        g.setColor(Color.MAGENTA);
        g.fillRoundRect(2*escala/8, 17*escala/8, escala, escala/4,35,35); //salidas de producto

        g.setColor(Color.green);
        g.setFont(new Font("Calibri", Font.PLAIN, escala/16));
        g.drawString(Integer.toString(Dinero), 11*escala/8, 9*escala/16); //dinero que se tiene en pantalla
    }
}
