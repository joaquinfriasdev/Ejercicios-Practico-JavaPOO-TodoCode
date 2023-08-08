
package claseabstracta;


public abstract class Figura {
    
    protected double x; //Posición en x
    protected double y; //Posición en y
    
    
    //Creamos constructores
    protected Figura() {
    }

    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }
        
    //Declaramos método abstracto
    public abstract double calcularArea();
    
}
