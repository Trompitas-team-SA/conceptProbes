/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import repositorio.PartidosRepositorio;

/**
 *
 * @author mac20
 */
public class PartidosLogica implements iPartidosLogica {
    
    
    @Override
    public void añadirPartido( String nombreEquipo1, String nombreEquipo2, String puntosEqui1, String puntosEqui2, String fecha, String nArbitro, String nFaltas, String nEstadio, String nEspectadores){
        
        PartidosRepositorio partidos = new PartidosRepositorio(); 
        String marcador = puntosEqui1 + " - " + puntosEqui2;
        
        //Encontrar ganador
        
        String ganador =    "";
        if( Integer.parseInt( puntosEqui1 ) > Integer.parseInt( puntosEqui2 )) ganador = nombreEquipo1;
        else ganador = nombreEquipo2;

        String stringPartido = "" + nombreEquipo1 + " , " + nombreEquipo2 + " , " + fecha + " , " + nEstadio + " , " + marcador + " , " + ganador + " , " + nEspectadores;
        String stringArbitro = "" + nArbitro + " , " + nFaltas + " , " + "-";
        
        partidos.añadirRegistroJuego( stringPartido , stringArbitro  );
    }

    @Override
    public void imprimirPartidosYArbitros() {
        
        PartidosRepositorio partido = new PartidosRepositorio();
        partido.imprimirDataPartidos();
        partido.imprimirDataArbitros();
    }

    @Override
    public String[] obtenerGanadorEncuentroYMarcador(String[] puntos, String[] equipos) {
        
        String[] ganadorYMarcador = new String[2];
        
        
        if( Integer.parseInt( puntos[ 0 ].trim() ) > Integer.parseInt( puntos[ 1 ].trim() ) ) ganadorYMarcador[0] = equipos[0];
        else ganadorYMarcador[0] = equipos[1];
        
        ganadorYMarcador[1] = puntos[0] + " - " + puntos[1];
        
        return ganadorYMarcador;
    }
}
