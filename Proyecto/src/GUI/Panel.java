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
        setLayout(null);
        setBounds(0, 0, 4*Tamano, 3*Tamano);
        this.setBackground(Color.white);

        this.bus = new SelectorBus(busDisponible, comprador);
        pr = new PanelRecorrido(comprador, busDisponible, bus);
        this.busDisponible = busDisponible;
        add(pr);
        add(bus);

        this.setBounds(0,0,700,900);
        pr.setBounds(0,0,700,50);
        bus.setBounds(0,50,700,900);
    }
    public void paint(Graphics g){
        super.paint(g);

    }
}
