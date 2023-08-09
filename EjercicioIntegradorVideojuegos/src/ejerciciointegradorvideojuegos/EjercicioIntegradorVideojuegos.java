
package ejerciciointegradorvideojuegos;

import ejerciciointegradorvideojuegos.logica.Videojuego;
import java.util.ArrayList;
import java.util.List;


public class EjercicioIntegradorVideojuegos {


    public static void main(String[] args) {
        
        //Creamos lista de Videjuegos, creamos los juegos y agregamos a la lista previamente creada.
        List<Videojuego> listaVideojuegos = new ArrayList<Videojuego>();
        
        Videojuego video1 = new Videojuego( 123, "Banjo Kazooie", "Nintendo 64", 4, "Plataforma");
        Videojuego video2 = new Videojuego( 432, "Mario Party 3", "Nintendo 64", 4, "Plataforma");
        Videojuego video3 = new Videojuego( 124, "Age of Empire II", "PC", 1, "Estrategia");
        Videojuego video4 = new Videojuego( 155, "Counter Strike", "PC", 1, "Shooter");
        Videojuego video5 = new Videojuego( 543, "Mario Kart 64", "Nintendo 64", 2, "Carreras");
        
        listaVideojuegos.add(video1);
        listaVideojuegos.add(video2);
        listaVideojuegos.add(video3);
        listaVideojuegos.add(video4);
        listaVideojuegos.add(video5);
        
        //Recorremos la lista de videojuegos
        for (Videojuego video : listaVideojuegos ){
            System.out.println("Título: " + video.getTitulo() + 
                    " Consola: " + video.getConsola() + 
                    " Cantidad de jugadores: " + video.getCantJugadores());
        }
        System.out.println("-----------------------");
        // Cambio de nombre y jugadores
        video1.setTitulo("Banjo Kazooie 2");
        video1.setCantJugadores(1);
        video5.setTitulo("Super Mario Kart 64");
        video5.setCantJugadores(4);
        
        //Recorrer la Array y mostrar juego de Nintendo 64
        for (Videojuego video : listaVideojuegos ){
            if(video.getConsola().equals("Nintendo 64")){
                System.out.println(video.toString());
            }
        }
        
    }
    
}
