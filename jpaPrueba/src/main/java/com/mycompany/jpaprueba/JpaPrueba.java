

package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.Controladoralogica;
import java.util.Date;


public class JpaPrueba {

    public static void main(String[] args) {
        
        
        
        Controladoralogica control = new Controladoralogica();
       
        //Creacion Carrera
        Carrera carre = new Carrera(25, "Tecnicatura en Programación");
        //Guardado Carrera en BD
        control.crearCarrera(carre);
        //Creacion Alumno(con carrera)
        Alumno al = new Alumno(23, "Cesar", "Gato", new Date(), carre);
   
        //Guardamos el alumno en la BD
        control.crearAlumno(al);
        //Vemos el resultado
        System.out.println("---------------------------");
        System.out.println("-------------DATOS ALUMNO-----------------");
        Alumno alu = control.traerAlumno(23);
        System.out.println("Alumno: " + alu.getNombre() + " " + alu.getApellido());
        System.out.println("Cursa la carrera de: " + alu.getCarre().getNombre());
    }
    
    
}
