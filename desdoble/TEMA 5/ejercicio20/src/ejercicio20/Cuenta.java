/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio20;

/**
 *
 * @author alumno
 */
public class Cuenta {
    
    //Atributos
    private double saldo;
    
    //Constructores 
    //Por defecto
    public Cuenta() {
    
        saldo = 0.0;
    }
    
    //Parametrizado
    public Cuenta(int saldo) {
    
        this.saldo = saldo;
    }
    
    //Gettes y setters

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //Meodo mostrar
    public void mostrarCuenta(){
    
        System.out.println("Saldo: " + saldo);
    }
    
    //ToString

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
    
    //Otros metodos
    //Metodo ingresar
     public void ingresar(double num) {

         saldo = saldo + num;
     }
     
     //Metodo extraer
     public void extraer(double num) {
     
         saldo = saldo - num;
     }
    
    
}
