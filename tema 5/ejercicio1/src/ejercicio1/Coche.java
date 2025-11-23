/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author alumno
 */
public class Coche {
    
    //Atributos
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean motorEncendido;
    
    //Constructores
    //Por defecto
    public Coche() {
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.velocidad = 0;
        this.motorEncendido = false;
    }
    
    //Parametrizados
    public Coche(String marca, String modelo, String color, int velocidad, boolean motorEncendido) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
        this.motorEncendido = motorEncendido;
    }
    
    //Getters y Setters
    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    public String getmodelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    
    public int getVelocidad() {
        return this.velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
    public boolean getMotorEncendido() {
        return this.motorEncendido;
    }
    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }
    
    //Métodos
    public void establecerMarca() {
        System.out.println("Introduce una marca");
    }
    
    public void estableceModelo() {
        System.out.println("Introduce el modelo");
    }
    
    public void estableceColor() {
        System.out.println("Introduce el color");
    }
    
    public void arrancarCoche() {
        motorEncendido = true;
        velocidad = 10;
         }
    
    public void apagarCoche() {
        motorEncendido = true;
        velocidad = 0;
    }
    
    public void acelerarCoche() {
        velocidad = +20;
    }
    
    public void frenarCoche() {
        velocidad = -6;
    }
    
    public void obtenerEstado()
    
    //To string
    
}
