package conversiones;


public class Conversiones {

    public static void main(String[] args) {
        
        double num = 1.84;
        
        // casteo a entero
        int numInt = (int) num;
        
        //casteo a Long
        long numLong = (long) num;
        
        System.out.println("double: " + num);
        System.out.println("int: " + numInt);
        System.out.println("long: " + numLong);
        System.out.println("--------------------");
        //Castear String a int y double utilzando los metodos de cada clase
        
        String cantidad = "15";
        String precio = "150.27";
        
        int cantEntero = Integer.parseInt(cantidad);
        double precioDouble = Double.parseDouble(precio);
        
        System.out.println("El valor total de la compra es: " + (cantEntero * precioDouble));
        System.out.println("---------------------");
        
        //conversion de int y double a string
        int edad = 25;
        double estatura = 1.84;
        
        String edadString = String.valueOf(edad);
        String estaturaString = String.valueOf(estatura);
        System.out.println("Edad: " + edadString + " Estatura: " + estaturaString);
    }
    
}
