
package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;


public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        
        //Crear en la DB el dueño
        duenioJpa.create(duenio);
        
        //Crear en la DB la mascota
        mascoJpa.create(masco);
        
    }
    
    
    
}
