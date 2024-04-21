/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramacion_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author POWER
 */
public class RegistroProducto implements GestionProducto {
    private final Map<Double, Producto>mapsProducto;
    Scanner scanner = new Scanner(System.in);
    
    public RegistroProducto() {
        this.mapsProducto= new HashMap();
        
    }

  
    @Override
    public void AgregarProducto(Emprendimiento emprendedor1) {
    if (emprendedor1 != null) { 
        System.out.print("Ingrese el nombre del producto: ");
        String nombreProducto = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        Producto nuevoProducto = new Producto(nombreProducto, precio);
        emprendedor1.agregarProducto(nuevoProducto);
         System.out.println("                               ");
        System.out.println("Producto agregado exitosamente.");
    } else {
         System.out.println("                               ");
        System.out.println("No se pudo agregar el producto. El emprendimiento es nulo.");
    }
}

    @Override
   public void buscarProducto() {
        
       System.out.print("Ingrese el nombre del producto que desea buscar: ");
    String nombreProducto = scanner.nextLine();

    boolean productoEncontrado = false;


    for (Emprendimiento emprendimiento : Emprendimiento.getEmprendedoresRegistrados().values()) {
        ArrayList<Producto> resultados = emprendimiento.buscarProductos(nombreProducto);

        if (!resultados.isEmpty()) {
            if (!productoEncontrado) {
                System.out.println("Productos encontrados:");
                productoEncontrado = true;
            }


            for (Producto producto : resultados) {
                System.out.println("En " + emprendimiento.getNombreEmprendimiento() + ": " + producto.toString());
            }
        }
    }

    if (!productoEncontrado) { 
        System.out.println("     ");
        System.out.println("No se encontraron productos con ese nombre.");
    }
    
    }
    
}

