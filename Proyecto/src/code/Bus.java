package code;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Bus extends JPanel {
    private ArrayList<Asiento> aBus;
    private int x, y, escala;

    public Bus(int posx, int posy, int tescale) {
        aBus = new ArrayList<Asiento>();
        escala = tescale;
        x = posx;
        y = posy;
    }

    public void addAsiento(Asiento b) {
        aBus.add(b);
    }

    public Asiento getAsiento() {
        if (aBus.isEmpty()) return new NoAsiento(-1, 0, 0, 0);

        else return aBus.remove(0);
    }

    public Asiento getAsientoEn(int n) {
        if (n >= aBus.size()) return new NoAsiento(0, 0, 0, 0);

        else return aBus.get(n);
    }

    public int getStorage() {
        return aBus.size();
    }
    public void paint(Graphics g){
        for (int i = 0; i < 5; i++) {
            Asiento b;
            b = this.getAsientoEn(i);
            b.changeLocation(x + 3*escala/16 + (i*(3*escala/16)), y + 3*escala/16);
            b.paint(g);
        }
    }
}
