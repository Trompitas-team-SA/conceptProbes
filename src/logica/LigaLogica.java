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
public class LigaLogica {

    EquiposLogica equipoL = new EquiposLogica();
    EquiposRepositorio equipo = new EquiposRepositorio();

    public void ordenarPorPartidosGanados() {
        
        String[][] cod = equipo.obtenerNombreYCodigoEquipo();
        
        System.out.println("logica.LigaLogica.ordenarPorPartidosGanados()");
    
        
        
        

    }

    private static class infoEquipo {

        public infoEquipo() {
        }
    }

}
