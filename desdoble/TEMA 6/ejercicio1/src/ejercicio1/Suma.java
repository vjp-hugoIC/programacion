/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author alumno
 */
public class Suma extends Calculadora{
    
    //Atributos
    private int sumando;
    
    //Constructores
    //Por defecto
    public Suma() {
    
        super();
        sumando = 0;
    }
    
    //Parametrizado
    public Suma(int numero, int sumando) {
    
        super(numero);
        this.sumando = sumando;
    }
    
    //Getters y setters
    public int getSumando() {
        return sumando;
    }
    public void setSumando(int sumando) {
        this.sumando = sumando;
    }
    
    //Metodo mostrar
    public void mostrarSuma() {
    
        mostrarCalculadora();
        System.out.println("Sumando: " + sumando);
    }
    
    //ToString
    @Override
    public String toString() {
        return super.toString() + "Suma{" + "sumando=" + sumando + '}';
    }
    
    //Otros metodos
    @Override
    public void realizarOperacion() {
        System.out.println("El resutado de la operacion es: " + (getNumero() + sumando));
    }
    
    
    
    
}
