/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

import java.util.Scanner;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio25 {
    
    //Pedir al usuario ram
    public static int pedirRam() {
    
        int num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la Ram: ");
        num = entrada.nextInt();
        
        return num;
        
    }
    
    //Pedir modelo de tarjeta
    public static String pedirTarjeta() {
    
        String tarjeta;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la tarjeta: ");
        tarjeta = entrada.nextLine();
        
        return tarjeta;
        
    }
    
    //Metodo para que la capacidad del disco sea multiplo de 5
    public static int pedirCapacidad() {
    
        int num;
        Scanner entrada = new Scanner(System.in);
        
        do {
        
            System.out.println("Introduce la capacidad del disco duro (múltiplo de 5): ");
            num = entrada.nextInt();
            
            if (num % 5 != 0) {
            
                System.out.println("Error: debe ser multiplo de 5.");
            }
        } while (num % 5 != 0);
        
        return num;
    }
    
    //Pedir modelo de procesador
    public static String pedirProcesador() {
    
        int opcion;
        String procesador = "";
        Scanner entrada = new Scanner(System.in);
        
        do {
        
            System.out.println("Elige un modelo de procesador:");
            System.out.println("1. Intel i5");
            System.out.println("2. Intel i7");
            System.out.println("3. AMD Ryzen 5");
            System.out.println("4. AMD Ryzen 7");

            opcion = entrada.nextInt();
            
            switch (opcion) {
            case 1:
                procesador = "Intel i5";
                break;
            case 2:
                procesador = "Intel i7";
                break;
            case 3:
                procesador = "AMD Ryzen 5";
                break;
            case 4:
                procesador = "AMD Ryzen 7";
                break;
            default:
                System.out.println("Opción no válida, inténtalo de nuevo.");
            }
        } while (opcion < 1 || opcion > 4);
        
        return procesador;
        
    }
    
    //Pedir precio
    public static int pedirPrecio() {
    
        int num;
        Scanner entrada = new Scanner(System.in);
        
        do {
        
            System.out.println("Introduce el precio (mayor que 0): ");
            num = entrada.nextInt();
        } while (num <= 0);
        
        return num;
        
    }
    

    
    //Pedir tamaño monitor
    public static int pedirMonitor() {
    
        int num;
        Scanner entrada = new Scanner(System.in);
        
        do {
        
            System.out.println("Introduce el tamaño del monitor (mayor de 14): ");
            num = entrada.nextInt();
        } while (num <= 14);
        
        return num;
        
    }
    
     //Pedir teclado
     public static int pedirTeclado() {
    
        int num;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el tamaño del teclado: ");
        num = entrada.nextInt();

        return num;
        
    }
     
     //Pedir modelo de tarjeta
    public static String pedirRaton() {
    
        String raton;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el modelo del raton: ");
        raton = entrada.nextLine();
        
        return raton;
        
    }
    
    public static String pedirMarcaPortatil() {
    
        String marca;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la marca del portatil: ");
        marca = entrada.nextLine();
        
        return marca;
        
    }
    
    //Pedir tamaño pantalla
     public static int pedirTamañoPantalla() {
    
        int num;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el tamaño de la pantalla: ");
        num = entrada.nextInt();

        return num;
        
    }
     
     //Pedir teclado
     public static int pedirPeso() {
    
        int num;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el peso del portatil: ");
        num = entrada.nextInt();

        return num;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo 2 objetos de la clase servidor
        Servidor servidor1 = new Servidor(pedirRam(), pedirCapacidad(), pedirProcesador(), pedirTarjeta(), pedirPrecio(), pedirMonitor(), pedirTeclado(), pedirRaton());
        Servidor servidor2 = new Servidor(pedirRam(), pedirCapacidad(), pedirProcesador(), pedirTarjeta(), pedirPrecio(), pedirMonitor(), pedirTeclado(), pedirRaton());
        
        //Creo 2 objetos de la clase portatil
        Portatil portatill = new Portatil(pedirRam(), pedirCapacidad(), pedirProcesador(), pedirTarjeta(), pedirPrecio(), pedirMarcaPortatil(), pedirTamañoPantalla(), pedirPeso());
        Portatil portatil2 = new Portatil(pedirRam(), pedirCapacidad(), pedirProcesador(), pedirTarjeta(), pedirPrecio(), pedirMarcaPortatil(), pedirTamañoPantalla(), pedirPeso());
        
        //Creo 1 objeto servidor por defecto y otro de la clase portatil
        Servidor servidor3 = new Servidor();
        Portatil portatil3 = new Portatil();
        
        //Asigno los valores
        servidor3.setRam(pedirRam());
        servidor3.setDiscoDuro(pedirCapacidad());
        servidor3.setModeloProcesador(pedirProcesador());
        servidor3.setModeloTarjeta(pedirTarjeta());
        servidor3.setPrecio(pedirPrecio());
        servidor3.setMonitor(pedirMonitor());
        servidor3.setTeclado(pedirTeclado());
        servidor3.setRaton(pedirRaton());
        
        portatil3.setRam(pedirRam());
        portatil3.setDiscoDuro(pedirCapacidad());
        portatil3.setModeloProcesador(pedirProcesador());
        portatil3.setModeloTarjeta(pedirTarjeta());
        portatil3.setPrecio(pedirPrecio());
        portatil3.setMarca(pedirMarcaPortatil());
        portatil3.setTamañoPantalla(pedirTamañoPantalla());
        portatil3.setPeso(pedirPeso());
        
        //Muestro todos los daots de los 6 objetos
        servidor1.mostrarServidor();
        System.out.println("");
        servidor2.mostrarServidor();
        System.out.println("");
        servidor3.mostrarServidor();
        System.out.println("");
        portatill.mostrarPortatil();
        System.out.println("");
        portatil2.mostrarPortatil();
        System.out.println("");
        portatil3.mostrarPortatil();
        
        // TODO code application logic here
    }
    
}
