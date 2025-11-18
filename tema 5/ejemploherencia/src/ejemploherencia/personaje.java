/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploherencia;

/**
 *
 * @author alumno
 */
public class personaje {
    
    //Atributos
    private int vida; 
    
    
    //Constructores
    public personaje() {
        this.vida = 100;
    }
    public personaje(int vida) {
        this.vida = vida;
    }
    
    //Getters Setters
    public int getVida() {
        return this.vida;
    }
    public void setVida(int vida) {
    this.vida = vida;
    }
    
    //Métodos
    public void atacar() {
        System.out.println("Atacando...");
    }
    
    //To string
    @Override
    public String toString() {
        return "ElL PERSONAJE tiene " + this.vida + "% de vida";
    }
    
}
