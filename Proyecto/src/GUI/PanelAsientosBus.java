package GUI;

import javax.swing.*;
import java.awt.*;

public class PanelAsientosBus extends JPanel {
    private PanelAsientos asientos1;
    private PanelAsientos asientos2;
    private JButton confirmar;
    public PanelAsientosBus(){
        setLayout(null);
        setBackground(Color.white);
        asientos1 = new PanelAsientos(0);
        asientos2 = new PanelAsientos(12);

        asientos1.setBounds(0,0,100,370);
        add(asientos1);

        //JLabel pasillo = new JLabel(new ImageIcon("C:\\Users\\Pc\\Desktop\\Nueva carpeta\\ProyectoFinal\\Proyecto\\src\\imagenes\\17538.jpg"));
       // pasillo.setBounds(100,0,100,348);
        //add(pasillo);

        asientos2.setBounds(200,0,100,370);
        add(asientos2);

        confirmar = new JButton("Confirmar");
        add(confirmar);
        confirmar.setBounds(100,380,100,40);

    }
}
