/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramacion_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author POWER
 */
public class Emprendimiento extends Cuenta{
    private static Map<String, Emprendimiento> emprendedoresRegistrados = new HashMap<>();
    private String nombreEmprendimiento;
    private ArrayList<Producto> productos;

    public Emprendimiento(String nombreEmprendimiento, ArrayList<Producto> productos) {
        this.nombreEmprendimiento = nombreEmprendimiento;
        this.productos = productos;
    }

    public Emprendimiento(String nombreEmprendimiento){
        this.nombreEmprendimiento = nombreEmprendimiento;
        this.productos = new ArrayList<>();
    }

    public String getNombreEmprendimiento() {
        return nombreEmprendimiento;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

 

    public void setNombreEmprendimiento(String nombreEmprendimiento) {
        this.nombreEmprendimiento = nombreEmprendimiento;
    }
    
    public ArrayList<Producto> getProductos() {
        return productos;
    }
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
   public ArrayList<Producto> buscarProductos(String nombreProducto) {
        ArrayList<Producto> resultados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getNombreProducto().equalsIgnoreCase(nombreProducto)) {
                resultados.add(producto);
            }
        }
        return resultados;
    }

    public static Map<String, Emprendimiento> getEmprendedoresRegistrados() {
        return emprendedoresRegistrados;
    }
    
    @Override
    public String toString() {
        return "Emprendimiento{" + "nombreEmprendimiento=" + nombreEmprendimiento + ", productos=" + productos + '}';
    }

    public static Emprendimiento registrarEmprendedor( String nombre, String nombreEmprendimiento, int edad, String correoElectronico, String contraseña) {
        Emprendimiento emprendedor1 = new Emprendimiento(nombreEmprendimiento);
        emprendedoresRegistrados.put(correoElectronico, emprendedor1);
        return emprendedor1;
    }


    public static Emprendimiento iniciarSesionEmprendimiento(String correoElectronico, String contraseña) {
        return emprendedoresRegistrados.getOrDefault(correoElectronico, null);
    }
 
}
