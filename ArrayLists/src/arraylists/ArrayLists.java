
package arraylists;

import java.util.ArrayList;
import java.util.List;


public class ArrayLists {


    public static void main(String[] args) {
        
        //Declaramos la Lista
        List<Persona> lista = new ArrayList<Persona> ();
        lista.add(new Persona(1, "Joaquin", 25));
        lista.add(new Persona(2, "Verena", 25));
        lista.add(new Persona(3, "Joel", 17));
        lista.add(new Persona(4, "Maria", 15));
        
        System.out.println("---------FOR---------");
        //Recorrer por índice. for
        for(int i=0; i<lista.size(); i++){
            System.out.println("Soy " + lista.get(i).getNombre() + " y mi edad es " + lista.get(i).getEdad());
        }
        
        System.out.println("---------FOREACH--------");
        //Recorrer por elemento. foreach
        for (Persona persona:lista){
            System.out.println("Prueba: " + persona.getNombre());
        }
    }
    
}
