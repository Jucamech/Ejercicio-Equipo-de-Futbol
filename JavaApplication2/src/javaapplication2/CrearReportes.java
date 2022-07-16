package javaapplication2;

import javax.swing.JOptionPane;

/**
 *
 * @author juanc
 */
public class CrearReportes {
    
    public String generarReporte(String nombreEquipo, String estadio, String titulos, String jugadorTitular, String jugadorSuplente){
        while(true){
            int reporte = JOptionPane.showOptionDialog(null, "Presione una de las siguientes opciones", nombreEquipo, JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Reporte basico", "Reporte detallado", "Cerrar" }, "Reporte basico");
            if(reporte==0){
                JOptionPane.showMessageDialog(null, "Nombre del equipo: "+nombreEquipo +" \n Estadio: "+estadio+" \n Titulos: "+titulos);
            } else if (reporte==1){
                JOptionPane.showMessageDialog(null, "Nombre del equipo: "+nombreEquipo +" \n JUGADORES TITULARES: "+jugadorTitular+" \n JUGADORES SUPLENTES: "+jugadorSuplente);
            } else if (reporte==2){
                break;
            }
        }
        return null;
    }
    
    
}
