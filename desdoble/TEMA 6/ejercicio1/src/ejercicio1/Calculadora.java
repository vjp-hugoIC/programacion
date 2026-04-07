/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author alumno
 */
public abstract class Calculadora {
    
    //Atributos
    private int numero;
    
    //Constructores
    //Por defecto
    public Calculadora() {
    
        numero = 0;
    }
    
    //Parametrizado
    public Calculadora(int numero) {
    
        this.numero = numero;
    }
    
    //Getters y setters
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //Metodo mostrar
    public void mostrarCalculadora() {
    
        System.out.println("Numero: " + numero);
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return "Calculadora{" + "numero=" + numero + '}';
    }
    
    //Otros metodos
    public abstract void realizarOperacion();
    
    
}
