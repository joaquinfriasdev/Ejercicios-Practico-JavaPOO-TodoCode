
package relaciones;

import java.util.ArrayList;
import java.util.List;


public class Relaciones {

    
    public static void main(String[] args) {
        
        Auto aut = new Auto();
        aut.setId(1L);
        aut.setMarca("Renault");
        aut.setModelo("Duster");
        
        List<Propietario> listaPropietarios = new ArrayList<Propietario>();
        
        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();
        
        prop1.setIdLong(35L);
        prop1.setNombre("Joaquin");
        prop1.setApellido("Frias");
        
        prop2.setIdLong(25L);
        prop2.setNombre("Gerardo");
        prop2.setApellido("Frias");
        
        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);
        
        aut.setListaPropietarios(listaPropietarios);
        
        System.out.println("El auto " + aut.getMarca() + " " + aut.getModelo() + " tiene como propietarios a: " + aut.getListaPropietarios().toString());
        
    }
    
}
