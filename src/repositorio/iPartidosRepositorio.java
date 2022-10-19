/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

import java.io.BufferedReader;

/**
 *
 * @author mac20
 */
public interface iPartidosRepositorio {
    
     public String          leerArchivoJuegos()                             ;
     public BufferedReader  obtenerFile()                                   ;
     public boolean         validarSiEsAsterisco( String linea )            ;
     public boolean         validarSiLineaEsDeJuegoUArbitro( String linea ) ;
     public void            ingresarDataPartido( String linea )             ;
     public void            ingresarDataArbitro( String linea )             ;
     public void            imprimirDataPartidos()                          ;
     public void            imprimirDataArbitros()                          ;
}
