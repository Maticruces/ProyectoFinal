package GUI;

import code.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SelectorBus extends JPanel {
    private JComboBox<String> comboBox;
    private JButton button;

    public SelectorBus(Bus[] buses) {

        String[] busNames = new String[buses.length];
        for (int i = 0; i < buses.length; i++) {
            busNames[i] = "Bus " + (i + 1);
        }

        comboBox = new JComboBox<>(busNames);
        comboBox.setBounds(200,200,20,20);
        add(comboBox);

        button = new JButton("Seleccionar");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = comboBox.getSelectedIndex();
                if (selectedIndex >= 0 && selectedIndex < buses.length) {
                    // Hacer algo con el bus seleccionado
                    Bus selectedBus = buses[selectedIndex];
                    System.out.println("Bus seleccionado: " + selectedBus);
                    PanelAsientosBus asientitosss = new PanelAsientosBus();
                } else {
                    System.out.println("No se ha seleccionado un bus válido.");
                }
            }
        });
        add(button);




    }

}
