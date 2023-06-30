package GUI;
import code.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelAsientos extends JPanel {
    private JButton[] botones;
    private Bus busElegido;
    private Comprador comprador;
    public PanelAsientos(int n, Bus busElegido, Comprador comprador){
        this.busElegido = busElegido;
        this.comprador = comprador;

        setLayout(new GridLayout(6, 2));
        botones = new JButton[24];
        if(busElegido != null) {
            for (int i = n; i < n + 12; i++) {
                if (busElegido.getAsiento(i).getTipo() == "Asiento normal") {
                    if(busElegido.getAsiento(i).getStatus()) {
                        botones[i] = new JButton(new ImageIcon("Proyecto/src/imagenes/asientoNormalOcupado.png"));
                        botones[i].setEnabled(false);
                    }else{
                        botones[i] = new JButton(new ImageIcon("Proyecto/src/imagenes/asientoNormalDisponible.png"));
                    }
                    botones[i].setBackground(Color.white);
                    botones[i].addActionListener(new BotonListener(i));
                    add(botones[i]);
                } else if (busElegido.getAsiento(i).getTipo() == "Asiento premium") {
                    if(busElegido.getAsiento(i).getStatus()) {
                        botones[i] = new JButton(new ImageIcon("Proyecto/src/imagenes/asientoPremiumOcupado.png"));
                    }else{
                        botones[i] = new JButton(new ImageIcon("Proyecto/src/imagenes/asientoPremiumDisponible.png"));
                    }
                    botones[i].setBackground(Color.white);
                    botones[i].addActionListener(new BotonListener(i));
                    add(botones[i]);
                } else if (busElegido.getAsiento(i).getTipo() == "Asiento VIP") {
                    if(busElegido.getAsiento(i).getStatus()) {
                        botones[i] = new JButton(new ImageIcon("Proyecto/src/imagenes/asientoVIPOcupado.png"));
                    }else{
                        botones[i] = new JButton(new ImageIcon("Proyecto/src/imagenes/asientoVIPDisponible.png"));
                    }
                    botones[i].setBackground(Color.white);
                    botones[i].addActionListener(new BotonListener(i));
                    add(botones[i]);
                }
            }
        }
    }
    private class BotonListener implements ActionListener {
        private int botonIndex;
        private boolean ocupado;

        public BotonListener(int index) {
            botonIndex = index;
            busElegido.getAsiento(botonIndex).cambiarStatus();
            ocupado = busElegido.getAsiento(botonIndex).getStatus();
        }

        public void actionPerformed(ActionEvent e) {
            ocupado = !ocupado;
            if (ocupado) {
                if (busElegido.getAsiento(botonIndex).getTipo().equals("Asiento normal")) {
                    botones[botonIndex].setIcon(new ImageIcon("Proyecto/src/imagenes/asientoNormalDisponible.png"));
                    comprador.removeAsientosElegido(busElegido.getAsiento(botonIndex));

                } else if (busElegido.getAsiento(botonIndex).getTipo().equals("Asiento premium")) {
                    botones[botonIndex].setIcon(new ImageIcon("Proyecto/src/imagenes/asientoPremiumDisponible.png"));
                    comprador.removeAsientosElegido(busElegido.getAsiento(botonIndex));

                } else if (busElegido.getAsiento(botonIndex).getTipo().equals("Asiento VIP")) {
                    botones[botonIndex].setIcon(new ImageIcon("Proyecto/src/imagenes/asientoVIPDisponible.png"));
                    comprador.removeAsientosElegido(busElegido.getAsiento(botonIndex));
                }
            } else {
                if (busElegido.getAsiento(botonIndex).getTipo().equals("Asiento normal")) {
                    botones[botonIndex].setIcon(new ImageIcon("Proyecto/src/imagenes/asientoNormalOcupado.png"));
                    comprador.addAsientosElegido(busElegido.getAsiento(botonIndex));
                } else if (busElegido.getAsiento(botonIndex).getTipo().equals("Asiento premium")) {
                    botones[botonIndex].setIcon(new ImageIcon("Proyecto/src/imagenes/asientoPremiumOcupado.png"));
                    comprador.addAsientosElegido(busElegido.getAsiento(botonIndex));
                } else if (busElegido.getAsiento(botonIndex).getTipo().equals("Asiento VIP")) {
                    botones[botonIndex].setIcon(new ImageIcon("Proyecto/src/imagenes/asientoVIPOcupado.png"));
                    comprador.addAsientosElegido(busElegido.getAsiento(botonIndex));
                }
            }
        }

    }
    public void paint(Graphics g){
        super.paint(g);
    }
}
