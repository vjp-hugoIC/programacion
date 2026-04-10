/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author VSPC-210660
 */
public abstract class Persona {
    
    //Atributo
    private String nombre;
    
    //Constructores 
    //Por defecto
    public Persona() {
    
        nombre = "";
    }

    //Parametrizado
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    //Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //To String
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }
    
    //Otros metodos
    public abstract String saludar();
    
    
}
