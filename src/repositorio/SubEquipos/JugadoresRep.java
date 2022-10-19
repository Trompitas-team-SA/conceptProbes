/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.SubEquipos;

import java.util.HashMap;

/**
 *
 * @author MAURICIO
 */
public class JugadoresRep {
    
    HashMap<String, String[][]> Jugadores = new HashMap<>();
    int contador = 0;
    String  jugadoresEquipo = "";
    
    
    public void ingresarDataJugadores(String linea, String idEquipo) {
        
        contador ++;
        
        if( contador == 12 ){
           
            jugadoresEquipo = "";
            contador = 0;
            
            Jugadores.put( idEquipo, dataJugadoresEquipo(linea));
          
        }
    }
    
    public String[][] dataJugadoresEquipo( String linea ){
        
        linea = linea.substring( 2 );
        String[] separandoJugadoresConDiagonal = linea.split("/");
        
        String[][] informacionJugadoresCompleta = new String[ separandoJugadoresConDiagonal.length ][9];
        
        
        for( int i = 0; i < separandoJugadoresConDiagonal.length; i++ ){
            
            String dataJugador = separandoJugadoresConDiagonal[ i ].split("\\(")[1];
            String[] datosJugadorSeparados = dataJugador.split(",");
            
            informacionJugadoresCompleta[ i ] = datosJugadorSeparados;
        }
        
        return informacionJugadoresCompleta;
    };
    
    
    
    public String actualizarStringJugadoresEquipo(String linea){
        jugadoresEquipo = jugadoresEquipo +  " / " + linea;
        
        return jugadoresEquipo;
    }
    
    public void añadirJugadoresHash(String [][]jugadores, String id){
        
        Jugadores.put(id,jugadores);
    }
    
    
    public HashMap<String, String[][]> getHashJugadores(){
        return Jugadores;
    }
    
    public int getContador(){
        return contador;
    }
    
    public String getJugadoresEquipo(){
        return jugadoresEquipo;
    }
    
}
