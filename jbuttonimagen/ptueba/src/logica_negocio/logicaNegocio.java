/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica_negocio;

import datos.Curriculum;
import java.util.ArrayList;
import java.util.List;

public class LogicaNegocio {
    
    private static List<Curriculum> listaCurriculums = new ArrayList<>();

    
    
     public static void aniadirCurriculum(Curriculum curriculum) { 
    
        listaCurriculums.add(curriculum);
    
    }

    public static List<Curriculum> getListaCurriculums() {
        return listaCurriculums;
    }

    public static void setListaCurriculums(List<Curriculum> listaCurriculums) {
        LogicaNegocio.listaCurriculums = listaCurriculums;
    }
     
    public static void vaciarLista() {
    
        listaCurriculums.clear();
    
    }
    
    
}


