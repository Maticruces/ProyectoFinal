package GUI;

import code.Bus1;
import code.Comprador;


import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Ventana extends JFrame {
    private JButton moneda100, moneda500, Billete1000, getTicket, getAsiento;
    private JButton JBPanelN0, JBPanelN1, JBPanelN2;
    private Comprador com;
    private int escala;
    private Panel P;
    private Bus1 B;

    public Ventana() {
        super();
        escala = 160; //con 160 es 640x480 con 240 es 960x720 con 320 es 1280x960
        P = new Panel(escala);
        //B = P.getBus(); pas = P.getPas();

        setSize(4 * escala, 3 * escala); //tamaño fijo de 4:3
        setTitle("Simulador de buses");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
        setLayout(null);

        crearGUI();
        add(P);
        setVisible(true);
    }

    public void crearGUI() {
        ImageIcon imagen = new ImageIcon(getClass().getResource("Precios.png"));
        JBPanelN0 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance( 2*escala / 4, 2*escala / 4, Image.SCALE_SMOOTH)));
        JBPanelN0.setBounds(13 * escala / 4, 13* escala / 6, 2*escala / 4, 2*escala / 4);

        imagen = new ImageIcon(getClass().getResource("Asientos.png"));
        JBPanelN1 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(9 * escala / 4, 9 * escala / 4, Image.SCALE_SMOOTH)));
        JBPanelN1.setBounds(5, 5 * escala / 4, 7 * escala / 4, 7 * escala / 4);

        imagen = new ImageIcon(getClass().getResource("BusRojo.png"));
        JBPanelN2 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(4*escala / 4, 4*escala / 4, Image.SCALE_SMOOTH)));
        JBPanelN2.setBounds(5,  escala/15, 4*escala / 4, 4*escala / 4);

        imagen = new ImageIcon(getClass().getResource("Moneda100.png"));
        moneda100 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(escala / 4, escala / 4, Image.SCALE_SMOOTH)));
        moneda100.setBounds(49 * escala / 16, escala / 8, escala / 4, escala / 4);
        moneda100.setBorderPainted(false);
        moneda100.setContentAreaFilled(false);

        imagen = new ImageIcon(getClass().getResource("Moneda500.png"));
        moneda500 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(escala / 4, escala / 4, Image.SCALE_SMOOTH)));
        moneda500.setBounds(49 * escala / 16, 4*escala / 8, escala / 4, escala / 4);
        moneda500.setBorderPainted(false);
        moneda500.setContentAreaFilled(false);

        imagen = new ImageIcon(getClass().getResource("Billete1000.png"));
        Billete1000 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(escala / 4, escala / 4, Image.SCALE_SMOOTH)));
        Billete1000.setBounds(49 * escala / 16, 7*escala / 8, escala / 4, escala / 4);
        Billete1000.setBorderPainted(false);
        Billete1000.setContentAreaFilled(false);

        getTicket = new JButton();
        getTicket.setBounds(5 * escala / 4, 7 * escala / 4, 3 * escala / 16, 3 * escala / 16);

        getAsiento = new JButton();
        getAsiento.setBounds(3 * escala / 8, 17 * escala / 8, escala, escala / 4);
        getAsiento.setBorderPainted(false);
        getAsiento.setContentAreaFilled(false);
        getAsiento.setToolTipText("Click para reservar asiento en Bus");

        getTicket = new JButton();
        getTicket.setBounds(10 * escala / 4, 7 * escala / 4, 3 * escala / 8, 3 * escala / 16);
        getTicket.setBorderPainted(true);
        getTicket.setContentAreaFilled(true);
        getTicket.setToolTipText("Click para recibir Ticket");

        add(JBPanelN0);add(JBPanelN1);add(JBPanelN2);
        add(moneda100);add(moneda500);add(Billete1000);
        add(getTicket);
    }
}
