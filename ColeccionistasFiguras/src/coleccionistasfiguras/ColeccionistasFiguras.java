/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coleccionistasfiguras;
import java.util.Scanner;


/**
 *
 * @author alumno
 */
public class ColeccionistasFiguras {
    
    /**Metodo para mostrar el menu con las diferentes opciones
     * 
     */
        public static void mostrarMenu() {
            System.out.println("Elige una opcion");
            System.out.println("1. Rellenar la vitrina de figuras");
            System.out.println("2. Mostrar todas las figuras de una coleccion determinada");
            System.out.println("3. Mostrar la figura mas valiosa");
            System.out.println("4. Salir");
        }
        
        
        /**
         * Metodo para que el usuario elija una opcion
         * @param sc
         * @return 
         */
        public static int elegirOpcion(Scanner sc) {
            int opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer
        return opcion;
        }
        
        
        /**
         * Metodo para procesar la opción del usuario y hacer cada una de las opciones del menu
         * @param opcion
         * @param vitrina
         * @param sc 
         */
        public static void procesarOpcion(int opcion, Figura[][] vitrina, Scanner sc) {
        switch (opcion) {
            case 1:
            for (int i = 0; i < vitrina.length; i++) {
                for (int j = 0; j < vitrina[i].length; j++) {

                    System.out.println("Introduce los datos para el estnte " + (i + 1) + ", compartimento " + (j + 1));

                    // Nombre
                    System.out.print("Nombre del personaje: ");
                    String nombre = sc.nextLine();

                    // Valor
                    System.out.print("Valor del personaje: ");
                    double valor = sc.nextDouble();
                    sc.nextLine(); // limpiar buffer

                    // Coleccion
                    System.out.print("Coleccion a la que pertenece: ");
                    String coleccion = sc.nextLine();

                    // Crear la figura y colocarla en la vitrina
                    vitrina[i][j] = new Figura(nombre, valor, coleccion);

                    System.out.println("Figura agregada.");
                    }
                }

                System.out.println("Vitrina completamente rellenada.");
                break;
    
            case 2:
            System.out.print("Introduce el nombre de la colección que quieres ver: ");
            String coleccionBuscada = sc.nextLine();

            boolean encontrada = false;

            for (int i = 0; i < vitrina.length; i++) {
                for (int j = 0; j < vitrina[i].length; j++) {
                    Figura f = vitrina[i][j];
                     if (f != null && f.getColeccion().equalsIgnoreCase(coleccionBuscada)) {
                        System.out.println("Estante " + (i + 1) + ", Compartimento " + (j + 1) + ": " + f);
                        encontrada = true;
                    }
                }
            }

            if (!encontrada) {
                System.out.println("No hay figuras en la coleccion " + coleccionBuscada);
            }

            break;
            case 3:
                System.out.println("La figura mas valiosa es: ");
                break;
                
            case 4:
                System.out.println("Saliendo del programa");
                break;
        }
        }
            
    /**
     * Crea una matriz bidemensional con 3 filas y 3 columnas y devuelve la matriz para usarla en otros metodos.
     * @return 
     */
         public static Figura[][] crearVitrina() {
            return new Figura[3][3];
        }
                
                
         /**
          * Recorre toda la matriz  y asigna el valor vacio en cada compartimento
          * @param vitrina 
          */
         public static void inicializarVitrina(Figura[][] vitrina) {
            for (int i = 0; i < vitrina.length; i++) {
            for (int j = 0; j < vitrina[i].length; j++) {
                vitrina[i][j] = null; 
                }
            }
        }
         
         
         /** recorre y muestra cada estante 
          * 
          * @param vitrina 
          */
         public static void mostrarVitrina(Figura[][] vitrina) {
            for (int i = 0; i < vitrina.length; i++) {
                System.out.println("Estante " + (i + 1) + ":");

                for (int j = 0; j < vitrina[i].length; j++) {
                    if (vitrina[i][j] == null) {
                        System.out.print("[ Vacio ] ");
                    } else {
                        System.out.print("[" + vitrina[i][j] + "] "); 
                    }
                }
                System.out.println();
            }
        }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        //Creo la vitrina
        Figura[][] vitrina = crearVitrina();
            inicializarVitrina(vitrina);

            Scanner sc = new Scanner(System.in);
            int opcion;

            //Hago un bucle para mostrar el menu
            do {
                mostrarMenu();               
                opcion = elegirOpcion(sc);   
                procesarOpcion(opcion, vitrina, sc); 
            } while (opcion != 4);

            sc.close(); 
   
        }
        
    }
    

