package GUI;

import code.Bus;
import code.BusDisponible;
import code.Comprador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectorBus extends JPanel implements ActionListener {
    private JComboBox<String> comboBox;
    private JButton button;
    private BusDisponible busDisponible;
    private Comprador comprador;

    public SelectorBus(BusDisponible busDisponible, Comprador comprador) {
        this.busDisponible = busDisponible;
        this.comprador = comprador;
        busDisponible.filtrarBuses(comprador.getOrigenElegido(), comprador.getDestinoElegido(), comprador.getHorarioElegido());

        String[] busNames = new String[busDisponible.getBusesDisponibles().size()];
        for (int i = 0; i < busDisponible.getBusesDisponibles().size(); i++) {
            busNames[i] = "Bus " + (i + 1);
        }

        comboBox = new JComboBox<>(busNames);
        add(comboBox);

        button = new JButton("Seleccionar");
        button.addActionListener(this);
        add(button);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            int selectedIndex = comboBox.getSelectedIndex();
            if (selectedIndex >= 0 && selectedIndex < busDisponible.getBusesDisponibles().size()) {
                // Hacer algo con el bus seleccionado
                Bus selectedBus = busDisponible.getBusDisponible(selectedIndex);
                System.out.println("Bus seleccionado: " + selectedBus);

                if(selectedBus != null){
                    this.setLayout(null);
                    PanelAsientosBus asientosBus = new PanelAsientosBus(comprador, busDisponible);
                    this.add(asientosBus);
                    asientosBus.setBounds(0,100,700,900);
                    revalidate();
                    repaint();
                }

            } else {
                System.out.println("No se ha seleccionado un bus válido.");
            }
        }

    }

    public void actualizarBuses(BusDisponible busDisponible) {
        busDisponible.filtrarBuses(comprador.getOrigenElegido(), comprador.getDestinoElegido(), comprador.getHorarioElegido());
        System.out.println(busDisponible.getBusesDisponibles().size());
        this.busDisponible = busDisponible;
        String[] busNames = new String[busDisponible.getBusesDisponibles().size()];
        for (int i = 0; i < busDisponible.getBusesDisponibles().size(); i++) {
            busNames[i] = "Bus " + (i + 1);
        }
        comboBox.setModel(new DefaultComboBoxModel<>(busNames));
        comboBox.setSelectedIndex(-1);
    }
}
