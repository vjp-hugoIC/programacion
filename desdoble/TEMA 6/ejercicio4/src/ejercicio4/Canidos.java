/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author VSPC-210660
 */
public abstract class Canidos extends Animal{
    
    //Atributos
    
    //Constructores
    //Por defecto
    public Canidos() {
    
        super();
    }
    
    //Parametrizado
    public Canidos(String nombre, int edad, int peso) {
    
        super(nombre, edad, peso);
    }
    
    //Getters y setters
    
    //To string

    @Override
    public String toString() {
        return "Canidos{" + '}' + super.toString();
    }
    
    
}
