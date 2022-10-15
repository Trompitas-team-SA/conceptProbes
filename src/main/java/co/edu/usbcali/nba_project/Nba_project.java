/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.usbcali.nba_project;

import co.edu.usbcali.nba_project.models.LigaNBA;
import interfaces.CrearEquipoInterfaz;
import java.io.File;
import logica.EquiposLogica;
import logica.PartidosLogica;



/**
 *
 * @author mac20
 */
public class Nba_project {

    public static void main(String[] args) {
       
        
        //CrearEquipoInterfaz
        
        CrearEquipoInterfaz crearEquipo = new CrearEquipoInterfaz();
        crearEquipo.setVisible( true );
       
    }
    
}
