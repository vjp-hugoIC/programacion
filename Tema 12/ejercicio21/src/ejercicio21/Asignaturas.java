package ejercicio21;


import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Asignaturas implements Serializable{
    
    //Atributos
    private String nombre;
    private double nota;
    
    //Constructores
    //Por defecto
    public Asignaturas() {
    
        nombre = "";
        nota = 0.0;
    }
    
    //Parametrizado
    public Asignaturas(String nombre, double nota) {
    
        this.nombre = nombre;
        this.nota = nota;
    }
    
    //Construtor personalizado
    public Asignaturas(String nombre) {
    
        this.nombre = nombre;
        nota = 0.0;
    }
    
    //Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    
    //ToString 
    @Override
    public String toString() {
        return "Asignaturas{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
    
    
    
}
