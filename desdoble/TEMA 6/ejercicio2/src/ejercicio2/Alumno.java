/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author VSPC-210660
 */
public class Alumno extends Persona{
    
    //Atributos
    private String grupo;
    
    //Constructores 
    //Por defecto
    public Alumno() {
    
        super();
        grupo = "";
    }
    
    //Por defecto
    public Alumno(String nombre, String grupo) {
    
        super(nombre);
        this.grupo = grupo;
    }
    
    //Getters y setters
    public String getGrupo() {
        return grupo;
    }
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
    //To String

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "grupo=" + grupo + '}';
    }
    
    //Otros metodos
    @Override
    public String saludar() {
        return "Hola, soy el alumno " + getNombre() + " y estoy en el grupo de " + grupo;
    }
    
    
    
}
