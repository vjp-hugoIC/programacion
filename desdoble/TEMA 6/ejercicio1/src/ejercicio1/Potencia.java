/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author alumno
 */
public class Potencia  extends Calculadora{
    
    //Atributos
    private int exponente;
    
    //Constructores
    //Por defecto
    public Potencia() {
    
        super();
        exponente = 0;
    }
    
    //Parametrizado
    public Potencia(int numero, int exponente) {
    
        super(numero);
        this.exponente = exponente;
    }
    
    //Getters y setters
    public int getExponente() {
        return exponente;
    }
    public void setExponente(int exponente) {
        this.exponente = exponente;
    }
    
    //Metodo mostrar
    public void mostrarPotencia() {
    
        mostrarCalculadora();
        System.out.println("Exponente: " + exponente);
    }
    
    //Otros metodos

    @Override
    public void realizarOperacion() {
        System.out.println("El resultado de la operacion es: " + Math.pow(getNumero(), exponente));
    }
    
    
}
