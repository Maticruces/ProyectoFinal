package GUI;
import code.*;

import java.awt.*;
import javax.swing.JPanel;

/*
*@Panel es una clase que interactua con la ventana
del expendedor.
*/

public class Panel extends JPanel{
    private PanelRecorrido pr;
    private SelectorBus bus;
    private BusDisponible buses;
    public Panel(int Tamano){
        super();
        setBounds(0, 0, 4*Tamano, 3*Tamano);
        this.setBackground(Color.white);
        pr = new PanelRecorrido();
        buses = new BusDisponible();
        Bus[] buses = new Bus[2];
        SelectorBus bus = new SelectorBus(buses);
        add(pr);
        add(bus);
    }
    public void paint(Graphics g){
        super.paint(g);

    }
}
