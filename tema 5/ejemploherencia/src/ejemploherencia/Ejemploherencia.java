/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploherencia;

/**
 *
 * @author alumno
 */
public class Ejemploherencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos el objeto PERSONAJE
        personaje personaje = new personaje();
        System.out.println(personaje);
        
        //Creamos el objeto JUGADOR
        jugador jugador = new jugador(50, "Palo");
        System.out.println(jugador);
              
        //Creamos el objeto ENEMIGO
        enemigo enemigo = new enemigo(30, "Espada");
        System.out.println(enemigo);
        
        //Llamo a otros metodos
        personaje.atacar();
        jugador.atacar();
        enemigo.atacar();
        
        jugador.recoger("moneda");
        //personaje.recoger("moneda");      //Personaje NO tiene el metodo
        //enemigo.recoger("moneda");        //Enemigo NO tiene el metodo
        
        enemigo.crearSoldados();
        
        System.out.println(jugador.getInventario());
        System.out.println(jugador.getVida());
        
        System.out.println(personaje.getVida());
        
        System.out.println(enemigo.getVida());
        jugador.atacar();
        
        
        
        // TODO code application logic here
    }
    
}
