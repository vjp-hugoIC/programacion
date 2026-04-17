/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg6;

/**
 *
 * @author alumno
 */
public class Persona implements Transformable{
    
    //Atributos
    private String nombre;
    private String apellidos;
    private String alias;
    
    //Constructores
    //Por defecto
    public Persona() {
    
        nombre = "";
        apellidos = "";
        alias = "";
    }

    //Parametrizado
    public Persona(String nombre, String apellidos, String alias) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.alias = alias;
    }
    
    //Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    //ToString 

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", alias=" + alias + '}';
    }
    
    //Otros metodos

    @Override
    public String concatenarTodo() {
       
    }

    @Override
    public String obtenerIniciales() {
       
    }

    @Override
    public void contarVocales() {
       
    }

    @Override
    public String obtenerCadenaMasLarga() {
       
    }

    @Override
    public String buscarCadena(String cadena) {
        
    }
    
    
    
    
}
