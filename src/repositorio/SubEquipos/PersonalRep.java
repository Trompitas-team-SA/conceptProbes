/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.SubEquipos;

import java.util.HashMap;

/**
 *
 * @author MAURICIO
 */
public class PersonalRep {
    
    HashMap<String, String[]> Personal = new HashMap<>();
    
    public void ingresarDataPersonal(String linea, String idEquipo) {
        
        String[] datosConParentesis = linea.split("\\(");   
        
        String[] informacionPersonal = datosConParentesis[1].split(",");
        
        Personal.put( idEquipo, informacionPersonal );

    }
    
    
    public HashMap<String, String[]> getHashPersonal(){
        return Personal;
    }
}
