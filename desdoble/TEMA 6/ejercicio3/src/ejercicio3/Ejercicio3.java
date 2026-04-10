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
        
        //Creo un objeto de cada 
        Circulo circulo = new Circulo("Azul", 4.3);
        Rectangulo rectangulo = new Rectangulo("Verde", 3, 6);
        Cuadrado cuadrado = new Cuadrado("Rojo", 4);
        Triangulo triangulo = new Triangulo("Amarillo", 5, 10);
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo("Negro", 2, 4);
        
        //Pruebo cada uno de los metodos
        circulo.area();
        circulo.perimetro();
        
        System.out.println("");
        
        rectangulo.area();
        rectangulo.perimetro();
        
        System.out.println("");
        
        cuadrado.area();
        cuadrado.perimetro();
        
        System.out.println("");
        
        triangulo.area();
        triangulo.perimetro();
        
        System.out.println("");
        
        trianguloRectangulo.hipotenusa();
        trianguloRectangulo.tipo();
        
        //Creo un objeto de cada usando polimorfismo
        FiguraGeometrica circulo2 = new Circulo("Rojo", 5.2);
        FiguraGeometrica rectangulo2 = new Rectangulo("Blanco", 5, 10);
        FiguraGeometrica cuadrado2 = new Cuadrado("Azul", 3.5);
        FiguraGeometrica triangulo2 = new Triangulo("Naranja", 3.6, 8.65);
        FiguraGeometrica trianguloRectangulo2 = new TrianguloRectangulo("Marron", 4.7, 8);
        
        //Pruebo todos los metodos
        circulo2.area();
        circulo2.perimetro();
        
        System.out.println("");
        
        rectangulo2.area();
        rectangulo2.perimetro();
        
        System.out.println("");
        
        cuadrado2.area();
        cuadrado2.perimetro();
        
        System.out.println("");
        
        triangulo2.area();
        triangulo2.perimetro();
        
        System.out.println("");
        
        trianguloRectangulo2.
        
        // TODO code application logic here
    }
    
}
