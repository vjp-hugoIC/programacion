/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Numero num1 = new Numero();
        Numero num2 = new Numero();
        Numero num3 = new Numero();
        
        num1.setValor(1);
        num2.setValor(9);
        num3.setValor(3);
        
        elMayor(num1, num2, num3);
        
        // TODO code application logic here
    }
    
    public static void elMayor(Numero num1, Numero num2, Numero num3) {
        int mayor = num1.getValor();
        
        if (num2.getValor() > mayor) {
            mayor = num2.getValor();
        }

        if (num3.getValor() > mayor) {
            mayor = num3.getValor();
        }

        System.out.println("El mayor es: " + mayor);
    }
    }
    
