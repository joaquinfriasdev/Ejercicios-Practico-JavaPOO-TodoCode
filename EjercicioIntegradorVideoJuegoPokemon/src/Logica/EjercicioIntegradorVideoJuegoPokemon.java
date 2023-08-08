
package Logica;


public class EjercicioIntegradorVideoJuegoPokemon {


    public static void main(String[] args) {
        
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulba = new Bulbasaur();
        Pikachu pika = new Pikachu();
        
        //Ataques de Squirtle
        System.out.println("Squirtle lanza todos sus ataques");
        squirtle.atacarAraniazo();
        squirtle.atacarBurbuja();
        squirtle.atacarHidroBomba();
        squirtle.atacarHidropulso();
        squirtle.atacarMordizco();
        squirtle.atacarPistolaAgua();
        squirtle.atacarPlacaje();
        System.out.println("--------------------------------");
        
        //Ataques de Charmander
        System.out.println("Charmander lanza todos sus ataques");
        charmander.atacarAraniazo();
        charmander.atacarAscuas();
        charmander.atacarLanzaLlamas();
        charmander.atacarMordizco();
        charmander.atacarPlacaje();
        charmander.atacarPunioFuego();
        System.out.println("------------------------------------");
        
        //Ataques de Bulbasaur
        System.out.println("Bulbasaur lanza todos sus ataques");
        bulba.atacarAraniazo();
        bulba.atacarDrenaje();
        bulba.atacarHojaAfilada();
        bulba.atacarLatigoCepa();
        bulba.atacarMordizco();
        bulba.atacarParalizar();
        bulba.atacarPlacaje();
        System.out.println("--------------------------------------");
        
        //Ataques de Pikachu
        System.out.println("Pikachu lanza todos sus ataques");
        pika.atacarAraniazo();
        pika.atacarImpactrueno();
        pika.atacarMordizco();
        pika.atacarPlacaje();
        pika.atacarPunioTrueno();
        pika.atacarRayo();
        pika.atacarRayoCarga();
    }
    
}
