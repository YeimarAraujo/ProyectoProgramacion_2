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
public class Consulta {
    private Map<String, Emprendimiento> emprendimientos;

    // Constructor
    public Consulta() {
        this.emprendimientos = new HashMap<>();
    }
  private Emprendimiento[] emprendimientoss;

    // Constructor
    public Consulta(Emprendimiento[] emprendimientos) {
        this.emprendimientoss = emprendimientos;
    }
    
/**
    public void buscarProductos(String nombreProducto) {
        boolean encontrado = false;
        for (Emprendimiento emprendimiento : emprendimientoss) {
            Producto[] productos = emprendimiento.getProductos();
            for (Producto producto : productos) {
                if (producto.getNombreProducto().equalsIgnoreCase(nombreProducto)) {
                    System.out.println("El producto '" + producto.getNombreProducto() + "' está disponible en el emprendimiento '" + emprendimiento.getNombreEmprendimiento() + "' con un precio de $" + producto.getPrecio() + ".");
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("El producto '" + nombreProducto + "' no está disponible en ningún emprendimiento.");
        }
    }
    */
}
