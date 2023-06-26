package code;

import javax.swing.*;

public abstract class Asiento extends JPanel{
    private int numSerie;
    private int x, y, Tamano;
    private JButton JB;
    public Asiento(int numSerie, int x, int y, int escala){
        this.numSerie = numSerie;
        this.x = x;this.y = y;
        this.Tamano = escala;
    }
    public int getSerie(){
        return numSerie;
    }
    public void changeLocation(int x,int y){
        this.x = x;this.y = y;
    }
    public void setJButton(JButton act){
        JB = act;
    }
    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
    public int getTamano(){
        return Tamano;
    }
}