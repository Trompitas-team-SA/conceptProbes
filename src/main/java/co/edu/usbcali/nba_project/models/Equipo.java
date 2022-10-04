/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usbcali.nba_project.models;

import java.util.List;

/**
 *
 * @author mac20
 */
public class Equipo {
    
    private String  nombre              ;
    private String  locacion            ;
    private List    listaPersonal       ;
    private List    listaJugadores      ;
    private String  temporadasGanadas   ;
    
    private int     partidosGanados     ;
    private int     partidosPerdidos    ;
    private int     puntosPorJuego      ;
    private String  nombreEstadio       ;
      
    private int     victoriasLocal      ;
    private int     victoriasVisitantes ;

    
    
    public Equipo(String nombre, String locacion, List listaPersonal, List listaJugadores, String temporadasGanadas, int partidosGanados, int partidosPerdidos, int puntosPorJuego, String nombreEstadio, int victoriasLocal, int victoriasVisitantes) {
        this.nombre = nombre;
        this.locacion = locacion;
        this.listaPersonal = listaPersonal;
        this.listaJugadores = listaJugadores;
        this.temporadasGanadas = temporadasGanadas;
        this.partidosGanados = partidosGanados;
        this.partidosPerdidos = partidosPerdidos;
        this.puntosPorJuego = puntosPorJuego;
        this.nombreEstadio = nombreEstadio;
        this.victoriasLocal = victoriasLocal;
        this.victoriasVisitantes = victoriasVisitantes;
    }
    
    public Equipo(){}

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getPuntosPorJuego() {
        return puntosPorJuego;
    }

    public void setPuntosPorJuego(int puntosPorJuego) {
        this.puntosPorJuego = puntosPorJuego;
    }

    public String getNombreEstadio() {
        return nombreEstadio;
    }

    public void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }

    public int getVictoriasLocal() {
        return victoriasLocal;
    }

    public void setVictoriasLocal(int victoriasLocal) {
        this.victoriasLocal = victoriasLocal;
    }

    public int getVictoriasVisitantes() {
        return victoriasVisitantes;
    }

    public void setVictoriasVisitantes(int victoriasVisitantes) {
        this.victoriasVisitantes = victoriasVisitantes;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    public List getListaPersonal() {
        return listaPersonal;
    }

    public void setListaPersonal(List listaPersonal) {
        this.listaPersonal = listaPersonal;
    }

    public List getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public String getTemporadasGanadas() {
        return temporadasGanadas;
    }

    public void setTemporadasGanadas(String temporadasGanadas) {
        this.temporadasGanadas = temporadasGanadas;
    }
    
    
    
    
    
}
