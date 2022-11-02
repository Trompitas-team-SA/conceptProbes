/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.HashMap;
import repositorio.EquiposRepositorio;
import repositorio.SubEquipos.TeamRep;

/**
 *
 * @author mac20
 */
public class EquiposLogica implements iEquiposLogica{

    EquiposRepositorio equipo  = new EquiposRepositorio();
    
    @Override
    public void imprimirDataEquipos() {
        
        equipo.imprimirDataEquipos();
    }

    @Override
    public void escribirEquipoNuevo( String[] datosEquipo, String[][] datosJugadores, String[] dataTrabajador ) {
        equipo.escribirEquipoNuevo( datosEquipo, datosJugadores , dataTrabajador );
    }
    
    
    public String[] obtenerEquipoPorId( String equipoId ){
        HashMap<String, String[]> infoEquipo = equipo.getHashMapEquipo();
        
        //System.out.println("Equipo");
        for( int i = 0; i < 7; i ++ ){
            //System.out.print( infoEquipo.get( equipoId )[i] + " , " );
        }
        //System.out.println("\n");
        return infoEquipo.get( equipoId );
    }
    
    
    public String[][] obtenerJugadoresEquipoPorId( String equipoId ){
        HashMap<String, String[][]> infoJugadores = equipo.getHashMapJugadores();
        
        //System.out.println("Jugadores");
        for( int i = 0; i < 12; i ++ ){
            
            for( int k = 0; k < 9; k++ ){
                //System.out.print( infoJugadores.get( equipoId )[i][k] + " , " );
            }
            //System.out.println("\n");
        }
        //System.out.println("\n");
        
        return infoJugadores.get( equipoId );
    }
    
    public String[] obtenerPersonalEquipoPorId( String equipoId ){
        HashMap<String, String[]> infoPersonal = equipo.getHashMapPersonal();
        
        
        //System.out.println("Personal");
        for( int i = 0; i < 3; i ++ ){
            //System.out.print( infoPersonal.get( equipoId )[i] + " , " );
        }
        //System.out.println("\n");
        return infoPersonal.get( equipoId );
    }
    
    
    public String[][] obtenerEquiposYCodigos(){
        
        return equipo.obtenerNombreYCodigoEquipo();
    }
    
    
    
    
    public void actualizarEquipo( String codigoEquipo, String[] datosEquipo, String[][] datosJugadores ){
        equipo.actualizarEquipo(codigoEquipo, datosEquipo, datosJugadores);
    }
    
    
}
