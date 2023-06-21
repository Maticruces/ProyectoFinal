
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
*@Ventana es una clase donde se reciben las interacciones entre metodos y funciones
y esta las pone en funcionamiento.
*/

public class Ventana extends JFrame {
    private JButton moneda100, moneda500, Billete1000, getvuelto, getProducto, moneda100_2, moneda500_2, Billete1000_2;
    private JButton JBPanelN1, JBPanelN2;
    private Pasajero pas;
    private int escala;
    private Panel P;
    private Bus B;

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

        crearGUI();add(P);setVisible(true);
    }
    public void crearGUI() {
        ImageIcon imagen = new ImageIcon(getClass().getResource("Precios.png"));
        JBPanelN1 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(6 * escala / 4, 6 * escala / 4, Image.SCALE_SMOOTH)));
        JBPanelN1.setBounds(10 * escala / 4, 5 * escala / 4, 6 * escala / 4, 6 * escala / 4);

        imagen = new ImageIcon(getClass().getResource("Asientos.png"));
        JBPanelN2 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(9 * escala / 4, 9 * escala / 4, Image.SCALE_SMOOTH)));
        JBPanelN2.setBounds(5, 5 * escala / 4, 6 * escala / 4, 6 * escala / 4);

        imagen = new ImageIcon(getClass().getResource("Moneda100.png"));
        moneda100 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(escala / 4, escala / 4, Image.SCALE_SMOOTH)));
        moneda100.setBounds(2 * escala, escala / 4, escala / 4, escala / 4);
        moneda100.setBorderPainted(false);
        moneda100.setContentAreaFilled(false);
        moneda100_2 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(escala / 4, escala / 4, Image.SCALE_SMOOTH)));
        moneda100_2.setBounds(49 * escala / 16, 17 * escala / 16, escala / 4, escala / 4);
        moneda100_2.setBorderPainted(false);
        moneda100_2.setContentAreaFilled(false);
        moneda100_2.setToolTipText("Actualmente no hay monedas de 100");

        imagen = new ImageIcon(getClass().getResource("Moneda500.png"));
        moneda500 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(escala / 4, escala / 4, Image.SCALE_SMOOTH)));
        moneda500.setBounds(9 * escala / 4, escala / 4, escala / 4, escala / 4);
        moneda500.setBorderPainted(false);
        moneda500.setContentAreaFilled(false);
        moneda500_2 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(escala / 4, escala / 4, Image.SCALE_SMOOTH)));
        moneda500_2.setBounds(49 * escala / 16, 23 * escala / 16, escala / 4, escala / 4);
        moneda500_2.setBorderPainted(false);
        moneda500_2.setContentAreaFilled(false);
        moneda500_2.setToolTipText("Actualmente no hay monedas de 500");

        imagen = new ImageIcon(getClass().getResource("Billete1000.png"));
        Billete1000 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(escala / 4, escala / 4, Image.SCALE_SMOOTH)));
        Billete1000.setBounds(5 * escala / 2, escala / 4, escala / 4, escala / 4);
        Billete1000.setBorderPainted(false);
        Billete1000.setContentAreaFilled(false);
        Billete1000_2 = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(escala / 4, escala / 4, Image.SCALE_SMOOTH)));
        Billete1000_2.setBounds(49 * escala / 16, 29 * escala / 16, escala / 4, escala / 4);
        Billete1000_2.setBorderPainted(false);
        Billete1000_2.setContentAreaFilled(false);
        Billete1000_2.setToolTipText("Actualmente no hay Billetes de 1000");

        getvuelto = new JButton();
        getvuelto.setBounds(5 * escala / 4, 7 * escala / 4, 3 * escala / 16, 3 * escala / 16);
        getProducto = new JButton();
        getProducto.setBounds(3 * escala / 8, 17 * escala / 8, escala, escala / 4);
        getProducto.setBorderPainted(false);
        getProducto.setContentAreaFilled(false);
        getProducto.setToolTipText("Click para reservar asiento en Bus");

        getvuelto = new JButton();
        getvuelto.setBounds(5 * escala / 4, 7 * escala / 4, 3 * escala / 8, 3 * escala / 16);
        getvuelto.setBorderPainted(false);
        getvuelto.setContentAreaFilled(true);
        getvuelto.setToolTipText("Click para recibir Vuelto");

        add(JBPanelN1);
        add(JBPanelN2);
        add(moneda100);
        add(moneda500);
        add(Billete1000);
        add(moneda100_2);
        add(moneda500_2);
        add(Billete1000_2);
        add(getvuelto);

        /*
        evento_moneda(moneda100);
        evento_moneda(moneda500);
        evento_moneda(Billete1000);
        evento_takeVuelto(getvuelto);
        evento_moneda_2(moneda100_2);
        evento_moneda_2(moneda500_2);
        evento_moneda_2(Billete1000_2);

        add(getAsiento);
        add(conAsiento);

        evento_takeAsiento(getAsiento);
        evento_conAsiento(conAsiento);
        */
    }

}
/*
    public void evento_moneda_2(JButton act){
        act.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) throws RuntimeException {
                if (act.getBounds().y == 17*escala/16) {
                    try {
                        bus.IngresaMoneda(pas.getMonedabyValor(new Moneda100()));
                    } catch ( PagoIncorrectoException ex) {
                        throw new RuntimeException(ex);
                    }
                }else{
                    if(act.getBounds().y == 23*escala/16) {
                        try {
                            bus.IngresaMoneda(pas.getMonedabyValor(new Moneda500()));
                        } catch (NohayMonedaException | PagoIncorrectoException ex) {
                            throw new RuntimeException(ex);
                        }
                    }else{
                        try{
                            bus.IngresaMoneda(pas.getMonedabyValor(new Billete1000()));
                        } catch (NohayMonedaException | PagoIncorrectoException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                }
                if (pas.getcountm100()>0) moneda100_2.setToolTipText("El numero de serie de la primera moneda encontrada es " + pas.getMonedaby(new Moneda100()).getSerie());
                if (pas.getcountm500()>0) moneda500_2.setToolTipText("El numero de serie de la primera moneda encontrada es " + pas.getMonedaby(new Moneda500()).getSerie());
                if (pas.getcountb1000()>0) Billete1000_2.setToolTipText("El numero de serie de la primera moneda encontrada es " + pas.getMonedaby(new Billete1000()).getSerie());
                if (pas.getcountm100()==0) moneda100_2.setToolTipText("Actualmente no hay monedas de 100");
                if (pas.getcountm500()==0) moneda500_2.setToolTipText("Actualmente no hay monedas de 500");
                if (pas.getcountb1000()==0) Billete1000_2.setToolTipText("Actualmente no hay Billetes de 1000");
                repaint();
            }
        });
    }
    public void evento_conAsiento(JButton act){
        act.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pas.AsientoEnBus()) {
                    JOptionPane.showMessageDialog(null, "Compraste una " + pas.queAsiento());
                    conAsiento.setToolTipText("Espacio de Asiento del Pasajero");
                }else JOptionPane.showMessageDialog(null, "Aun no se a reservado un asiento");
            }
        });
    }
    public void evento_takeVuelto(JButton act){
        act.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pas.getVuelto();
                if (pas.getcountm100()>0) moneda100_2.setToolTipText("El numero de serie de la primera moneda encontrada es " + pas.getMonedaby(new Moneda100()).getSerie());
                if (pas.getcountm500()>0) moneda500_2.setToolTipText("El numero de serie de la primera moneda encontrada es " + pas.getMonedaby(new Moneda500()).getSerie());
                if (pas.getcountb1000()>0) Billete1000_2.setToolTipText("El numero de serie de la primera moneda encontrada es " + pas.getMonedaby(new Billete1000()).getSerie());
                repaint();
            }
        });
    }
    /*
    public void evento_takeAsiento(JButton act){
        act.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (act.getBounds().x == 3*escala/8&&!pas.ProductoEnCom()){
                    try {
                        pas.recojeProducto();
                    } catch (NoHayProductoException ex) {
                        throw new RuntimeException(ex);
                    }
                    conProducto.setToolTipText("Consumir producto con numero de serie: " + pas.getProducto().getSerie());
                    repaint();
                }
            }
        });
    }

    public void evento_moneda(JButton act){
        act.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (act.getBounds().x == 2*escala) {
                    try {
                        exp.IngresaMoneda(new Moneda100());
                    } catch (PagoIncorrectoException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }else{
                    if(act.getBounds().x == 9*escala/4){
                        try {
                            exp.IngresaMoneda(new Moneda500());
                        } catch (PagoIncorrectoException ex) {
                            JOptionPane.showMessageDialog(null, ex.getMessage());
                        }
                    }else{
                        try {
                            exp.IngresaMoneda(new Billete1000());
                        } catch (PagoIncorrectoException ex) {
                            JOptionPane.showMessageDialog(null, ex.getMessage());
                        }
                    }
                }
                repaint();
            }
        });
    }
}
*/