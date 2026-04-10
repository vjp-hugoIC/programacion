/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author VSPC-210660
 */
public class Leones extends Felinos{
    
    //Atributos
    
    //Constructores
    //Por defecto
    public Leones() {
    
        super();
    }
    
    //Parametrizado
    public Leones(String nombre, int edad, int peso) {
    
        super(nombre, edad, peso);
    }
    
    //Getters y setters
    
    //To String
    @Override
    public String toString() {
        return "Leones{" + '}' + super.toString();
    }
    
    //Otros metodos

    @Override
    public void sonido() {
        System.out.println("Sonido: Rugido");
    }

    @Override
    public void alimentacion() {
        System.out.println("Alimentacion: Carnívora");
    }

    @Override
    public void habitat() {
        System.out.println("Habitat: Sabana");
    }

    @Override
    public void nCientifico() {
        System.out.println("Nombre cientifico: Panthera leo");
    }
    
}
