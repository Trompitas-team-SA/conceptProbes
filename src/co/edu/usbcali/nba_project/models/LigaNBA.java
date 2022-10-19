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
public class LigaNBA {
    
    private List equiposParticipantes   ;
    private List jornadaJuegos          ;
    private String ganadorTemporada     ;
    private Juego eventoPartido         ;
    
    
    
    public LigaNBA( List equiposParticipantes,  List jornadaJuegos, String ganadorTemporada, Juego eventoPartido ){
       
        this.equiposParticipantes   = equiposParticipantes  ;
        this.jornadaJuegos          = jornadaJuegos         ;
        this.ganadorTemporada       = ganadorTemporada      ;
        this.eventoPartido          = eventoPartido         ;
    }
    
    public LigaNBA(){
        
    }

    public List getEquiposParticipantes() {
        return equiposParticipantes;
    }

    public void setEquiposParticipantes(List equiposParticipantes) {
        this.equiposParticipantes = equiposParticipantes;
    }



    public List getJornadaJuegos() {
        return jornadaJuegos;
    }

    public void setJornadaJuegos(List jornadaJuegos) {
        this.jornadaJuegos = jornadaJuegos;
    }

    public String getGanadorTemporada() {
        return ganadorTemporada;
    }

    public void setGanadorTemporada(String ganadorTemporada) {
        this.ganadorTemporada = ganadorTemporada;
    }

    public Juego getEventoPartido() {
        return eventoPartido;
    }

    public void setEventoPartido(Juego eventoPartido) {
        this.eventoPartido = eventoPartido;
    }
    
    
    
    
}
