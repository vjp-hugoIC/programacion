/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author alumno
 */
public class Coche {
    
    //Atributos
    private String marca;
    private String modelo;
    private Rueda rueda;
    
    //Constructores
    //Por defecto
    public Coche() {
        
        this.marca = "";
        this.modelo = "";
        this.rueda = new Rueda();
    }
    
    //Parametrizado
    public Coche(String marca, String modelo, Rueda rueda) {
    
        this.marca = marca;
        this.modelo = modelo;
        this.rueda = rueda;
    } 
    
    //Getters y setters
    public String obtenerMarca() {
        
        return marca;
    }
    public void establecerMarca(String marca) {
    
        this.marca = marca;
    }
    
    public String obtenerModelo() {
        
        return modelo;
    }
    public void establecerModelo(String modelo) {
        
        this.modelo = modelo;
    }
    
    public Rueda obtenerRueda() {
    
        return rueda;
    }
    public void establecerRueda(Rueda rueda) {
    
        this.rueda = rueda;
    }
    
    //Mostrar
    public void mostrarCoche() {
    
        System.out.println("La marca es: " + marca);
        System.out.println("El modelo el: " + modelo);
        rueda.mostrarRueda();
    }
    
    //Metodo toString
    @Override 
    public String toString(){
    
        return "La marca del coche es: " + marca + ", el modelo es: " + modelo + " y tiene una rueda: " + rueda;
    }
    
}
