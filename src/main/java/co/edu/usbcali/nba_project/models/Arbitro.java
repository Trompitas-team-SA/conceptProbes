/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usbcali.nba_project.models;

import java.util.Date;

/**
 *
 * @author mac20
 */
public class Arbitro {
    
    
    private String nombre;
    private String edad;
    private int PartidosPitados;
    private int faltasPitadas;
    private int expulsionJugador;

    public Arbitro(String nombre, String edad, int PartidosPitados, int faltasPitadas, int expulsionJugador) {
        this.nombre = nombre;
        this.edad = edad;
        this.PartidosPitados = PartidosPitados;
        this.faltasPitadas = faltasPitadas;
        this.expulsionJugador = expulsionJugador;
    }
    
    
    
    public Arbitro(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad(  ) {
        return edad;
    }

    public void setEdad( String edad) {
        this.edad = edad;
    }


    public int getPartidosPitados() {
        return PartidosPitados;
    }

    public void setPartidosPitados(int PartidosPitados) {
        this.PartidosPitados = PartidosPitados;
    }

    public int getFaltasPitadas() {
        return faltasPitadas;
    }

    public void setFaltasPitadas(int faltasPitadas) {
        this.faltasPitadas = faltasPitadas;
    }

    public int getExpulsionJugador() {
        return expulsionJugador;
    }

    public void setExpulsionJugador(int expulsionJugador) {
        this.expulsionJugador = expulsionJugador;
    }
    
    
    
}
