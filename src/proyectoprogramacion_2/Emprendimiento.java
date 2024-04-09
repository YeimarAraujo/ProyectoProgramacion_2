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
public class Emprendimiento extends Cuenta{
    public static Map<String, Emprendimiento> emprendedoresRegistrados = new HashMap<>();
    public String nombreEmprendimiento;

    public Emprendimiento(String nombreEmprendimiento, String nombre) {
        super(nombre);
        this.nombreEmprendimiento = nombreEmprendimiento;
    }

    public Emprendimiento(String nombreEmprendimiento) {
        this.nombreEmprendimiento = nombreEmprendimiento;
    }

    
  
    public String getNombreEmprendimiento() {
        return nombreEmprendimiento;
    }

    public void setNombreEmprendimiento(String nombreEmprendimiento) {
        this.nombreEmprendimiento = nombreEmprendimiento;
    }



    @Override
    public String toString() {
        return "Emprendimiento{" + super.toString()+ ", nombreEmprendimiento=" + nombreEmprendimiento + '}';
    }
 

    public static Emprendimiento registrarEmprendedor( String nombre, String nombreEmprendimiento, int edad, String correoElectronico, String contraseña) {
        Emprendimiento nuevoEmprendedor = new Emprendimiento(nombreEmprendimiento,nombre);
        emprendedoresRegistrados.put(correoElectronico, nuevoEmprendedor);
        return nuevoEmprendedor;
    }


    public static Emprendimiento iniciarSesionEmprendimiento(String correoElectronico, String contraseña) {
        return emprendedoresRegistrados.getOrDefault(correoElectronico, null);
    }
    /**
      public  Emprendimiento agregarProducto(String nombreProducto, double precio) {
        Producto producto = new Producto(nombreProducto, precio);
        Producto[] nuevosProductos = Arrays.copyOf(productos, productos.length + 1);
        nuevosProductos[productos.length] = producto;
        productos = nuevosProductos;
        System.out.println("Producto '" + producto.getNombreProducto() + "' agregado al emprendimiento con precio $" + producto.getPrecio() + ".");
        return null;
    }
*/

}
