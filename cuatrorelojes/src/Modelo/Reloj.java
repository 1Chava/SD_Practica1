/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.Timer;

/**
 *
 * @author chava
 */
public class Reloj {
    private int horas;
    private int minutos;
    private int segundos;
    private Calendar calendario;
    private TimeZone zonahoraria;
    private String[] zonas = {"America/Mexico_City", "Europe/London", "Asia/Tokyo", "Atlantic/Reykjavik"};
    
    public Reloj(int zona) {
        this.zonahoraria = TimeZone.getTimeZone(zonas[zona]);
        this.calendario = new GregorianCalendar();
        this.calendario.setTimeZone(this.zonahoraria);
        this.horas = this.calendario.get(Calendar.HOUR);
        this.minutos = this.calendario.get(Calendar.MINUTE);
        this.segundos = this.calendario.get(Calendar.SECOND);
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

    @Override
    public String toString() {
        return "Reloj{" + "horas=" + horas + ", minutos=" + minutos + ", segundos=" + segundos + '}';
    }
    
}
