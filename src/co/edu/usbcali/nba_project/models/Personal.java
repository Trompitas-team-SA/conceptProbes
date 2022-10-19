/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usbcali.nba_project.models;

/**
 *
 * @author mac20
 */
public class Personal {
    
    
    private String nombre       ;
    private String titulo       ;
    private String cargo        ;

    public Personal(String nombre, String titulo, String cargo) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.cargo = cargo;
    }
    
    public Personal(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
    
    
}
