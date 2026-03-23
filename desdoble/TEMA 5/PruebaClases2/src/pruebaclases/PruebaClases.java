
package pruebaclases;

/**
 * Clase PruebaClases (Main class)
 * 
 * @author Daniel
 */
public class PruebaClases {

    /**
     * Método main
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos coche1 con el constructor por defecto y establecemos el valor
        //de sus atributos utilizando los setters
        Coche coche1 = new Coche();
        coche1.setMarca("Audi");
        coche1.setModelo("A3");
        coche1.setAniosAntiguedad(10);   
        
        //Creamos una rueda para el coche1 de diámetro 10
        Rueda ruedaCoche1 = new Rueda(10);
        coche1.setRueda(ruedaCoche1);
        
        //Creamos una rueda para el coche2 de diámetro 20
        Rueda ruedaCoche2 = new Rueda(20);
        
        //Creamos coche2 con el constructor parametrizado
        Coche coche2 = new Coche("Seat", "León", 5, ruedaCoche2);           
        
        //EJEMPLOS:
        
        //1. Comprobar que al mostrarCoche() también se muestra el diámetro de sus ruedas (mostramos coche1 y coche2)   
        coche1.mostrarCoche();
        System.out.println("");     
        coche2.mostrarCoche();      
        System.out.println(""); 
        
        //2. Mostrar los coches con toString() para ver que también se invoca al toString() de rueda
        System.out.println("Coche1: " + coche1.toString());
        System.out.println("Coche2: " + coche2.toString());       
        System.out.println(""); 
        
        //3. Obtener la rueda de un coche en un objeto Rueda y mostrar su diámetro con getDiametro()       
        Rueda ruedaObtenida1 = coche1.getRueda();
        System.out.println("Diámetro ruedaObtenida1: " + ruedaObtenida1.getDiametro());   
        System.out.println("");
        
        //4. Mostrar el diámetro de la rueda de un coche directamente con getRueda().getDiametro()
        System.out.println("Diámetro rueda coche2: " + coche2.getRueda().getDiametro());
        System.out.println("");
        
        //5. Obtener la rueda de un coche en un objeto Rueda y cambiarle el valor del diámetro con setDiametro()
        Rueda ruedaObtenida2 = coche2.getRueda();
        ruedaObtenida2.setDiametro(30);
        coche2.mostrarCoche();
        System.out.println("");
        
        //6. Cambiar el valor del diámetro de la rueda de un coche directamente con getRueda().setDiametro()
        coche2.getRueda().setDiametro(50);
        System.out.println(coche2.toString());
        
    }

}
