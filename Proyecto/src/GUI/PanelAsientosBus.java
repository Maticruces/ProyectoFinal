package GUI;

import code.BusDisponible;
import code.Comprador;

import javax.swing.*;
import java.awt.*;

public class PanelAsientosBus extends JPanel {
    private PanelAsientos asientos1;
    private PanelAsientos asientos2;
    private JButton confirmar;
    public PanelAsientosBus(Comprador comprador, BusDisponible buses){
        System.out.println("FLAGGGGGGG");
        setLayout(null);
        setBackground(Color.white);
        asientos1 = new PanelAsientos(0);
        asientos2 = new PanelAsientos(12);

        asientos1.setBounds(0,0,100,370);
        add(asientos1);

        asientos2.setBounds(200,0,100,370);
        add(asientos2);

        confirmar = new JButton("Confirmar");
        add(confirmar);
        confirmar.setBounds(100,380,100,40);

    }
}
