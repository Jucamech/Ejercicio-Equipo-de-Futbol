package javaapplication2;

import javax.swing.JOptionPane;
/**
 *
 * @author juanc
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CreaEquipos equipo = new CreaEquipos();
        CrearJugadores jugadores = new CrearJugadores();
        CrearReportes reportes = new CrearReportes();
        equipo.setTeamName(JOptionPane.showInputDialog("Ingrese el nombre del equipo"));
        equipo.setStadium(JOptionPane.showInputDialog("Ingrese el nombre del estadio"));
        equipo.setTeamTitles(JOptionPane.showInputDialog("Ingrese la cantidad de titulos"));
        while(true){
            int opc = JOptionPane.showOptionDialog(null, "Presione una de las siguientes opciones", equipo.nombreEquipo, JOptionPane.YES_NO_CANCEL_OPTION,
   JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Agregar jugador titular", "Agregar jugador suplente", "Cerrar" }, "Agregar jugador titular");
            if(opc ==0){
                jugadores.setJugadorTitular(JOptionPane.showInputDialog("Ingrese el nombre del titular"), JOptionPane.showInputDialog("Ingrese la posicion del Jugador"));
            } else if(opc==1){
                jugadores.setJugadorSuplente(JOptionPane.showInputDialog("Ingrese el nombre del suplente"), JOptionPane.showInputDialog("Ingrese la posicion del suplente"));
            } else if(opc==2){
                break;
            }
        }

        reportes.generarReporte(equipo.nombreEquipo, equipo.estadio, equipo.titulos, jugadores.jugadorTitular, jugadores.jugadorSuplente);

    }
    
}
