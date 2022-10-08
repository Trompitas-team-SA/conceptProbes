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

    @Override
    public void escribirEquipoNuevo() {
        EquiposRepositorio equipo  = new EquiposRepositorio();
        
        String[] datosEquipo = { "escrituraPrueba", "Karolg", "12", "0", "0", "0", "0" };
        String[][] datosJugadores = { {"d1", "Nombre1", "d2", "d3", "d4", "d5", "d6", "d7", "d8" },
                                        {"d1", "Nombre2", "d2", "d3", "d4", "d5", "d6", "d7", "d8" },
                                        {"d1", "Nombre3", "d2", "d3", "d4", "d5", "d6", "d7", "d8" },
                                        {"d1", "Nombre4", "d2", "d3", "d4", "d5", "d6", "d7", "d8" },
                                        {"d1", "Nombre5", "d2", "d3", "d4", "d5", "d6", "d7", "d8" },
                                        {"d1", "Nombre6", "d2", "d3", "d4", "d5", "d6", "d7", "d8" },
                                        {"d1", "Nombre7", "d2", "d3", "d4", "d5", "d6", "d7", "d8" },
                                        {"d1", "Nombre8", "d2", "d3", "d4", "d5", "d6", "d7", "d8" },
                                        {"d1", "Nombre9", "d2", "d3", "d4", "d5", "d6", "d7", "d8" },
                                        {"d1", "Nombre10", "d2", "d3", "d4", "d5", "d6", "d7", "d8" },
                                        {"d1", "Nombre11", "d2", "d3", "d4", "d5", "d6", "d7", "d8" },
                                        {"d1", "Nombre12", "d2", "d3", "d4", "d5", "d6", "d7", "d8" } 
                
        };
        String[] dataTrabajador = {"Penenory", "Nutricionista Dietista", "Nutricionista"};
        
        equipo.escribirEquipoNuevo( datosEquipo, datosJugadores , dataTrabajador );
    }
    
}
