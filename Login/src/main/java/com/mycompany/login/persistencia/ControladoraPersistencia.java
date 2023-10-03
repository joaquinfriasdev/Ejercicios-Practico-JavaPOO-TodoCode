
package com.mycompany.login.persistencia;

import com.mycompany.login.logica.Usuario;
import java.util.List;


public class ControladoraPersistencia {
    
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    RolJpaController rolJpa = new RolJpaController();
    
    public List<Usuario> traerUsuarios() {
        List<Usuario> listaUsuario = usuJpa.findUsuarioEntities();
        return listaUsuario;
        
    }
    
}
