/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import repositorio.EquiposRepositorio;

/**
 *
 * @author mac20
 */
public class EquiposLogica implements iEquiposLogica{

    @Override
    public void imprimirDataEquipos() {
        
        EquiposRepositorio equipo = new EquiposRepositorio();
        equipo.imprimirDataEquipos();
        
    }
    
}
