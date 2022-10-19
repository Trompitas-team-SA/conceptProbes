/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author mac20
 */
public interface iEquiposLogica {
    
    public void imprimirDataEquipos();
    public void escribirEquipoNuevo( String[] datosEquipo, String[][] datosJugadores, String[] dataTrabajador);
    public String[] obtenerEquipoPorId( String idEquipo );
    public String[][] obtenerJugadoresEquipoPorId( String idEquipo );
    public String[] obtenerPersonalEquipoPorId( String idEquipo );
    
    public String[][] obtenerEquiposYCodigos();
}
