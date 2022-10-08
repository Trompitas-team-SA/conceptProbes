/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

import java.io.BufferedReader;
import java.io.FileWriter;

/**
 *
 * @author mac20
 */
public interface iEquiposRepositorio {
    
    public String leerArchivoEquipos();
    public BufferedReader obtenerFile();
    public boolean validarSiEsAsterisco( String linea );
    public int validarSiLineaEsDeEquipoUJugadorUPersonal( String linea );
    public void ingresarDataEquipos( String linea );
    public void ingresarDataJugadores( String linea );
    public void ingresarDataPersonal(String linea);
    
    public void imprimirDataEquipos();  
    
    
    public void escribirEquipoNuevo( String[] dataEquipo, String[][] dataJugadores, String[] dataTrabajador  );
    public FileWriter obtenerFichero();
    public void escribir( String data, FileWriter fichero );
}
