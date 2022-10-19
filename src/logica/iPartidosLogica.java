/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author mac20
 */
public interface iPartidosLogica {
    
    public void añadirPartido            ();
    public void imprimirPartidosYArbitros();
    public String[] obtenerGanadorEncuentroYMarcador(String[] puntos, String[] equipos);
}
