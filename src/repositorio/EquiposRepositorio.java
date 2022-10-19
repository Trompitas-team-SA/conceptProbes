/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mac20
 */
public class EquiposRepositorio implements iEquiposRepositorio{

    HashMap<String, String[]> Equipos  = new HashMap<>();
    HashMap<String, String[][]> Jugadores = new HashMap<>();
    HashMap<String, String[]> Personal = new HashMap<>();
    
    String  jugadoresEquipo = "";
    int     contador        = 0 ;
    String  idEquipo        = "";
    
    
    @Override
    public void escribirEquipoNuevo( String[] dataEquipo, String[][] dataJugadores, String[] dataTrabajador ) {
        
        
        leerArchivoEquipos();
        
        
        FileWriter fichero = obtenerFichero();
        
        idEquipo = ( Integer.parseInt( idEquipo ) + 1 ) + "";
        
        String data = "\n***********************" + "\n-" + idEquipo + "(" + dataEquipo[0] + "," + dataEquipo[1] + "," + dataEquipo[2] + "," + dataEquipo[3] + "," + dataEquipo[4] + "," + dataEquipo[5] + ","+ dataEquipo[6];
        
        for( int i = 0; i < dataJugadores.length; i ++ ){
           
            data += "\n+Jugador(" + dataJugadores[i][0] + "," + dataJugadores[i][1] + "," + dataJugadores[i][2] + "," + dataJugadores[i][3] + "," + dataJugadores[i][4] + "," + dataJugadores[i][5] + "," + dataJugadores[i][6] + "," + dataJugadores[i][7] + "," + dataJugadores[i][8];
        }
        
        data+= "\nPersonal(" + dataTrabajador[0] + "," + dataTrabajador[1] + "," + dataTrabajador[2] + "\n***********************";
        
        escribir( data, fichero );
    }
        
        
    
    
    public void escribir( String data, FileWriter fichero ){
        
        BufferedWriter bw = new BufferedWriter( fichero );
        
        try {
            bw.write(data ) ;
            bw.close()          ;
            
        } catch (IOException ex) {
            Logger.getLogger(PartidosRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public FileWriter obtenerFichero(){
        
        FileWriter fichero = null;
        
        try{
            
            fichero = new FileWriter( System.getProperty("user.dir") +"/src/database/EquiposLiga.txt", true);
            
        } catch( IOException io ){
            System.out.println("Error al obtener fichero Equipos Repositorio " + io );
        }
        
        return fichero;
    }
    
    @Override
    public String leerArchivoEquipos() {
        
        try{
        
            BufferedReader lectorIterar = obtenerFile();
            String strng;

            while ( (strng = lectorIterar.readLine() ) != null ){
                
                if (!strng.trim().equals("")) {
                    
                        //Validamos si es asterisco o no la linea
                    if( !validarSiEsAsterisco( strng ) ){


                        //Validar si es linea de arbitro o de juego y a partir de ahi guardaremos la data en hashMaps ( objetos de javascript xd ) 

                        switch ( validarSiLineaEsDeEquipoUJugadorUPersonal( strng )) {

                            case 1:
                                ingresarDataEquipos( strng );
                                break;
                            case 2:
                                jugadoresEquipo = jugadoresEquipo +  " / " + strng;
                                ingresarDataJugadores( jugadoresEquipo );
                                break;
                            case 3:
                                ingresarDataPersonal( strng );
                             break;
                        }       
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
        
        File documento = new File( System.getProperty("user.dir") +"/src/database/EquiposLiga.txt");
        BufferedReader lector = null;
        try{
            
            lector = new BufferedReader( new FileReader( documento ) );
            
        } catch( FileNotFoundException ex) {
            System.out.println( "Error al obtener el bufferReader en EquiposRepositorio" + ex );
            
        }
        
        return lector;
    } 
    
    @Override
    public String[][] obtenerNombreYCodigoEquipo(){
        
        leerArchivoEquipos();
        
        HashMap< String,String[]> equiposHash = getHashMapEquipo();
        String[] codigosEquipos = new String[ equiposHash.size() ];

        String codigos = equiposHash.keySet() + "";
        codigos = codigos.replace("[", "").replace("]", "").replaceAll(" ","");
        codigosEquipos = codigos.split(",");        
        
        String [][] arregloNombreCodigoEquipo = new String[ equiposHash.size() ][ 2 ];
        
        for( int i = 0; i < equiposHash.size(); i++ ){
            
            arregloNombreCodigoEquipo[ i ][ 0 ] = equiposHash.get(i + "")[0];
            arregloNombreCodigoEquipo[ i ][ 1 ] = codigosEquipos[ i ];
        }
        
        
        
        return arregloNombreCodigoEquipo;
    }
    
    
    public void actualizarEquipo( String codigoEquipo, String[] datosEquipo, String[][] datosJugadores ){
        
        leerArchivoEquipos();
        Equipos.put( codigoEquipo  , datosEquipo     );
        Jugadores.put( codigoEquipo, datosJugadores );
        
        
        idEquipo = "-1";
        System.out.println( Equipos.size() );
        //Eliminaremos el txt existente y volveremos a reescribir
        File fichero = new File( System.getProperty("user.dir") +"/src/database/EquiposLiga.txt");
        
        if( fichero.delete() ) System.out.println("Borrado con exito");
        else System.out.println("No borrado");
        
        String data = "";
        
        for( int p = 0; p < Equipos.size(); p ++ ){
            
            String[] dataEquipo = Equipos.get(p + "");
            String[][] dataJugadores = Jugadores.get( p + "");
            String[] dataTrabajador = Personal.get( p + "");
            
            FileWriter documento = obtenerFichero();
        
            idEquipo = ( Integer.parseInt( idEquipo ) + 1 ) + "";
            
            if( idEquipo == "0"){
                System.out.println("Entro");
                data = "***********************" + "\n-" + idEquipo + "(" + dataEquipo[0] + "," + dataEquipo[1] + "," + dataEquipo[2] + "," + dataEquipo[3] + "," + dataEquipo[4] + "," + dataEquipo[5] + ","+ dataEquipo[6];
            }
            else{
                data = "\n***********************" + "\n-" + idEquipo + "(" + dataEquipo[0] + "," + dataEquipo[1] + "," + dataEquipo[2] + "," + dataEquipo[3] + "," + dataEquipo[4] + "," + dataEquipo[5] + ","+ dataEquipo[6];
            }
            
        
                for( int i = 0; i < dataJugadores.length; i ++ ){
           
                    data += "\n+Jugador(" + dataJugadores[i][0] + "," + dataJugadores[i][1] + "," + dataJugadores[i][2] + "," + dataJugadores[i][3] + "," + dataJugadores[i][4] + "," + dataJugadores[i][5] + "," + dataJugadores[i][6] + "," + dataJugadores[i][7] + "," + dataJugadores[i][8];
                }
        
            data+= "\nPersonal(" + dataTrabajador[0] + "," + dataTrabajador[1] + "," + dataTrabajador[2] + "\n***********************";
        
            escribir( data, documento );
        }
        
    }

    
    
    
    
    
    
    @Override
    public HashMap<String, String[][]> getHashMapJugadores() {
        
        leerArchivoEquipos();
        return Jugadores;
    }

    @Override
    public HashMap<String, String[]> getHashMapEquipo() {
        
        leerArchivoEquipos();
        return Equipos;
    }

    @Override
    public HashMap<String, String[]> getHashMapPersonal() {
        
        leerArchivoEquipos();
        return Personal;
    }
    
    
    
    
}