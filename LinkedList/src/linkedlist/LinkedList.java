
package linkedlist;


import java.util.List;


public class LinkedList {


    public static void main(String[] args) {
        
        //Declaramos la Lista
        List<Persona> lista = new java.util.LinkedList<Persona>();
        
        //Agregar Personas al final de la lista
        lista.add(new Persona(1, "Joaquin", 25));
        lista.add(new Persona(2, "Verena", 25));
        lista.add(new Persona(3, "Joel", 17));
        lista.add(new Persona(4, "Maria", 15));
        
        //Agregar elemento al principio
        lista.add(0, new Persona(5, "Homero", 45));
        
       
        System.out.println("---------FOREACH--------");
        //Recorrer por elemento. foreach
        for (Persona persona:lista){
            System.out.println("Prueba: " + persona.getNombre());
        }
    }
    
}
