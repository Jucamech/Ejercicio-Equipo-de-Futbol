package javaapplication2;

/**
 *
 * @author juanc
 */
public class CrearJugadores {
    String jugadorTitular = "";
    String jugadorSuplente = "";
    
    public String setJugadorTitular(String name, String pos){
        jugadorTitular += "\n Nombre: "+name;
        jugadorTitular += "\n Posicion: "+pos;
        jugadorTitular += "\n --------------------------";
        return jugadorTitular;
    }
    
    public String setJugadorSuplente(String name, String pos){
        jugadorSuplente +="\n Nombre: "+name;
        jugadorSuplente +="\n Posicion: "+pos;
        jugadorSuplente +="\n --------------------------";
        return jugadorSuplente;
    }
}
