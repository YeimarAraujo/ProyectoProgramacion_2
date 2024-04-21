/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramacion_2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author POWER
 */
public class Usuario extends Cuenta{
    private static Map<String, Usuario> usuariosRegistrados = new HashMap<>();

    public Usuario() {
    }

    public Usuario(String nombre, String correoElectronico, String contraseña, int edad) {
        super(nombre, correoElectronico, contraseña, edad);
    } 

    public static Map<String, Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }

    public static void setUsuariosRegistrados(Map<String, Usuario> usuariosRegistrados) {
        Usuario.usuariosRegistrados = usuariosRegistrados;
    }

    @Override
    public String toString() {
        return "Usuario{" + '}';
    }
    
    public static Usuario registrarUsuario( int edad, String correoElectronico, String contraseña, String nombre) {
        Usuario usuario1 = new Usuario(nombre,  correoElectronico, contraseña, edad);
        usuariosRegistrados.put(correoElectronico, usuario1);
        return usuario1;
    }

    public static Usuario iniciarSesionUsuario(String correoElectronico, String contraseña){
        return usuariosRegistrados.getOrDefault(correoElectronico, null);
    }
}
