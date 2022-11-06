/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.HashMap;

/**
 *
 * @author mac20
 */
public interface iEquiposRepositorio {
    
    public String                       leerArchivoEquipos()                                        ;
    public BufferedReader               obtenerFile()                                               ;
    public boolean                      validarSiEsAsterisco( String linea )                        ;
    public int                          validarSiLineaEsDeEquipoUJugadorUPersonal( String linea )   ;
    
    public void                         imprimirDataEquipos()                                       ;  
    
    public HashMap<String, String[][]>  getHashMapJugadores ()                                      ;
    public HashMap<String, String[] >   getHashMapEquipo    ()                                      ;
    public HashMap<String, String[] >   getHashMapPersonal  ()                                      ;
    
    public void                         escribirEquipoNuevo( String[] dataEquipo, String[][] dataJugadores, String[] dataTrabajador  )  ;
    public FileWriter                   obtenerFichero()                                                                                ;
    public void                         escribir( String data, FileWriter fichero )                                                     ;
    
    
    public String[][] obtenerNombreYCodigoEquipo();
    public void actualizarEquipo( String codigoEquipo, String[] datosEquipo, String[][] datosJugadores );
}
