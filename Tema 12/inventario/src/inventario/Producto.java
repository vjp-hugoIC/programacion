/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 *
 * @author alumno
 */
public class Producto {
    
    //Atributos
    private String nombre;
    private int cantidad;
    private int precio;
    
    //Constructores
    //Por defecto
    public Producto() {
    
        String nombre = "";
        int cantidad = 0;
        int precio = 0;
    }
    
    //Parametrizado
    public Producto(String nombre, int cantidad, int precio) {
    
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    //Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    
    
    
    
}
