/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramacion_2;

/**
 *
 * @author POWER
 */
public class Cuenta {
    protected String nombre;
    protected String correoElectronico;
    protected String contraseña;
    protected int edad;

    public Cuenta() {
    }
   
    public Cuenta(String nombre, String correoElectronico, String contraseña, int edad) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
     public boolean verificarContraseña(String contraseña) {
        return this.contraseña.equals(contraseña);
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nombre=" + nombre + ", correoElectronico=" + correoElectronico + ", contrase\u00f1a=" + contraseña + ", edad=" + edad + '}';
    }
}
