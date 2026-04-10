/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author alumno
 */
public class Multiplicacion extends Calculadora{
    
    //Atributos
    private int multiplicador;
    
    //Constructores
    //Por defecto
    public Multiplicacion() {
    
        super();
        multiplicador = 0;
    }
    
    //Parametrizado
    public Multiplicacion(int numero, int multiplicador) {
    
        super(numero);
        this.multiplicador = multiplicador;
    }
    
    //Getters y setters
    public int getMultiplicador() {
        return multiplicador;
    }
    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }
    
    //Metodo mostrar
    public void mostrarMultiplicacion() {
    
        mostrarCalculadora();
        System.out.println("Multiplicador: " + multiplicador);
    }
    
    //ToString
    @Override
    public String toString() {
        return super.toString() + "Multiplicacion{" + "multiplicador=" + multiplicador + '}';
    }

    //Otros metodos
    @Override
    public void realizarOperacion() {
        System.out.println("El resultado de la operacion es: " + getNumero() * multiplicador);
    }
    
    
    
}
