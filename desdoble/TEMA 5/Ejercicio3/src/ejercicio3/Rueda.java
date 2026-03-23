/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author alumno
 */
public class Rueda {
    
    //Atributos
    private String material;
    private int pulgadas;
    
    //Constructores
    //Por defecto
    public Rueda() {
    
        this.material = "";
        this.pulgadas = 0;
    }
    
    //Parametrizado
    public Rueda(String material, int pulgadas) {
    
        this.material = material;
        this.pulgadas = pulgadas;
    }
    
    //Getters y setters
    public String obtenerMaterial() {
        
        return material;
    }
    public void establecerMaterial(String material) {
        
        this.material = material;
    }
    
    public int obtenerPulgadas() {
        
        return pulgadas;
    }
    public void establecerPulgadas(int pulgadas) {
        
        this.pulgadas = pulgadas;
    }
    
    //Mostrar
    public void mostrarRueda() {
        
        System.out.println("Material de la rueda: " + material);
        System.out.println("Pulgadas de la rueda: " + pulgadas);
    }
    
    //Metodo toString
    @Override
    public String toString() {
    
        return "El material de la rueda es: " + material + " y las pulgadas son: " + pulgadas;
    }
    
    //Otros metodos
    
    
}
