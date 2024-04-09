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
    public static Map<String, Usuario> usuariosRegistrados = new HashMap<>();

    public Usuario() {
    }

    public Usuario(String nombre, String correoElectronico, String contraseña, int edad) {
        super(nombre, correoElectronico, contraseña, edad);
    } 
    
    public static Usuario registrarUsuario( int edad, String correoElectronico, String contraseña, String nombre) {
        Usuario nuevoUsuario = new Usuario(nombre,  correoElectronico, contraseña, edad);
        usuariosRegistrados.put(correoElectronico, nuevoUsuario);
        return nuevoUsuario;
    }

    public static Usuario iniciarSesion(String correoElectronico, String contraseña){
        return usuariosRegistrados.getOrDefault(correoElectronico, null);
    }
}
