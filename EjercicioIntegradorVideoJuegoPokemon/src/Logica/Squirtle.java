
package Logica;


public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirtle y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Squirtle y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordizco() {
        System.out.println("Hola soy Squirtle y este es mi ataque mordizco");
    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("Hola soy Squirtle y este es mi ataque Hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle y este es mi ataque Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirtle y este es mi ataque pistola de agua");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Hola soy Squirtle y este es mi ataque hidropulso");
    }
    
}
