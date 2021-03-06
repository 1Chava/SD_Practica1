/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.Timer;

public class Reloj {
    private int horas;
    private int minutos;
    private int segundos;
    private Calendar calendario;
    private TimeZone zonahoraria;
    private String formato;
    private DateFormat dateFormat;
    private String currentTime;
    private String[] zonas = {"America/Mexico_City", "Europe/London", "Asia/Tokyo", "Atlantic/Reykjavik"};
    private int vel =  1;
    
    public Reloj(int zona) {
        this.zonahoraria = TimeZone.getTimeZone(zonas[zona]);
        this.formato = "HH:mm:ss";
        this.dateFormat = new SimpleDateFormat(this.formato);
        this.calendario = Calendar.getInstance(this.zonahoraria);
        this.dateFormat.setTimeZone(calendario.getTimeZone());
        this.currentTime = dateFormat.format(calendario.getTime());
        String[] time = this.currentTime.split ( ":" );
        this.horas = Integer.parseInt(time[0].trim());
        this.minutos = Integer.parseInt(time[1].trim());
        this.segundos = Integer.parseInt(time[2].trim());
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    public int getVel(){
        return this.vel;
    }
    
    public void setVel(int tiempo){
         this.vel = this.vel + tiempo;
    }

    @Override
    public String toString() {
        return horas + ":" + minutos + ":" + segundos;
    }
    
    public void addSeconds(Date date, Integer seconds) {
        this.calendario = Calendar.getInstance();
        calendario.setTime(date);
        calendario.add(Calendar.SECOND, seconds);
        this.formato = "HH:mm:ss";
        this.dateFormat = new SimpleDateFormat(this.formato);
        this.dateFormat.setTimeZone(calendario.getTimeZone());
        this.currentTime = dateFormat.format(calendario.getTime());
        String[] time = this.currentTime.split ( ":" );
        this.horas = Integer.parseInt(time[0].trim());
        this.minutos = Integer.parseInt(time[1].trim());
        this.segundos = Integer.parseInt(time[2].trim());
    }
    
}
