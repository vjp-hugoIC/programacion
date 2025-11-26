/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25;
import java.util.Scanner;

/**
 *
 * @author VSPC-210660
 */
public class Test {
    
    static Scanner sc = new Scanner(System.in);

    // ------------------------- MÉTODOS DE VALIDACIÓN -------------------------

    public static int pedirDisco() {
        int disco;
        do {
            System.out.print("Introduce capacidad del disco (múltiplo de 5): ");
            disco = sc.nextInt();
            if (disco % 5 != 0)
                System.out.println("❌ ERROR: Debe ser múltiplo de 5.");
        } while (disco % 5 != 0);
        return disco;
    }

    public static double pedirPrecio() {
        double precio;
        do {
            System.out.print("Introduce precio (>0): ");
            precio = sc.nextDouble();
            if (precio <= 0)
                System.out.println("❌ ERROR: Debe ser mayor que 0.");
        } while (precio <= 0);
        return precio;
    }

    public static String pedirProcesador() {
        String[] lista = {"i3", "i5", "i7", "Ryzen 5", "Ryzen 7"};
        int opcion;

        do {
            System.out.println("Elige procesador:");
            for (int i = 0; i < lista.length; i++)
                System.out.println((i + 1) + ". " + lista[i]);

            opcion = sc.nextInt();

            if (opcion < 1 || opcion > lista.length)
                System.out.println("❌ ERROR: Opción no válida.");
        } while (opcion < 1 || opcion > lista.length);

        return lista[opcion - 1];
    }

    public static double pedirMonitor() {
        double tam;
        do {
            System.out.print("Introduce tamaño del monitor (>14): ");
            tam = sc.nextDouble();
            if (tam <= 14)
                System.out.println("❌ ERROR: Debe ser mayor que 14.");
        } while (tam <= 14);
        return tam;
    }

    // ------------------------------ MAIN --------------------------------------
    public static void main(String[] args) {

        // Servidores con constructor con parámetros
        System.out.println("CREAR SERVIDOR 1");
        Servidor s1 = new Servidor(16, pedirDisco(), pedirProcesador(),
                "Nvidia GTX 1050", pedirPrecio(), pedirMonitor(),
                "Logitech K120", "Logitech M90");

        System.out.println("CREAR SERVIDOR 2");
        Servidor s2 = new Servidor(32, pedirDisco(), pedirProcesador(),
                "Nvidia RTX 2060", pedirPrecio(), pedirMonitor(),
                "Corsair K55", "Corsair Harpoon");


        // Portátiles con constructor con parámetros
        System.out.println("CREAR PORTÁTIL 1");
        Portatil p1 = new Portatil(8, pedirDisco(), pedirProcesador(),
                "Intel UHD", pedirPrecio(), "HP", 15.6, 2.1);

        System.out.println("CREAR PORTÁTIL 2");
        Portatil p2 = new Portatil(16, pedirDisco(), pedirProcesador(),
                "Nvidia MX250", pedirPrecio(), "Lenovo", 14, 1.8);


        //Servidor por defecto
        System.out.println("CREAR SERVIDOR (POR DEFECTO)");
        Servidor s3 = new Servidor();
        s3.setMemoriaRam(64);
        s3.setCapacidadDisco(pedirDisco());
        s3.setProcesador(pedirProcesador());
        s3.setTarjetaGrafica("Quadro P4000");
        s3.setPrecio(pedirPrecio());
        s3.setTamMonitor(pedirMonitor());
        s3.setModeloTeclado("Dell Pro");
        s3.setModeloRaton("Dell MS116");


        //Portátil por defecto
        System.out.println("CREAR PORTÁTIL (POR DEFECTO)");
        Portatil p3 = new Portatil();
        p3.setMemoriaRam(12);
        p3.setCapacidadDisco(pedirDisco());
        p3.setProcesador(pedirProcesador());
        p3.setTarjetaGrafica("Intel Iris Xe");
        p3.setPrecio(pedirPrecio());
        p3.setMarca("Acer");
        p3.setTamPantalla(15.6);
        p3.setPeso(1.9);


        //Mostrar resultados
        System.out.println("OBJETOS CREADOS");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}