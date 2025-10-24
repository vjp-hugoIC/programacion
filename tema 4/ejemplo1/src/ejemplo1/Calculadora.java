package ejemplo1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Calculadora {
    
      /**
     * metodo resta dos numero pasados por parametro
     * @param num1
     * @param num2
     * @return la resta de dos numeros
     */
    public static int resta (int num1, int num2) {
    return num1 - num2;
    }
    
    /**
     * metodo que suma dos numeros pasados por parametro
     * @param num1
     * @param num2
     * @return  la suma de dos numeros
     */
    public static int suma (int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }
    
    /**
     * metodo que multiplica dos numero pasados por parametro
     * @param num1
     * @param num2
     * @return  la multiplicacion de dos numero
     */
    public static int multiplicacion (int num1, int num2) {
    return num1 * num2;
    }
    
     /**
     * metodo que divide dos numero pasados por parametro
     * @param num1
     * @param num2
     * @return  la division de dos numero
     */
    public static int division (int num1, int num2) {
    return num1 / num2;
    }
    
    /**
     * Metodo que calcula la raiz cuadrada de numero pasado por parametro
     * @param num1
     * @return la raiz cuadrada
     */
    public static double raizCuadrada(int num1){
        return Math.sqrt(num1);
    }
    
}
