/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.henseldiaz.controller;

import com.henseldiaz.model.Rol;
import com.henseldiaz.model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author informatica
 */
public class AuthSistema {

    private static ArrayList<Usuario> ListaUsuario = new ArrayList<>();
    
    private Iterable<Usuario> listaUsuario;
    public AuthSistema() {
        Usuario usuarioAdmin = new Usuario("admin",
                "admin", "admin", Rol.ADMIN);
        Usuario usuarioUser = new Usuario("User",
                "User", "User", Rol.USER);
        Usuario usuarioYo = new Usuario("Hensel",
                "1234", "Hensel Estuardo Abraham Diaz Cardona", Rol.ADMIN);

        ListaUsuario.add(usuarioAdmin);
        ListaUsuario.add(usuarioUser);
        ListaUsuario.add(usuarioYo);
    }

    public Usuario login(String nombreUsuario, String clave) {
        for (Usuario usuarioBuscado : listaUsuario) {
            if (usuarioBuscado.getNombreUsuario().equals(nombreUsuario)
                    && usuarioBuscado.getPassword().equals(clave)) {
                return usuarioBuscado;
            }
        }
        return null;
    }

    public static ArrayList<Usuario> getListaUsuario() {
        return ListaUsuario;
    }

    public static void setListaUsuario(ArrayList<Usuario> ListaUsuario) {
        AuthSistema.ListaUsuario = ListaUsuario;
    }

}
