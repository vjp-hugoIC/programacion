/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2;

/**
 *
 * @author alumno
 */
public class Ciclistas {
    
    //Atributos de los Ciclistas 
    private String nombre;
    private int energia;
    private boolean estaEscapado;
    private double kmMeta;
    private int bidones;
    private double velocidad;
    private int hidratacion;
    
    //Atributo estatico
    public static int ciclistasCreados = 0;
    
    //Constructores por defecto
        public Ciclistas() {
            nombre = "";
            energia = 50;
            estaEscapado = false;
            kmMeta = 120.0;
            bidones = 2;
            velocidad = 0.0;
            hidratacion = 50;
            ciclistasCreados++;
        }
    
    //Constructores pasadole parametros
        public Ciclistas(String nombre, int energia, boolean estaEscapado, double kmMeta, int bidones, double velocidad, int hidratacion) {
            this.nombre = nombre;
            this.energia = energia;
            this.estaEscapado = estaEscapado;
            this.kmMeta = kmMeta;
            this.bidones = bidones;
            this.velocidad = velocidad;
            this.hidratacion = hidratacion;
            ciclistasCreados++;
        }
    
    //Getters y Setters
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEnergia() {
            return energia;
        }
        public void setEnergia(int energia) {
            this.energia = energia;
        }

        public boolean getEstaEscapado() {
            return estaEscapado;
        }
        public void setEstaEscapado(boolean estaEscapado) {
            this.estaEscapado = estaEscapado;
        }

        public double getKmMeta() {
            return kmMeta;
        }
        public void setKmMeta(double kmMeta) {
            this.kmMeta = kmMeta;
        }

        public int getBidones() {
            return bidones;
        }
        public void setBidones(int bidones) {
            this.bidones = bidones;
        }

        public double getVelocidad() {
            return velocidad;
        }
        public void setVelocidad(double velocidad) {
            this.velocidad = velocidad;
        }

        public int getHidratacion() {
            return hidratacion;
        }
        public void setHidratacion(int hidratacion) {
            this.hidratacion = hidratacion;
        }
    
    //Metodo ToString
         @Override
         public String toString() {
            return ""; 
        }
    
    //Otros metodos
        private static void aumentarContador() {
            ciclistasCreados++;
        }
        public static void mostrarContador() {
            System.out.println("Número de ciclistas creados: " + ciclistasCreados);
        }
        
}
