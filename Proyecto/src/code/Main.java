package code;

import GUI.Ventana;

/*
 *@author: Matias, Camilo
 *hace la funcion de llamar a la clase ventana para ejecutarla en pantalla
 */
public class Main{
    public static void main(String[] args) {

        Ventana v = new Ventana(); //única sentencia

        Bus1 micro = new Bus1();
        micro.agregarAsientos(5,2,1, 1000,1500,3000);
        System.out.println(micro.getAsiento(0).getStatus());

    }
}
