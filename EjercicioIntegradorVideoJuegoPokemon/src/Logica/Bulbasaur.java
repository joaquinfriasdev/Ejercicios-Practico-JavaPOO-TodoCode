
package Logica;


public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordizco() {
        System.out.println("Hola soy bulbasaur y este es mi ataque mordizco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Paralizar");
    }

    @Override
    public void atacarHojaAfilada() {
         System.out.println("Hola soy Bulbasaur y este es mi ataque hoja afilada");
    }

    @Override
    public void atacarLatigoCepa() {
         System.out.println("Hola soy Bulbasaur y este es mi ataque Latigo cepa");
    }
    
}
