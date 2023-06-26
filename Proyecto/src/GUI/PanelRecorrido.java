package GUI;

import javax.swing.*;

public class PanelRecorrido extends JPanel {
    private JComboBox<String> origenComboBox;
    private JComboBox<String> destinoComboBox;
    private JComboBox<String> horarioComboBox;
    private JButton buscar;
    public PanelRecorrido(){

        JLabel origenLabel = new JLabel("Origen:");
        add(origenLabel);

        origenComboBox = new JComboBox<String>();
        origenComboBox.addItem("Concepción");
        origenComboBox.addItem("Santiago");
        origenComboBox.addItem("Valparaiso");
        add(origenComboBox);

        JLabel destinoLabel = new JLabel("Destino:");
        add(destinoLabel);
        destinoComboBox = new JComboBox<String>();
        destinoComboBox.addItem("Concepción");
        destinoComboBox.addItem("Santiago");
        destinoComboBox.addItem("Valparaiso");
        add(destinoComboBox);

        JLabel horario = new JLabel("Horario:");
        add(horario);

        horarioComboBox = new JComboBox<String>();
        horarioComboBox.addItem("Salida: 13:00 - Llegada: 15:00");
        horarioComboBox.addItem("Salida: 15:00 - Llegada: 17:00");
        horarioComboBox.addItem("Salida: 17:00 - Llegada: 19:00");
        add(horarioComboBox);

        buscar = new JButton("buscar");
        add(buscar);
    }
}
