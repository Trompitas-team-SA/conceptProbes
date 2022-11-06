/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.SubEquipos;

import java.util.HashMap;
import repositorio.EquiposRepositorio;

public class TeamRep {
    
    String idEquipo = "";
    HashMap<String, String[]> Equipos  = new HashMap<>();
     
    public void ingresarDataEquipos(String linea) {
        
        
         //datosConParentesis es un arreglo donde el primer valor es lo que existe antes del "(" y despues ( antes es el id = Nombre del equipo y despues es la data 
        String[ ] datosConParentesis = linea.split("\\(");
        
        idEquipo=datosConParentesis[0].substring(1);
        String[] informacionEquipo = datosConParentesis[1].split(",");  
        
        Equipos.put(idEquipo, informacionEquipo ); 
    }
     
    
    public void añadirEquipoHash(String []equipo, String id){
        idEquipo = id;
        
        System.out.println("Teamrep id " + idEquipo + " nombre " + equipo[0] );
        Equipos.put(idEquipo,equipo);
        idEquipo = "-1";
    }
    
    public String getIdEquipo(){
        return idEquipo;
    }
    
    public HashMap<String,String[]> getHashEquipos(){
        return Equipos;
    }
    
}
