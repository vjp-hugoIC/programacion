/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author VSPC-210660
 */
public class Empleado {
    
    //Atributo
    private String nombre;
    private int salario;
    private Direccion direccion;
    
    //Constructores
    //Por defecto
    public Empleado() {
    
        nombre = "";
        salario = 0;
        direccion = new Direccion();
    }
    
    //Parametrizado
    public Empleado(String nombre, int salario, Direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }
    
    //Getters y setters

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    //Metodo mostrar
    public void mostrarEmpleado() {
    
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        direccion.mostrarDireccion();
    }
    
    //ToString
    @Override
    public String toString() {
    
        return "Nombre: " + nombre + ", salario: " + salario + " y direccion: " + direccion;
    }
    
}
