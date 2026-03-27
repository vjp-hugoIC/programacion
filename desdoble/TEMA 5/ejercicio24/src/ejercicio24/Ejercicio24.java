/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo un objeto de cada tipo
        ProductoFresco productoFresco1 = new ProductoFresco(2030, 1, 2029, "España");
        ProductoRefrigerado productoRefrigerado1 = new ProductoRefrigerado(2027, 2, 1111);
        ProductoCongelado productocongelado1 = new ProductoCongelado(2025, 3, 40);
        
        //Muestro la informacion de cada objeto
        productoFresco1.mostrarProductoFresco();
        System.out.println("");
        productoRefrigerado1.mostrarProductoRefrigerado();
        System.out.println("");
        productocongelado1.mostrarProductoCongelado();
        
        // TODO code application logic here
    }
    
}
