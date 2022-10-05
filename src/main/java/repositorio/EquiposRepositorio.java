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
import java.util.HashMap;

/**
 *
 * @author mac20
 */
public class EquiposRepositorio implements iEquiposRepositorio{

    HashMap<String, String[]> Equipos  = new HashMap<>();
    HashMap<String, String[]> Jugadores = new HashMap<>();
    HashMap<String, String[]> Personal = new HashMap<>();
    
    @Override
    public String leerArchivoEquipos(){
        
        
        try{
        
            BufferedReader lectorIterar = obtenerFile();
            String texto;
        
            while ( (texto = lectorIterar.readLine() ) != null ){
            
                //Validamos si es asterisco o no la linea
                if( !validarSiEsAsterisco( texto ) ){
                    
                    //Validar si es linea de arbitro o de juego y a partir de ahi guardaremos la data en hashMaps ( objetos de javascript xd )
                    switch (validarSiLineaEsDeEquipoUJugadorUPersonal( texto )) {
                        case 1 -> ingresarDataEquipos( texto );
                        case 2 -> ingresarDataJugadores( texto );
                        default -> ingresarDataPersonal(texto);
                    }
                    
                }     
                
            }        
            
        }catch( IOException Io){
            System.out.println( "Error IO en EquiposRepositorio" + Io );
        }
        
        return "";
        
    }  
    
    //Lee el archivo de texto de EquiposLiga
    @Override
    public BufferedReader obtenerFile(){
        
        File documento = new File( System.getProperty("user.dir") +"/src/main/java/database/EquiposLiga.txt");
        BufferedReader lector = null;
        
        try{
            
            lector = new BufferedReader( new FileReader( documento ) );
            
        } catch( FileNotFoundException ex) {
            System.out.println( "Error al obtener el bufferReader en EquiposRepositorio" + ex );
            
        }
        
        return lector;
    }
    
    @Override
    public boolean validarSiEsAsterisco( String linea ){
        //Si la linea empieza con * devuelve true
        if( linea.charAt(0) == '*'){
            return true;
        }
        return false;
    }
    
    @Override
    public int validarSiLineaEsDeEquipoUJugadorUPersonal( String linea ){
        
        if( linea.charAt(0) == '-'){
            
            return 1;
            
        }else if(linea.charAt(0) == '+'){
        
            return 2;
        
        }
                
        return 3;
        
    }
    
    @Override
    public void ingresarDataEquipos( String linea ){
        
        //datosConParentesis es un arreglo donde el primer valor es lo que existe antes del "(" y despues ( antes es el id = Nombre del equipo y despues es la data 
        String[ ] datosConParentesis = linea.split("\\(");
        
        String idEquipo =  String.valueOf( linea.charAt(1) );

        String[] informacionEquipo = datosConParentesis[1].split(",");  
        Equipos.put( idEquipo, informacionEquipo ); 
        
    }
    
    /**
     *
     * @param linea
     */
    @Override
    public void ingresarDataJugadores( String linea ){
        
        String[] datosConParentesis = linea.split("\\(");     
        
        String[] informacionJugador = datosConParentesis[1].split(",");
        
        String codigoJugador = String.valueOf(  Jugadores.size() + 1 );
        
        Jugadores.put( codigoJugador, informacionJugador );
        
    }
    
    @Override
    public void ingresarDataPersonal( String linea ){
        
        String[] datosConParentesis = linea.split("\\(");   
        
        String[] informacionPersonal = datosConParentesis[1].split(",");
        
        String codigoPersonal = String.valueOf(  Personal.size() + 1 );
        
        Personal.put( codigoPersonal, informacionPersonal );
        
    }
    
    @Override
    public void imprimirDataEquipos(){
        
        leerArchivoEquipos();
        
        //Imprimimos info del primer equipo
        for( int i = 0; i < Equipos.size(); i ++){

            System.out.println("\nInfo Equipos "+ (i+1) +":\n");
            String[] dataEquipos = Equipos.get( String.valueOf(i) );
            
            for( int k = 0; k < dataEquipos.length; k++ ){ 
                
                System.out.print( dataEquipos[k]);
                
            }
            
            System.out.println("");
            
            //Imprimimos jugadores del equipo asignado
            for( int j = 0; j <= 12; j ++){
            
                String[] data = Jugadores.get( String.valueOf(j) );

                if( data != null ){
                    
                    for( int k = 0; k < data.length; k++ ){ 

                     System.out.print( data[k]);

                    }

                }

                System.out.println("");

            }
            
            //Imprimimos el personal de ese equipo
            for( int x = 0; x <= 3; x ++){

                String[] data = Personal.get( String.valueOf(x) );
                
                if( data != null ){
                    
                    for( int k = 0; k < data.length; k++ ){ 

                     System.out.print( data[k]);
                     
                    }
                    
                }

                System.out.println("");
            }
            
            System.out.println("\n");
            
        } 
        
    }

    public HashMap<String, String[]> getPartidosJugados(){
        leerArchivoEquipos();
        return Equipos;
    }
    
    public HashMap<String, String[]> getArbitros(){
        leerArchivoEquipos();
        return Jugadores;
    }

}