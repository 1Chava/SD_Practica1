/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Control;
import Modelo.Reloj;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author chava
 */
public class PanelVentana extends JPanel{
    
    private JTextField[] relojes;
    private JButton[] botones;
    private Control[] controles;
    
    public PanelVentana(){
        initComponents();
    }
    
    private void initComponents(){
        setLayout(null);
        this.relojes = new JTextField[4];
        this.botones = new JButton[4];
        this.controles = new Control[4];
        int x = 10;
        int y = 10;
        int incY = 30;
        int ancho = 170;
        int alto = 30;
        for (int i = 0; i < 4; i++) {
            Reloj reloj = new Reloj(i);
            relojes[i] = new JTextField(reloj.toString());
            relojes[i].setBounds(x, y + (i * incY), ancho, alto);
            controles[i] = new Control(relojes[i]);
            relojes[i].addActionListener(controles[i]);
            add(relojes[i]);
        }
        for (int n = 0; n < 4; n++) {
            botones[n] = new JButton("Editar");
            add(botones[n]);
            botones[n].setBounds(x + 200, y + (n * incY), ancho, alto);
            botones[n].addActionListener(controles[n]);
        }
        
    }
}
