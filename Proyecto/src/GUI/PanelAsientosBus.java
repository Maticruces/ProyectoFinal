package GUI;

import code.*;


import javax.swing.*;
import java.awt.*;

public class PanelAsientosBus extends JPanel {
    private PanelAsientos asientos1;
    private PanelAsientos asientos2;
    private JButton confirmar;
    public PanelAsientosBus(Comprador comprador, BusDisponible buses, Bus busElegido){
        setLayout(null);
        setBackground(Color.white);
        asientos1 = new PanelAsientos(0, busElegido);
        asientos2 = new PanelAsientos(12, busElegido);

        asientos1.setBounds(0,0,100,370);
        add(asientos1);

        asientos2.setBounds(200,0,100,370);
        add(asientos2);

        confirmar = new JButton("Confirmar");
        add(confirmar);
        confirmar.setBounds(100,380,100,40);

    }
}
