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
import repositorio.SubEquipos.JugadoresRep;
import repositorio.SubEquipos.PersonalRep;
import repositorio.SubEquipos.TeamRep;


/**
 *
 * @author mac20
 */
public class EquiposRepositorio implements iEquiposRepositorio{

    HashMap<String, String[]> Equipos  = new HashMap<>();
    HashMap<String, String[][]> Jugadores = new HashMap<>();
    HashMap<String, String[]> Personal = new HashMap<>();
    
    TeamRep teamRep = new TeamRep();
    JugadoresRep jugadoresRep = new JugadoresRep();
    PersonalRep personalRep = new PersonalRep();
    
    String  jugadoresEquipo = "";
    String  idEquipo        = "";
    
    
    @Override
    public void escribirEquipoNuevo( String[] dataEquipo, String[][] dataJugadores, String[] dataTrabajador ) {
        
       
        try {
            leerArchivoEquipos();
            
            
            FileWriter fichero = obtenerFichero();
            
            
            
            idEquipo = ( Integer.parseInt( idEquipo ) + 1 ) + "";
            
            
            
            String data = "\n***********************" + "\n-" + idEquipo + "(" + dataEquipo[0] + "," + dataEquipo[1] + "," + dataEquipo[2] + "," + dataEquipo[3] + "," + dataEquipo[4] + "," + dataEquipo[5] + ","+ dataEquipo[6];
            
            for( int i = 0; i < dataJugadores.length; i ++ ){
                
                data += "\n+Jugador(" + dataJugadores[i][0] + "," + dataJugadores[i][1] + "," + dataJugadores[i][2] + "," + dataJugadores[i][3] + "," + dataJugadores[i][4] + "," + dataJugadores[i][5] + "," + dataJugadores[i][6] + "," + dataJugadores[i][7] + "," + dataJugadores[i][8];
            }
            
            data+= "\nPersonal(" + dataTrabajador[0] + "," + dataTrabajador[1] + "," + dataTrabajador[2] + "\n***********************";
            
            escribir( data, fichero );
            
            fichero.close();
        } catch (IOException ex) {
            Logger.getLogger(EquiposRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
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
                                 
                                teamRep.ingresarDataEquipos(strng);
                                idEquipo = teamRep.getIdEquipo();
                                Equipos = teamRep.getHashEquipos();
                                
                                break;
                            case 2:
                                jugadoresEquipo = jugadoresRep.actualizarStringJugadoresEquipo(strng);
                                jugadoresRep.ingresarDataJugadores(jugadoresEquipo,idEquipo);
                                Jugadores = jugadoresRep.getHashJugadores();
                                
                                break;
                            case 3:
                                personalRep.ingresarDataPersonal( strng , idEquipo);
                                Personal = personalRep.getHashPersonal();
                             break;
                        }       
                    }     
                }
                
            }
            lectorIterar.close();
        }  catch( IOException Io){
            System.out.println( "Error IO en EquiposRepositorio" + Io );
        }
        
        return "";
    }

 
    
    
    
    
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
        
        
         System.out.println(idEquipo);     
   
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
        
        for(int i=0;i<equiposHash.size();i++){
            
            codigosEquipos[i]= i+"";
                
        }
        
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
        teamRep.añadirEquipoHash(datosEquipo, idEquipo);
        jugadoresRep.añadirJugadoresHash(datosJugadores, idEquipo);
        
        
        idEquipo = "-1";
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
    
    public void setJugadoresEquipo(String str){
        jugadoresEquipo = str;
    }
    
    public String getJugadoresEquipo (){
        return jugadoresEquipo;
    }
    
    
}