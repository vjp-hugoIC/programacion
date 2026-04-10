/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author VSPC-210660
 */
public class Lobos extends Canidos{
    
    //Atributos
    
    //Constructores
    //Por defecto
    public Lobos() {
    
        super();
    }
    
    //Parametrizado
    public Lobos(String nombre, int edad, int peso) {
    
        super(nombre, edad, peso);
    }
    
    //Getters y setters
    
    //To String
    @Override
    public String toString() {
        return "Lobos{" + '}' + super.toString();
    }
    
    //Otros metodos

    @Override
    public void sonido() {
        System.out.println("Sonido: Aullido");
    }

    @Override
    public void alimentacion() {
        System.out.println("Alimentacion: Carnívora");
    }

    @Override
    public void habitat() {
        System.out.println("Habitat: Bosque");
    }

    @Override
    public void nCientifico() {
        System.out.println("Nombre cientifico: Canis lupus");
    }
    
}
