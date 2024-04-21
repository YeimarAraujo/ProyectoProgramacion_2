/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprogramacion_2;

import java.util.ArrayList;
import java.util.Scanner;

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
        
        
        RegistroUsuario registraru = new RegistroUsuario();
        RegistroEmprendedor registroe = new RegistroEmprendedor();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            
            System.out.println("1. Iniciar sesion");
            System.out.println("2. Registrarse");
            System.out.println("3. Salir");
            System.out.println("Ingrese una opcion:");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> inicioSesion(scanner);
                case 2 -> registro(scanner);
                case 3 -> salir = true;
                default -> System.out.println("Opcion no valida");
            }
        }
    }

    private static void registro(Scanner scanner) {
         Scanner scanner1 = new Scanner(System.in);
          RegistroUsuario registraru = new RegistroUsuario();
        RegistroEmprendedor registrare = new RegistroEmprendedor();
        boolean salir = false;

        while (!salir) {
             System.out.println("                               ");
            System.out.println("REGISTRO");
            System.out.println("1. Registrarse como usuario");
            System.out.println("2. Registrarse como emprendedor");
            System.out.println("3. Salir");
            System.out.println("Ingrese una opcion:");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                            registraru.Registrar();
                          }
                case 2 ->{ 
                            registrare.Registrar();
                         }
                case 3 -> salir = true;
                default -> System.out.println("Opcion no valida");
            }
        }
    }
 

    private static void inicioSesion(Scanner scanner) {
        RegistroProducto registro = new RegistroProducto();
        RegistroUsuario registraru = new RegistroUsuario();
        RegistroEmprendedor registrare = new RegistroEmprendedor();
        Scanner scanner2 = new Scanner(System.in);
        boolean salir = false;
               while (!salir) {
             System.out.println("                               ");
            System.out.println("INICIO SESION");
            System.out.println("1. Iniciar sesion como usuario");
            System.out.println("2. Iniciar sesion como emprendedor");
            System.out.println("3. Salir");
            System.out.println("Ingrese una opcion:");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                            registraru.iniciarsesion();
                          }
                case 2 ->{ 
                            registrare.iniciarsesion();
                         }
                case 3 -> salir = true;
                default -> System.out.println("Opcion no valida");
            }
        }

  }

}

