/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Reloj;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author chava
 */
public class Control implements ActionListener{
    
    private JTextField text;
    private Timer timer;
    private Reloj reloj;
    
    public Control(JTextField text){
        this.reloj = new Reloj(0);
        this.text = text;
        startTimer();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String quien = e.getActionCommand();
            if (quien == "Editar"){
                if(timer.isRunning()){
                    cancelTimer();
                }else{
                    startTimer();
                }
            }else if(quien == "Mas"){
                this.reloj.setVel(1);
                cancelTimer();
                startTimer();
            }else{
                String hora = this.text.getText();
                DateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                Date date = sdf.parse(hora);
                this.reloj.addSeconds(date, 1);
                this.text.setText(this.reloj.toString());
            }
        } catch (ParseException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cancelTimer(){
        this.timer.stop();
    }
    
    public void startTimer(){
        this.timer = new Timer(this.reloj.getVel()*1000, this);
        this.timer.start();
    }
           
    
}
