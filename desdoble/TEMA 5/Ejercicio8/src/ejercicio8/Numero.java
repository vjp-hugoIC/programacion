/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author alumno
 */
public class Numero {
    
    //Atributos
    private int valor;
    
    //Constructores
    //Por defecto
    public Numero() {
        
        valor = 0;
    }
    
    //Parametrizado
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
    
    //Metodo mostrar
    public void mostrarNumero() {
        
        System.out.println("Valor: " + this.valor);
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return "El valor es " + valor;
    }
    
}
