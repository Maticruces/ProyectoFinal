package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelAsientos extends JPanel {
    private JButton[] botones;
    private JButton[] botones2;
    public PanelAsientos(int n){
        setLayout(new GridLayout(6, 2));
        botones = new JButton[24];
        for (int i = n; i < n+12; i++) {
            botones[i] = new JButton(new ImageIcon("Proyecto/src/imagenes/asientoNormalDisponible.png"));  // Ruta de la imagen
            botones[i].setBackground(Color.white);
            botones[i].addActionListener(new BotonListener(i));
            add(botones[i]);
        }
    }
    private class BotonListener implements ActionListener {
        private int botonIndex;
        private boolean ocupado;

        public BotonListener(int index) {
            botonIndex = index;
            ocupado = false;
        }

        public void actionPerformed(ActionEvent e) {
            // Cambiar la imagen del botón
            ocupado = !ocupado;
            if (ocupado) {
                botones[botonIndex].setIcon(new ImageIcon("Proyecto/src/imagenes/asientoNormalOcupado.png"));  // Ruta de la imagen
            } else {
                botones[botonIndex].setIcon(new ImageIcon("Proyecto/src/imagenes/asientoNormalDisponible.png"));  // Ruta de la imagen
            }
        }
    }
    public void paint(Graphics g){
        super.paint(g);

    }
}
