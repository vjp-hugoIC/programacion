/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author VSPC-210660
 */
public class Gatos extends Felinos{
    
    //Atributos
    
    //Constructores
    //Por defecto
    public Gatos() {
    
        super();
    }
    
    //Parametrizado
    public Gatos(String nombre, int edad, int peso) {
    
        super(nombre, edad, peso);
    }
    
    //Getters y setters
    
    //To String
    @Override
    public String toString() {
        return "Gatos{" + '}' + super.toString();
    }
    
    //Otros metodos

    @Override
    public void sonido() {
        System.out.println("Sonido: Maullido");
    }

    @Override
    public void alimentacion() {
        System.out.println("Alimentacion: Ratones");
    }

    @Override
    public void habitat() {
        System.out.println("Habitat: Doméstico");
    }

    @Override
    public void nCientifico() {
        System.out.println("Nombre cientifico: Felis silvestris catus");
    }
    
    
}
