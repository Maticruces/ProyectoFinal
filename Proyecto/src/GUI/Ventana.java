package GUI;
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

public class Ventana extends JFrame{
    private Panel P;
    private int escala;

    public Ventana() {
        super();
        escala = 160; //con 160 es 640x480 con 240 es 960x720 con 320 es 1280x960

        setSize(4 * escala, 3 * escala); //tamaño fijo de 4:3
        setTitle("Simulador de buses");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        this.setResizable(false);
        crearGUI();
        setVisible(true);
    }

    public void crearGUI() {
    }
}