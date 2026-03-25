
package ejemploherencia;

/**
 * Clase EjemploHerencia
 * 
 * @author Daniel
 */
public class EjemploHerencia {

    /**
     * Método main
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos un objeto "Coche" con el constructor por defecto y los setters
        Coche coche1 = new Coche();
        coche1.setMarca("Audi");
        coche1.setModelo("A3");
        coche1.setVelocidad(100);
        coche1.setNumPuertas(5);
        
        //Crear un objeto "Moto" con el constructor parametrizado
        Moto moto1 = new Moto("Suzuki", "Ninja", 200, 1000);
        
        //Mostramos los vehículos "coche1" y "moto1" con el método mostrar
        coche1.mostrarCoche();
        System.out.println("");
        moto1.mostrarMoto();      
        System.out.println("");
        
        //Mostramos los vehículos "coche1" y "moto1" con el método toString()
        System.out.println(coche1.toString());
        System.out.println(moto1.toString()); 
        System.out.println("");
        
        //Aceleramos y frenamos los vehículos "coche1" y "moto1"
        coche1.acelerarVehiculo(50);
        moto1.acelerarVehiculo(20);
        coche1.frenarVehiculo(10);
        moto1.frenarVehiculo(5);
        
        //Mostramos la velocidad de los vehículos "coche1" y "moto1" (atributo de la superclase)
        System.out.println("Velocidad de coche1: " + coche1.getVelocidad());
        System.out.println("Velocidad de moto1: " + moto1.getVelocidad());
        System.out.println("");
        
        //Mostramos los atributos propios de cada una de las subclases
        System.out.println("NumPuertas de coche1: " + coche1.getNumPuertas());
        System.out.println("Cilindrada de moto1: " + moto1.getCilindrada());
    }

}
