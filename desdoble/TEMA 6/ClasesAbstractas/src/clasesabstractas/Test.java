
package clasesabstractas;

/**
 * Clase Test
 * 
 * @author Daniel
 */
public class Test {
    
    public static void main(String[] args) {
               
        //2. LAS CLASES ABSTRACTAS
        /*Triangulo trianguloRojo = new Triangulo("rojo", 5, 10);
        Circulo circuloAzul = new Circulo("azul", 6);

        System.out.println("Se ha creado un triángulo con los siguientes datos: ");
        System.out.println("Base: " + trianguloRojo.getBase() + ". Altura: " + trianguloRojo.getAltura());  
        System.out.println("Color: " + trianguloRojo.getColor() + ". Área: " + trianguloRojo.calcularArea());  
        
        System.out.println("\nSe ha creado un círculo con los siguientes datos: ");
        System.out.println("Radio: " + circuloAzul.getRadio());  
        System.out.println("Color: " + circuloAzul.getColor() + ". Área: " + circuloAzul.calcularArea());
        
        //FiguraGeometrica figuraGeometrica = new FiguraGeometrica();
        //No se puede instanciar una clase abstracta */
        
        
        
        
        //3. EL POLIMORFISMO
        FiguraGeometrica figura;
        
        figura = new Triangulo("rojo", 5, 10);
        System.out.println("Área del triángulo: " + figura.calcularArea());
        
        System.out.println(figura.getColor());
        
        //No se pueden invocar estos métodos porque pertenecen a la clase Triangulo
        //System.out.println(figura.getBase());
        //System.out.println(figura.getAltura());
        
        //Para invocar a los métodos anteriores el objeto debe ser de la clase Triangulo
        //Utilizamos un casting explícito para convertir de FiguraGeometrica a Triangulo
        Triangulo triangulo = (Triangulo) figura;
        System.out.println(triangulo.getBase());
        System.out.println(triangulo.getAltura());
        
        figura = new Circulo("azul", 6);
        System.out.println("Área del círculo: " + figura.calcularArea());
        
        figura = new Rectangulo("amarillo", 8, 4);
        System.out.println("Área del rectángulo: " + figura.calcularArea());
            
        
    }
    
    
}
