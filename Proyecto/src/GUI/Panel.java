package GUI;

import code.Asiento;

import java.awt.*;
import javax.swing.JPanel;

/*
*@Panel es una clase que interactua con la ventana
del expendedor.
*/

public class Panel extends JPanel{
    private Asiento as;
    public Panel(int Tamano){
        super();
        setBounds(0, 0, 4*Tamano, 3*Tamano);
        this.setBackground(Color.white);
    }
    public void paint(Graphics g){
        super.paint(g);
    }
}
