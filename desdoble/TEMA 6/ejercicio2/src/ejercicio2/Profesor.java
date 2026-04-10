/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author VSPC-210660
 */
public class Profesor extends Persona{
    
    //Atributos
    private String especialidad;
    
    //Constructores
    //Por defecto

    public Profesor() {
        super();
        especialidad = "";
    }

    //Parametrizado
    public Profesor(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }
    
    //Getters y setters

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    //To String

    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "especialidad=" + especialidad + '}';
    }
    
    //Otros metodos
    @Override
    public String saludar() {
        return "Hola, soy el profesor " + getNombre() + " y sou de la especialidad de " + especialidad;
    }
    
}
