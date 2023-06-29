package GUI;

import code.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelRecorrido extends JPanel implements ActionListener {
    private JComboBox<Recorridos> origenComboBox;
    private JComboBox<Recorridos> destinoComboBox;
    private JComboBox<String> horarioComboBox;
    private JButton buscar;

    public PanelRecorrido() {
        JLabel origenLabel = new JLabel("Origen:");
        add(origenLabel);

        origenComboBox = new JComboBox<>(Recorridos.values());
        origenComboBox.setSelectedIndex(-1);
        origenComboBox.addActionListener(this);
        add(origenComboBox);


        JLabel destinoLabel = new JLabel("Destino:");
        add(destinoLabel);
        destinoComboBox = new JComboBox<>(Recorridos.values());
        destinoComboBox.setSelectedIndex(-1);

        destinoComboBox.addActionListener(this);
        add(destinoComboBox);

        JLabel horario = new JLabel("Horario salida - llegada:");
        add(horario);

        horarioComboBox = new JComboBox<>();
        horarioComboBox.addItem("13:00 - 15:00");
        horarioComboBox.addItem("15:00 - 17:00");
        horarioComboBox.addItem("17:00 - 19:00");
        add(horarioComboBox);

        buscar = new JButton("buscar");
        horarioComboBox.setSelectedIndex(-1);
        buscar.addActionListener(this);
        add(buscar);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == origenComboBox) {
            Recorridos origenSeleccionado = (Recorridos) origenComboBox.getSelectedItem();
            Recorridos destinoSeleccionado = (Recorridos) destinoComboBox.getSelectedItem();
            if (origenSeleccionado != null && destinoSeleccionado != null && origenSeleccionado.equals(destinoSeleccionado)) {
                destinoComboBox.setSelectedIndex(-1);
            }
        } else if (e.getSource() == destinoComboBox) {
            Recorridos origenSeleccionado = (Recorridos) origenComboBox.getSelectedItem();
            Recorridos destinoSeleccionado = (Recorridos) destinoComboBox.getSelectedItem();
            if (origenSeleccionado != null && destinoSeleccionado != null && origenSeleccionado.equals(destinoSeleccionado)) {
                origenComboBox.setSelectedIndex(-1);
            }
        } else if (e.getSource() == buscar) {
            Recorridos origenSeleccionado = (Recorridos) origenComboBox.getSelectedItem();
            Recorridos destinoSeleccionado = (Recorridos) destinoComboBox.getSelectedItem();
            if (origenSeleccionado != null && destinoSeleccionado != null && origenSeleccionado == Recorridos.CONCEPCION && destinoSeleccionado == Recorridos.VALPARAISO) {
                System.out.println("Correcto");
            } else {
                System.out.println("Error");
            }
        }
    }
}