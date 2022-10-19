/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usbcali.nba_project.models;

/**
 *
 * @author mac20
 */
public class Jugador {
    
    private String  numeroCamisa        ;
    private String  nombre              ;
    private String  altura              ;
    private String  peso                ;
    private int     puntosTemporada     ;
    private int     taponesTemporada    ;
    private int     rebotesTemporada    ;
    private int     robosBalonTemporada ;

    public Jugador(String numeroCamisa, String nombre, String altura, String peso, int puntosTemporada, int taponesTemporada, int rebotesTemporada, int robosBalonTemporada ) {
        this.numeroCamisa = numeroCamisa;
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.puntosTemporada = puntosTemporada;
        this.taponesTemporada = taponesTemporada;
        this.rebotesTemporada = rebotesTemporada;
        this.robosBalonTemporada = robosBalonTemporada;
    }
    
    public Jugador(){}

    public String getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(String numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public int getPuntosTemporada() {
        return puntosTemporada;
    }

    public void setPuntosTemporada(int puntosTemporada) {
        this.puntosTemporada = puntosTemporada;
    }

    public int getTaponesTemporada() {
        return taponesTemporada;
    }

    public void setTaponesTemporada(int taponesTemporada) {
        this.taponesTemporada = taponesTemporada;
    }

    public int getRebotesTemporada() {
        return rebotesTemporada;
    }

    public void setRebotesTemporada(int rebotesTemporada) {
        this.rebotesTemporada = rebotesTemporada;
    }

    public int getRobosBalonTemporada() {
        return robosBalonTemporada;
    }

    public void setRobosBalonTemporada(int robosBalonTemporada) {
        this.robosBalonTemporada = robosBalonTemporada;
    }

    
    
    
}
