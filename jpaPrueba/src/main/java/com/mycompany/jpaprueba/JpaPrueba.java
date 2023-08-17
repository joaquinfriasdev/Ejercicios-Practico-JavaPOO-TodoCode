

package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.Controladoralogica;
import com.mycompany.jpaprueba.logica.Materia;
import java.util.Date;
import java.util.LinkedList;


public class JpaPrueba {

    public static void main(String[] args) {
        
        
        
        Controladoralogica control = new Controladoralogica();
       
        //Creamos lista de materias vacia
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
        
        //Creacion Carrera con lista de materias 
        Carrera carre = new Carrera(25, "Tecnicatura en Programación", listaMaterias);
        
        //Guardado Carrera en BD
        control.crearCarrera(carre);
        
        //Creación Materias
        Materia mate1 = new Materia(58, "Programación I", "Cuatrimestral", carre);
        Materia mate2 = new Materia(59, "Programación II", "Cuatrimestral", carre);
        Materia mate3 = new Materia(60, "Programación Avanzada", "Anual", carre);
        
        //Guardado Materias en BD
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);
        
        //Agregar materias a la lista de materias
        
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);

        carre.setListaMaterias(listaMaterias);
        control.editarCarrera(carre);
        
        //Creacion Alumno(con carrera)
        Alumno al = new Alumno(23, "Joaquin", "Frias", new Date(), carre);
   
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
