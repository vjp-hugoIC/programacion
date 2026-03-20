/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author VSPC-210660
 */
public class Saludo {
    
    //Atributos
    private String frase;
    
    //Constructores
    //Por defecto
    public Saludo() {
   
        this.frase = "";
    }
    
    //Por defecto
    public Saludo(String frase) {
    
        this.frase = frase;
    }
    
    
    //Getters y setters
    public String getFrase() {
    
        return frase;
    }
    
    public void setFrase(String frase) {
    
        this.frase = frase;
    }
    
    //Metodo mostrar
    public void mostrarSaludo() {
    
        System.out.println(frase);    
    }
    
    //Metodo toString
    @Override
    public String toString() {
    
        return frase;
    }
    
    
}
