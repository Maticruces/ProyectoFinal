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
    private BusDisponible busDisponible;
    public Panel(int Tamano, Comprador comprador, BusDisponible busDisponible){
        super();
        setBounds(0, 0, 4*Tamano, 3*Tamano);
        this.setBackground(Color.white);
        SelectorBus bus = new SelectorBus(busDisponible, comprador);
        pr = new PanelRecorrido(comprador, busDisponible, bus);
        this.busDisponible = busDisponible;
        //Bus[] buses = new Bus[2];
        add(pr);
        add(bus);
    }
    public void paint(Graphics g){
        super.paint(g);

    }
}
