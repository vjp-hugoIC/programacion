/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionistasfiguras;

/**
 *
 * @author alumno
 */
public class Figura {
    
    // Atributos de la figura
    private String nombre;
    private double valor;
    private String coleccion;
    
    //Constructores por defecto
    public Figura() {
        this.nombre = "Desconocido";
        this.valor = 0.0;
        this.coleccion = "Sin colección";
    }
    
    //Constructores parametrizados
    public Figura(String nombre, double valor, String coleccion) {
        this.nombre = nombre;
        this.valor = valor;
        this.coleccion = coleccion;
    }
    
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String getColeccion() {
        return coleccion;
    }
    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }
    
    
    // Metodo toString
    @Override
    public String toString() {
        return nombre + " " +  valor + " €" +  ", " + coleccion;
    }

    
}
