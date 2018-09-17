/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatrorelojes;

import Modelo.Reloj;
import Vista.Ventana;

/**
 *
 * @author chava
 */
public class Cuatrorelojes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ventana v = new Ventana("4 Relojes");
        v.setVisible( true );
        v.setSize(600, 200);
        v.setDefaultCloseOperation(v.EXIT_ON_CLOSE);
    }
    
}
