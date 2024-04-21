/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramacion_2;

import java.util.Scanner;
import static proyectoprogramacion_2.Principal.emprendimientosRegistrados;

/**
 *
 * @author POWER
 */
public class RegistroEmprendedor implements GestionCuenta{
   Scanner scanner = new Scanner(System.in);
   
     private static Emprendimiento crearEmprendimiento(Scanner scanner) {
      
        System.out.print("Ingrese nombre del emprendimiento: ");
        String nombreEmprendimiento = scanner.nextLine();

        Emprendimiento emprendimiento = new Emprendimiento(nombreEmprendimiento);
        System.out.println("Emprendimiento '" + nombreEmprendimiento + "' creado exitosamente.");
        return emprendimiento;
}

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
        
        Emprendimiento emprendedor1 = Emprendimiento.registrarEmprendedor(nombre, nombre, edad, correoElectronico, contraseña);
         
        if (emprendedor1 != null) {
        emprendimientosRegistrados.add(emprendedor1);
        crearEmprendimiento(scanner);
    }
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
                Emprendimiento emprendedor1 = Emprendimiento.iniciarSesionEmprendimiento(correoElectronico, contraseña);
    
    if (emprendedor1 != null) {
         System.out.println("                               ");
        System.out.println("Inicio de sesion exitoso. Bienvenido, " + emprendedor1.getNombreEmprendimiento());
          System.out.println("                               ");
        while (!salir) {
            System.out.println("Que deseas hacer a continuacion?");
            System.out.println("1. Agregar producto");
            System.out.println("2. Salir");
            System.out.println("Ingrese una opcion:");

            int opc1 = scanner.nextInt();
            scanner.nextLine();

            switch (opc1) {
                case 1 -> registro.AgregarProducto(emprendedor1); 
                case 2 -> salir = true;
                default -> System.out.println("Opción no valida");
            }
        }
    } else{
            System.out.println("Emprendedor no registrado.Porfavor registrarse");
    }


    }  
    
}
