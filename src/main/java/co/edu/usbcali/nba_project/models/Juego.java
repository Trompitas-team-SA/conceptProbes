/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usbcali.nba_project.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mac20
 */
public class Juego {
    
    private ArrayList<String>    equiposEnfrentados;
    private Date    fechaJuego;
    private List    listaArbitros;
    private String  marcador;
    private String  ganadorEncuentro;
    private String  tiempoJugado;
    private String  numExpectadores;
    private String  locacion;

    public Juego(ArrayList<String> equiposEnfrentados, Date fechaJuego, List listaArbitros, String marcador, String ganadorEncuentro, String tiempoJugado, String numExpectadores, String locacion) {
        this.equiposEnfrentados = equiposEnfrentados;
        this.fechaJuego = fechaJuego;
 
        this.listaArbitros = listaArbitros;
        this.marcador = marcador;
        this.ganadorEncuentro = ganadorEncuentro;
        this.tiempoJugado = tiempoJugado;
        this.numExpectadores = numExpectadores;
        this.locacion = locacion;
    }
    
    public Juego(){}

    public String getLocacion(){
        return this.locacion;
    }
    
    public void setLocacion( String locacion ){
        this.locacion = locacion;
    }
    
    
    public ArrayList<String> getEquiposEnfrentados() {
        return equiposEnfrentados;
    }

    public void setEquiposEnfrentados( ArrayList<String> equiposEnfrentados ) {
        this.equiposEnfrentados = equiposEnfrentados;
    }

    public Date getFechaJuego() {
        return fechaJuego;
    }

    public void setFechaJuego(Date fechaJuego) {
        this.fechaJuego = fechaJuego;
    }


    public List getListaArbitros() {
        return listaArbitros;
    }

    public void setListaArbitros(List listaArbitros) {
        this.listaArbitros = listaArbitros;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }

    public String getGanadorEncuentro() {
        return ganadorEncuentro;
    }

    public void setGanadorEncuentro(String ganadorEncuentro) {
        this.ganadorEncuentro = ganadorEncuentro;
    }

    public String getTiempoJugado() {
        return tiempoJugado;
    }

    public void setTiempoJugado(String tiempoJugado) {
        this.tiempoJugado = tiempoJugado;
    }

    public String getNumExpectadores() {
        return numExpectadores;
    }

    public void setNumExpectadores(String numExpectadores) {
        this.numExpectadores = numExpectadores;
    }
    
    
    
    
    
}
