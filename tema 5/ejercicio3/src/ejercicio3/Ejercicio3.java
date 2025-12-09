/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Rueda ruedanueva = new Rueda();
        //System.out.println(ruedanueva);
        
        Rueda reudaaluminio = new Rueda();
        
        //asignamos valores usando metodos publicos
        reudaaluminio.establecerMaterial("Aluminio");
        reudaaluminio.establecerPulgadas(15);
        
        //Mostramos los valores
        System.out.println(reudaaluminio);
        
        // TODO code application logic here
    }
    
}
