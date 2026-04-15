/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioi1;

/**
 *
 * @author VSPC-210660
 */
public class EjercicioI1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo un objeto de cada
        Ornitorrinco ornitorrinco1 = new Ornitorrinco("ornitorrinco1", "Macho", "negro", 3, 2);
        Murcielago murcielago1 = new Murcielago("murcielago1", "Hembra", "negro", 5, 5);
        
        //Pruebo los metodos
        System.out.println(ornitorrinco1.obtenerMensajeOviparo());
        ornitorrinco1.ponerHuevo();
        ornitorrinco1.incubarHuevo();
        ornitorrinco1.mostrarNumHuevos();
        
        System.out.println(murcielago1.obtenerMensajeVolador());
        murcielago1.aumentarAlturaVuelo();
        murcielago1.bajarAlturaVuelo();
        murcielago1.mostrarAlturaVuelo();
        
        //Lo mismo con polimorfismo
        oviparo ornitorrinco2 = new Ornitorrinco("ornitorrinco2", "Macho", "marron", 5, 4);
        Volador murcielago2 = new Murcielago("murcielago1", "Hembra", "negro", 5, 10);
        
        //Pruebo los metodos
        System.out.println(ornitorrinco2.obtenerMensajeOviparo());
        ornitorrinco2.ponerHuevo();
        ornitorrinco2.incubarHuevo();
        ornitorrinco2.mostrarNumHuevos();
        
        System.out.println(murcielago2.obtenerMensajeVolador());
        murcielago2.aumentarAlturaVuelo();
        murcielago2.bajarAlturaVuelo();
        murcielago2.mostrarAlturaVuelo();
        
        
        
        // TODO code application logic here
    }
    
}
