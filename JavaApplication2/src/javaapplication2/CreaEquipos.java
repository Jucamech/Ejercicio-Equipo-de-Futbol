package javaapplication2;

import javax.swing.JOptionPane;

public class CreaEquipos {
    String nombreEquipo;
    String estadio;
    String titulos;
    
    public String setTeamName(String str){
        nombreEquipo = str;
        return nombreEquipo;
    }
    
    public String setStadium(String str){
        estadio = str;
        return estadio;
    }
    
    public String setTeamTitles(String str){
        titulos = str;
        return titulos;
    } 
}
