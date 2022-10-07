/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author mac20
 */
public class EquiposRepositorio implements iEquiposRepositorio{

    HashMap<String, String[]> Equipos  = new HashMap<>();
    HashMap<String, String[][]> Jugadores = new HashMap<>();
    HashMap<String, String[]> Personal = new HashMap<>();
    
    String jugadoresEquipo = "";
    int contador = 0;
    String idEquipo = "";
    
    @Override
    public String leerArchivoEquipos() {
        
        
        try{
        
            BufferedReader lectorIterar = obtenerFile();
            String strng;

            while ( (strng = lectorIterar.readLine() ) != null ){
           
                //Validamos si es asterisco o no la linea
                if( !validarSiEsAsterisco( strng ) ){
                    
                    
                    //Validar si es linea de arbitro o de juego y a partir de ahi guardaremos la data en hashMaps ( objetos de javascript xd ) 
                    
                    switch ( validarSiLineaEsDeEquipoUJugadorUPersonal( strng )) {
                        
                        case 1:
                            //Entro en equipo
                            
                            ingresarDataEquipos( strng );
                            break;
                        case 2:
                            //Entro jugador 
                            jugadoresEquipo = jugadoresEquipo +  " / " + strng;
                            ingresarDataJugadores( jugadoresEquipo );
                            break;
                        case 3:
                            //Entra trabajador
                            ingresarDataPersonal( strng );
                         break;
                    }
                    
                }     
            }        
        }  catch( IOException Io){
            System.out.println( "Error IO en EquiposRepositorio" + Io );
        }
        
        return "";
    }

    
    
    @Override
    public void ingresarDataJugadores(String linea) {
        
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
    
    
    @Override
    public boolean validarSiEsAsterisco(String linea) {
        
        if( linea.charAt( 0 ) == '*'){
            return true;
        }
        return false;
    }

    @Override
    public int validarSiLineaEsDeEquipoUJugadorUPersonal(String linea) {
        
        if( linea.charAt(0 ) == '-') return 1;
        else if( linea.charAt(0) == '+') return 2;
        else return 3;
    }

    @Override
    public void ingresarDataEquipos(String linea) {
        
        
         //datosConParentesis es un arreglo donde el primer valor es lo que existe antes del "(" y despues ( antes es el id = Nombre del equipo y despues es la data 
        String[ ] datosConParentesis = linea.split("\\(");
        
        idEquipo =  String.valueOf( linea.charAt(1) );
        String[] informacionEquipo = datosConParentesis[1].split(",");  
        
        Equipos.put( idEquipo, informacionEquipo ); 
    }

 

    @Override
    public void ingresarDataPersonal(String linea) {
        
        String[] datosConParentesis = linea.split("\\(");   
        
        String[] informacionPersonal = datosConParentesis[1].split(",");
        
        Personal.put( idEquipo, informacionPersonal );
        idEquipo = "";
    }

    @Override
    public void imprimirDataEquipos() {
        
        leerArchivoEquipos();
        
        
        System.out.println("\n");
        for( int i = 0; i < Equipos.size(); i ++ ){
               
            System.out.println("\n\n------------------------------------------------");
            System.out.println("Datos del equipo: ");
            
            for( int j = 0; j < Equipos.get("" + i).length; j ++  ){
                
                System.out.print( Equipos.get("" + i ) [ j ] + " , ");
            }
            
            System.out.println("\n");
            System.out.println("Informacion personal: ");
            
            for( int j = 0; j < Personal.get("" + i).length; j ++  ){
                
                System.out.print( Personal.get("" + i ) [ j ] + " , ");
            }
            
            System.out.println("\n");
            System.out.println("Jugadores");
            
            
            
            for( int j = 0; j < Jugadores.get( i + "").length; j ++ ){
                
                for( int k = 0; k < 9; k ++ ){
                     System.out.print( Jugadores.get("" + i )[j][k] + " , ");
                }
                
                System.out.println("");
            }
            
           
        }
        
            
     } 
    
    
    

    
    
    
      @Override
    public BufferedReader obtenerFile() {
        
        File documento = new File( System.getProperty("user.dir") +"/src/main/java/database/EquiposLiga.txt");
        BufferedReader lector = null;
        try{
            
            lector = new BufferedReader( new FileReader( documento ) );
            
        } catch( FileNotFoundException ex) {
            System.out.println( "Error al obtener el bufferReader en EquiposRepositorio" + ex );
            
        }
        
        return lector;
    }
   
    
}