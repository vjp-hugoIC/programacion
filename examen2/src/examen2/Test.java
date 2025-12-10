/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

           // Escalador
        CiclistaEscalador escalador = new CiclistaEscalador(
                90.0,      // potencia
                45.0,      // fuerza
                "Juan",    // nombre
                80,        // energia
                false,     // estaEscapado
                0.5,       // kmMeta
                2,         // bidones
                0.0,       // velocidad
                60         // hidratacion
        );

        System.out.println(escalador);
    
    
    // Crear un CiclistaSprinter
        CiclistaSprinter sprinter = new CiclistaSprinter(
                100.0,     // aceleracion
                "Ana",     // nombre
                70,        // energia
                false,     // estaEscapado
                5.0,       // kmMeta
                2,         // bidones
                0.0,       // velocidad
                50         // hidratacion
        );

        // Mostrar información inicial
        System.out.println(escalador);
        System.out.println(sprinter);

        // Llamar a métodos de escalador
        //escalador.comer();
        //escalador.beber();
       // escalador.sprintar();
        //escalador.atacar();
        //escalador.recuperar(5);
                                                                                                      //los comento porque sino al ejecutarlo me da error
        // Llamar a métodos de sprinter
       // sprinter.comer();
        //sprinter.beber();
        //sprinter.sprintar();
        //sprinter.atacar();
        //sprinter.recuperar(5);
        
        Ciclistas.mostrarContador(); // Llamada al método estático para contear los ciclistas        
        
         // TODO code application logic here
    }
    
}
      


    

        
       
    
