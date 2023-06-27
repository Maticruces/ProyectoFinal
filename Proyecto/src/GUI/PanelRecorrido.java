package GUI;

import javax.swing.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelRecorrido extends JPanel {
    private JComboBox<String> origenComboBox;
    private JComboBox<String> destinoComboBox;
    private JComboBox<String> horarioComboBox;
    private JButton buscar;

    public PanelRecorrido() {
        JLabel origenLabel = new JLabel("Origen:");
        add(origenLabel);

        origenComboBox = new JComboBox<String>();
        origenComboBox.addItem("Concepción");
        origenComboBox.addItem("Santiago");
        origenComboBox.addItem("Valparaiso");
        origenComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String origenSeleccionado = (String) origenComboBox.getSelectedItem();
                String destinoSeleccionado = (String) destinoComboBox.getSelectedItem();

                if (origenSeleccionado != null && destinoSeleccionado != null && origenSeleccionado.equals(destinoSeleccionado)) {
                    // Si se selecciona la misma ciudad como origen y destino, se deshabilita la opción en el combo de destino
                    destinoComboBox.setSelectedIndex(-1);
                }
            }
        });
        add(origenComboBox);

        JLabel destinoLabel = new JLabel("Destino:");
        add(destinoLabel);
        destinoComboBox = new JComboBox<String>();
        destinoComboBox.addItem("Concepción");
        destinoComboBox.addItem("Santiago");
        destinoComboBox.addItem("Valparaiso");
        destinoComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String origenSeleccionado = (String) origenComboBox.getSelectedItem();
                String destinoSeleccionado = (String) destinoComboBox.getSelectedItem();

                if (origenSeleccionado != null && destinoSeleccionado != null && origenSeleccionado.equals(destinoSeleccionado)) {
                    // Si se selecciona la misma ciudad como origen y destino, se deshabilita la opción en el combo de origen
                    origenComboBox.setSelectedIndex(-1);
                }
            }
        });
        add(destinoComboBox);

        JLabel horario = new JLabel("Horario:");
        add(horario);

        horarioComboBox = new JComboBox<String>();
        horarioComboBox.addItem("Salida: 13:00 - Llegada: 15:00");
        horarioComboBox.addItem("Salida: 15:00 - Llegada: 17:00");
        horarioComboBox.addItem("Salida: 17:00 - Llegada: 19:00");
        add(horarioComboBox);

        buscar = new JButton("buscar");
        buscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Buscando...");
            }
        });
        add(buscar);
    }
}

