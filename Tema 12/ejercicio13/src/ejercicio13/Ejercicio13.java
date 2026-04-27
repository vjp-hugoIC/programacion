/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio13 {

    //Constante del fichero
    public final static String FICHERO = "DatosBeca.txt";

    //Metodo para pedir el nombre
    public static String pedirNombre() {

        Scanner entrada = new Scanner(System.in);
        String nombre;

        System.out.println("Introduce el nombre del becario: ");
        nombre = entrada.nextLine();

        return nombre;
    }

    //Metodo para pedir el apellidos
    public static String pedirApellidos() {

        Scanner entrada = new Scanner(System.in);
        String apellidos;

        System.out.println("Introduce los apellidos del becario: ");
        apellidos = entrada.nextLine();

        return apellidos;
    }

    //Metodo para pedir el sexo
    public static String pedirSexo() {

        Scanner entrada = new Scanner(System.in);
        String sexo;

        System.out.println("Introduce el sexo del becario: M/H ");
        sexo = entrada.nextLine();

        return sexo;
    }

    //Metodo para pedir la edad
    public static int pedirEdad() {

        Scanner entrada = new Scanner(System.in);
        int edad;

        System.out.println("Introduce la edad del becario: ");
        edad = entrada.nextInt();

        return edad;
    }

    //Metodo para pedir los suspensos
    public static int pedirSuspensos() {

        Scanner entrada = new Scanner(System.in);
        int suspensos;

        System.out.println("Introduce los suspensos del becario: ");
        suspensos = entrada.nextInt();

        return suspensos;
    }

    //Metodo para pedir la residencia familiar
    public static boolean pedirResidencia() {

        Scanner entrada = new Scanner(System.in);
        String residencia;
        boolean si = false;

        System.out.println("Introduce la residencia familiar del becario: (si/no)");
        residencia = entrada.nextLine();

        if (residencia.equalsIgnoreCase("si")) {

            si = true;
        }

        return si;
    }

    //Metodo para pedir el ingreso anual
    public static int pedirIngresoAnual() {

        Scanner entrada = new Scanner(System.in);
        int ingreso;

        System.out.println("Introduce los ingresos anuales del becario: ");
        ingreso = entrada.nextInt();

        return ingreso;
    }

    //Metodo para escribir los datos al fichero
    public static void escribirFichero(String fichero, Becario becario1) throws FileNotFoundException, IOException {

        System.out.println("Escribiendo fichero...");

        try (
                FileWriter fw = new FileWriter(fichero, true); 
                PrintWriter pw = new PrintWriter(fw);) {

            pw.print(becario1.getNombre() + "#" + becario1.getApellidos() + "#" + becario1.getSexo() + "#" + becario1.getEdad() + "#" + becario1.getSuspensos() + "#" + becario1.getrFamiliar() + "#" + becario1.getIngresoAnual());
        }
    }

    //Metodo para leer el fichero
    public static void leerFichero(String fichero) throws FileNotFoundException, IOException {

        System.out.println("Leyendo fichero...");

        try (
                FileReader fr = new FileReader(fichero); 
                BufferedReader br = new BufferedReader(fr);) {

            String linea = br.readLine();

            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        }
    }

    public static void procesarFichero(String fichero) throws IOException {

        FileReader fr = new FileReader(fichero);
        BufferedReader br = new BufferedReader(fr);

        String linea = br.readLine();

        while (linea != null) {

            String[] datos = linea.split("#");

            // Crear objeto Becario
            Becario b = new Becario(
                    datos[0],
                    datos[1],
                    datos[2],
                    Integer.parseInt(datos[3]),
                    Integer.parseInt(datos[4]),
                    Boolean.parseBoolean(datos[5]),
                    Integer.parseInt(datos[6])
            );

            int beca = b.calcularBeca();

            if (beca > 0) {
                System.out.println(b.getNombre() + " -> " + beca + "€");
            }

            linea = br.readLine();
        }

        br.close();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Creamos el objeto y le pedimos al usuario todos los datos
        Becario becario1 = new Becario(pedirNombre(), pedirApellidos(), pedirSexo(), pedirEdad(), pedirSuspensos(), pedirResidencia(), pedirIngresoAnual());

        //Llamamos a los metodos para escribir el fichero y leerlo
        try {

            escribirFichero(FICHERO, becario1);
            leerFichero(FICHERO);
            procesarFichero(FICHERO);

        } catch (InputMismatchException e) {
            System.out.println("ERROR: Has escrito un tipo de dato incorrecto.");
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("ERROR: Ha ocurrido un error en la escritura o lectura del fichero.");
        } catch (Exception e) {
            System.out.println("ERROR: Ha ocurrido un error desconocido.");
        }

        // TODO code application logic here
    }

}
