package code;

import code.Asiento;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/*
*@NoProducto es una clase que representa el numero o codigo
asociado a cierto Asiento del bus
*@param: numSerie
*@param: x
*@param: y
*@param: escala
*@return: La posicion de cierto producto dentro del expendedor
*/

public class NoAsiento extends Asiento{
    public NoAsiento(int numSerie, int x, int y, int escala){
        super(numSerie, x, y, escala);
    }
    @Override
    public void paint(Graphics g){
        ImageIcon imagen = new ImageIcon(getClass().getResource("0.png"));
        //g.drawImage(imagen.getImage(), 0, 0, 0, 0, 0);
    }
}
