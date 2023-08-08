
package claseabstracta;


public class Cuadrado extends Figura {

    
    private double lado;

    public Cuadrado() {
    }


    public Cuadrado(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }
    
    
    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }
    
}
