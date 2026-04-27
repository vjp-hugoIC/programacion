/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventario;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class Inventario {
    
    //Constante con la ruta del fichero
    public final static String FICHERO = "inventario.txt";
    
    //Opciones del menu
    public static void mostrarMenu() {
    
        System.out.println("MENU");
        System.out.println("1. Rellenar inventario.");
        System.out.println("2. Guardar los datos de inventario en un fichero.");
        System.out.println("3. Leer y procesar los datos del inventario.");
        System.out.println("4. Salir");
    }
    
    //Metodo para pedir opcion del menu
    public static int pedirOpcion() {
    
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        System.out.println("Elige una opcion del menu: ");
        
        opcion = entrada.nextInt();
        
        return opcion;
    }
    
    //Metodo para pedir nombre del producto
    public static String pedirNombre() {
    
        Scanner entrada = new Scanner(System.in);
        String nombreP;
        System.out.println("Introduce el nombre del producto: ");
        
        nombreP = entrada.nextLine();
        
        return nombreP;
    }
    
    //Metodo para pedir la cantidad
    public static int pedirCantidad() {
    
        Scanner entrada = new Scanner(System.in);
        int cantidadP;
        System.out.println("Introduce la cantidad del producto: ");
        
        cantidadP = entrada.nextInt();
        
        return cantidadP;
    }
    
    //Metodo para pedir el precio
    public static int pedirPrecio() {
    
        Scanner entrada = new Scanner(System.in);
        int precioP;
        System.out.println("Introduce el precio del producto: ");
        
        precioP = entrada.nextInt();
        
        return precioP;
    }
    
    //Metodo para escribir en el fichero
    public static void escribirFichero(String fichero, Producto producto1) throws FileNotFoundException, IOException {
    
        System.out.println("Escribiendo fichero...");
        
        try (
                FileWriter fw = new FileWriter(fichero, true);
                PrintWriter pw = new PrintWriter(fw);
                ) {
        
            pw.print(producto1.getNombre() + "#" );
            pw.print(producto1.getCantidad() + "#");
            pw.print(producto1.getPrecio() + "#");
        }
    }
    
    //Metodo para leer el fichero
    public static void leerFichero(String fichero) throws FileNotFoundException, IOException {
    
        System.out.println("Leyendo fichero...");
        
        try(
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);
                ) {
        
            String linea = br.readLine();
            
            while(linea != null) {
            
                System.out.println(linea);
                linea = br.readLine();
            }
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaro la variable de la opcion del menu
         int  opcion;
         Producto producto = new Producto();
         
         do {
         
             mostrarMenu();
             opcion = pedirOpcion();
             
             try {
             
                 switch (opcion) {
                 
                     case 1:
                         producto.setNombre(pedirNombre());
                         producto.setCantidad(pedirCantidad());
                         producto.setPrecio(pedirPrecio());
                         break;
                         
                     case 2:
                         escribirFichero(FICHERO, producto);
                         break;
                         
                     case 3:
                         leerFichero(FICHERO);
                         break;
                      
                     case 4:
                         System.out.println("Saliendo...");
                         break;
                       
                     default: 
                         System.out.println("Opcion no valida.");
                 }
             } catch (InputMismatchException e) {
                 System.out.println("ERROR: Dato no valido");
             } catch (FileNotFoundException e){
                 System.out.println("ERROR.");
             } catch (IOException e) {
                 System.out.println("ERROR");
             }
             
         } while (opcion != 4);
        
        
        // TODO code application logic here
    }
    
}
