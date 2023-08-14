

package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Controladoralogica;
import java.util.ArrayList;
import java.util.Date;


public class JpaPrueba {

    public static void main(String[] args) {
        
        Controladoralogica control = new Controladoralogica();
        Alumno al2 = new Alumno(23, "Cesar", "Gato", new Date());
        control.crearAlumno(al2);
        //control.eliminarAlumno(30);
        //alu.setApellido("Zacarias");
        //control.editarAlumno(alu);
        
        Alumno alu = control.traerAlumno(15);
        System.out.println("----------BUSQUEDA INDIVIDUAL-----------------");
        System.out.println("El alumno es: " + alu.toString());
        
        System.out.println("------------BÚSQUEDA DE TODOS---------------");
        ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
        for (Alumno al : listaAlumnos){
            System.out.println("El alumno es: " + al.toString());
        }
        System.out.println("---------------------------------------");
    }
    
    
}
