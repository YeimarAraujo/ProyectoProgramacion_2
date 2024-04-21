/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramacion_2;

import java.util.Scanner;
import static proyectoprogramacion_2.Principal.usuariosRegistrados;

/**
 *
 * @author POWER
 */
public class RegistroUsuario implements GestionCuenta {
Scanner scanner = new Scanner(System.in);
    @Override
    public void Registrar() {
         System.out.println("                               ");
        System.out.println("CREAR CUENTA");
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Ingrese su correo electronico:");
        String correoElectronico = scanner.nextLine();
        System.out.println("Ingrese su contrasena:");
        String contraseña = scanner.nextLine();
        
        
        Usuario usuario1 = Usuario.registrarUsuario( edad, correoElectronico, contraseña, nombre);
        usuariosRegistrados.add(usuario1);
        System.out.println("Usuario registrado correctamente");
    }

    @Override
    public void iniciarsesion() {
                RegistroProducto registro = new RegistroProducto();
        Scanner scanner2 = new Scanner(System.in);
        boolean salir = false;
        System.out.println("                               ");
        System.out.println("INICIO DE SESION"); 
        System.out.println("Ingrese su correo electronico:");
        String correoElectronico = scanner.nextLine();
        System.out.println("Ingrese su contrasena:");
        String contraseña = scanner.nextLine();

         Usuario usuario1 = Usuario.iniciarSesionUsuario(correoElectronico, contraseña);
        if (usuario1 != null) {
             System.out.println("                               ");
            System.out.println("Inicio de sesion exitoso. Bienvenido, " + usuario1.getNombre());

           
             while (!salir) {
            System.out.println("                               ");
            System.out.println("Que deseas hacer a continuacion?");
            System.out.println("1. Buscar producto");
            System.out.println("2. Salir");
                    
            System.out.println("Ingrese una opcion:");

            int opc = scanner.nextInt();
            scanner.nextLine();

            switch (opc) {
                case 1 -> registro.buscarProducto();
                case 2 -> salir = true;
                default -> System.out.println("Opcion no valida");
            }
        }
        } else{
             System.out.println("                               ");
            System.out.println("Usuario no registrado.Porfavor registrarse");
        }
    }

}
