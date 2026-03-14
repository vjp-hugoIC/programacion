/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio26 {
    
    //Declaro el metodo para comprobar si es primo
    public static boolean esPrimo(int num1) {
        
        //Si el numero es menor o igual a 1 devuelve falso
        if (num1 <= 1) {
            return false;
        }
        
        //Con un bucle buscamos si tiene algun divisor cuyo resto sea 0, si lo tiene no es primo
        for (int i = 2; i < (num1-1); i++) {
            if (num1 % i == 0) {
                return false;
            }
        }

        return true;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaro la variable y le asigno el valor que quiero que compruebe
        int numero = 103;
        
        //Si es primo muestra que lo es y sino muestra que no es primo
        if (esPrimo(numero)) {
            System.out.println(numero + " es primo");
        } else {
            System.out.println(numero + " no es primo");
        }
    }
        
        // TODO code application logic here
}
    
