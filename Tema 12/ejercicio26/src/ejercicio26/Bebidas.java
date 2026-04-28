/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio26;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class Bebidas implements Serializable{
    
    //Atributos
    private String nombreBebida;
    private double precio;
    private int stock;
    
    //Constructores
    //Por defecto
    public Bebidas() {
    
        nombreBebida = "";
        precio = 0.0;
        stock = 0;
    }
    
    //Parametrizado
    public Bebidas(String nombreBebida, double precio, int stock) {
    
        this.nombreBebida = nombreBebida;
        this.precio = precio;
        this.stock = stock;
    }
    
    //Getters y setters
    public String getNombreBebida() {
        return nombreBebida;
    }
    public void setNombreBebida(String nombreBebida) {
        this.nombreBebida = nombreBebida;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Bebidas{" + "nombreBebida=" + nombreBebida + ", precio=" + precio + ", stock=" + stock + '}';
    }
    
    //Otros metodos
    
}
