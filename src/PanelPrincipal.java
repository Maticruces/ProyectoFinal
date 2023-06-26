
import java.awt.*;
import javax.swing.JPanel;

/*
*@PanelPrincipal es una clase que interactua con la ventana
del expendedor.
*/

public class PanelPrincipal extends JPanel{
    public PanelPrincipal(int Tamano){
        super();
        setBounds(0, 0, 4*Tamano, 3*Tamano);
        this.setBackground(Color.white);
    }
    public void paint(Graphics g){
        super.paint(g);
    }
}
