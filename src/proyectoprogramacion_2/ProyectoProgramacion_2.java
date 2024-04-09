/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprogramacion_2;

import java.util.ArrayList;
import java.util.Scanner;
import proyectoprogramacion_2.Emprendimiento;
import proyectoprogramacion_2.Usuario;

/**
 *
 * @author POWER
 */
public class ProyectoProgramacion_2 {
public static ArrayList<Usuario> usuariosRegistrados = new ArrayList<>();
  public static ArrayList<Emprendimiento> emprendimientosRegistrados = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            
            System.out.println("1. Registrarse");
            System.out.println("2. Iniciar sesion");
            System.out.println("3. Salir");
            System.out.println("Ingrese una opcion:");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> cuenta(scanner);
                case 2 -> iniciarSesion(scanner);
                case 3 -> salir = true;
                default -> System.out.println("Opcion no valida");
            }
        }
    }

    private static void cuenta(Scanner scanner) {
         Scanner scanner1 = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            
            System.out.println("REGISTRO");
            System.out.println("          ");
            System.out.println("1. Registrarse como usuario");
            System.out.println("2. Registrarse como emprendedor");
            System.out.println("3. Salir");
            System.out.println("Ingrese una opcion:");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> registrarUsuario(scanner);
                case 2 -> registrarEmprendedor(scanner);
                case 3 -> salir = true;
                default -> System.out.println("Opcion no valida");
            }
        }
    }
 private static void registrarUsuario(Scanner scanner) {
    
        
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Ingrese su correo electronico:");
        String correoElectronico = scanner.nextLine();
        System.out.println("Ingrese su contrasena:");
        String contraseña = scanner.nextLine();
        
        
        Usuario nuevoUsuario = Usuario.registrarUsuario( edad, correoElectronico, contraseña, nombre);
        usuariosRegistrados.add(nuevoUsuario);
        System.out.println("Usuario registrado correctamente");
    }
    
 private static void registrarEmprendedor(Scanner scanner) {
        
        
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Ingrese su correo electronico:");
        String correoElectronico = scanner.nextLine();
        System.out.println("Ingrese su contrasena:");
        String contraseña = scanner.nextLine();
        
        Emprendimiento nuevoEmprendedor = Emprendimiento.registrarEmprendedor(nombre, nombre, edad, correoElectronico, contraseña);
          emprendimientosRegistrados.add(nuevoEmprendedor);
           crearEmprendimiento(scanner);
    }
 
 
    private static void iniciarSesion(Scanner scanner) {
         Scanner scanner2 = new Scanner(System.in);
        boolean salir = false;
       
        System.out.println("Ingrese su correo electrónico:");
        String correoElectronico = scanner.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contraseña = scanner.nextLine();

         Usuario usuario1 = Usuario.iniciarSesion(correoElectronico, contraseña);
        if (usuario1 != null) {
            System.out.println("Inicio de sesión exitoso. Bienvenido, " + usuario1.getNombre() + "!");
            System.out.println("¿Que deseas hacer a continuacion?");
                  while (!salir) {
            System.out.println("1. Buscar producto");
            System.out.println("2. Salir");
            System.out.println("Ingrese una opcion:");

            int opc = scanner.nextInt();
            scanner.nextLine();

            switch (opc) {
               
                case 2 -> salir = true;
                default -> System.out.println("Opcion no valida");
            }
        }
        } 
        Emprendimiento emprendedor1 = Emprendimiento.iniciarSesionEmprendimiento(correoElectronico, contraseña);
        if (emprendedor1 != null) {
            System.out.println("Inicio de sesión exitoso. Bienvenido, " + emprendedor1.getNombre() + "!");
            System.out.println("¿Que deseas hacer a continuacion?");
            while (!salir) {
            System.out.println("1. Agregar producto");
            System.out.println("2. Salir");
            System.out.println("Ingrese una opcion:");

            int opc = scanner.nextInt();
            scanner.nextLine();

            switch (opc) {
               
                case 2 -> salir = true;
                default -> System.out.println("Opcion no valida");
            }
        }
        } 
    }

    private static Emprendimiento crearEmprendimiento(Scanner scanner) {
      
        System.out.print("Ingrese nombre del emprendimiento: ");
        String nombreEmprendimiento = scanner.nextLine();

        Emprendimiento emprendimiento = new Emprendimiento(nombreEmprendimiento);
        System.out.println("Emprendimiento '" + nombreEmprendimiento + "' creado exitosamente.");
        return emprendimiento;
}
    
}
