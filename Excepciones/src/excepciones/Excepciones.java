
package excepciones;

public class Excepciones {


    public static void main(String[] args) {
        
        //Primer caso de excepcion - Expcepción Arimética
        
        try{
        int resultado = 3 / 0;
        }
        catch(Exception e) {
            System.out.println("No se puede dividir por cero!!!");
        }
        
        System.out.println("----------------------");
        //Excepción con vector
        int edades[] = {15, 12, 23, 30};
        try { 
            System.out.println("La edad de la posición 4 es: " + edades[4]);   
        } catch (Exception e) {
            System.out.println("Intentaste accededr a un índice que no existe");
        }
        
        
    }
    
}
