/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author VSPC-210660
 */
public abstract class Felinos extends Animal{
    
    //Atributos
    
    //Constructores
    //Por defecto
    public Felinos() {
    
        super();
    }
    
    //Parametrizado
    public Felinos(String nombre, int edad, int peso) {
    
        super(nombre, edad, peso);
    }
    
    //Getters y setters
    
    //To String

    @Override
    public String toString() {
        return "Felinos{" + '}' + super.toString();
    }
    
    
}
