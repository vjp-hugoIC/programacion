/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author VSPC-210660
 */
public class Numero {
    
    //Atributos
    private int valor;
    
    //Constructores por defecto
    public Numero() {
        this.valor = 0;
    }
    
    //Constructores parametrizados
    public Numero (int valor) {
        this.valor = valor;
    }
    
    //Getters y Setters

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    //Metodo toString
    @Override
    public String toString(){
        return "El valor es " + valor;
    }
    
}
