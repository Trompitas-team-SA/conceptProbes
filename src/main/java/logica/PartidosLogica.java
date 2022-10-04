/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import co.edu.usbcali.nba_project.models.Arbitro;
import co.edu.usbcali.nba_project.models.Juego;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import repositorio.PartidosRepositorio;
import java.util.Date;
import java.time.Month;
import java.time.LocalDate;

/**
 *
 * @author mac20
 */
public class PartidosLogica implements iPartidosLogica {
    
    
    
    public void imprimirAñadirDataPartidosYArbitros(){
        
        PartidosRepositorio partidos = new PartidosRepositorio();
        
        
        //Data partido = equipo1, equipo2, fecha, lugar, marcador, ganador, nEspectadores
        //Data arbitro = nombre, edad, nFaltasPitadas
        
        
        
        Juego instPartido = new Juego();
        Arbitro arbitro1 = new Arbitro();
        
        ArrayList<String> equipos = new ArrayList<>();
        equipos.add("Brian");
        equipos.add("Pablo");
        Date fecha = new Date();
        
        instPartido.setEquiposEnfrentados( equipos );
        instPartido.setFechaJuego( fecha );
        instPartido.setLocacion("Capri");
        instPartido.setMarcador("110-210");
        instPartido.setGanadorEncuentro("Pablo");
        instPartido.setNumExpectadores("10002");
        
        String [] dataPartido = new String[7];
        dataPartido[0] = instPartido.getEquiposEnfrentados().get(0)     + "";
        dataPartido[1] = instPartido.getEquiposEnfrentados().get(1)     + "";
        dataPartido[2] = instPartido.getFechaJuego()                         + "";
        dataPartido[3] = instPartido.getLocacion()                           + "";
        dataPartido[4] = instPartido.getMarcador()                           + "";
        dataPartido[5] = instPartido.getGanadorEncuentro()                   + "";
        dataPartido[6] = instPartido.getNumExpectadores()                    + "";
        
        
        
        
        arbitro1.setNombre("pepeson4");
        arbitro1.setEdad( "24" );
        arbitro1.setExpulsionJugador( 19 );
        
        
        
        String[] dataArbitro = new String[3];
        dataArbitro[0] = arbitro1.getNombre();
        dataArbitro[1] = arbitro1.getEdad() + "";
        dataArbitro[2] = arbitro1.getExpulsionJugador() + "";
        
        
        
        
        
        String stringPartido = "" + dataPartido[0] + " , " + dataPartido[1] + " , " + dataPartido[2] + " , " + dataPartido[3] + " , " + dataPartido[4] + " , " + dataPartido[5] + " , " + dataPartido[6];
        String stringArbitro = "" + dataArbitro[0] + " , " + dataArbitro[1] + " , " + dataArbitro[2];
        
        
         
        partidos.añadirRegistroJuego( stringPartido , stringArbitro  );
        
        
        partidos.imprimirDataArbitros();
        partidos.imprimirDataPartidos();
    }
}
