package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis;

    public Controladora() {
        controlPersis = new ControladoraPersistencia();
    }

    public Usuario validarUsuario(String usuario, String contrasenia) {
        //String mensaje = "";
        Usuario usr = null;
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();

        for (Usuario usu : listaUsuarios) {
            if (usu.getNombreUsuario().equals(usuario)) {
                if (usu.getContrasenia().equals(contrasenia)) {
                    //mensaje = "Usuario y contraseña correctos. Bienvenido/a!";
                    usr = usu;
                    return usr;

                } else {
                    //mensaje = "Contraseña incorrecta";
                    usr = null;
                    return usr;
                }
            } else {
                //mensaje = "Usuario no encontrado";
                usr = null;
                //return usr;
            }
        }

        return usr;
    }


}
