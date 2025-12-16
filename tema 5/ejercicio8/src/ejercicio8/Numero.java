/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author VSPC-210660
 */
public class Numero {
    
    //Atributos 
    private int valor;
    
    //Contructor por defecto
    public Numero() {
        this.valor = 0;
    }
    
    //Constructor parametrizado
    public Numero (int valor) {
        this.valor = valor;
    }
    
    //Getters y setters
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    //Metodo ToString
    @Override
    public String toString() {
        return "El numero introducido es " + valor;
    }
    
}
