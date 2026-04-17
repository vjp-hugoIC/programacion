/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg6;

/**
 *
 * @author alumno
 */
public class Libro implements Transformable{
    
    //Atributos
    private String titulo;
    private String autor;
    private String genero;
    
    //Constructores
    //Por defecto
    public Libro() {
    
        titulo = "";
        autor = "";
        genero = "";
    }
    
    //Parametrizado
    public Libro(String titulo, String autor, String genero) {
    
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }
    
    //Getters y setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + '}';
    }
    
    //Otros metodos
    @Override
    public String concatenarTodo() {
         return titulo + "#" + autor + "#" + genero;
    }

    @Override
    public String obtenerIniciales() {
        return "" + titulo.charAt(0)
                 + autor.charAt(0)
                 + genero.charAt(0);
    }

    @Override
    public void contarVocales() {
        String texto = titulo + autor + genero;
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        System.out.println("Vocales en Libro: " + contador);
    }

    @Override
    public String obtenerCadenaMasLarga() {
        String mayor = titulo;

        if (autor.length() > mayor.length()) {
            mayor = autor;
        }
        if (genero.length() > mayor.length()) {
            mayor = genero;
        }

        return mayor;
    }

    @Override
    public String buscarCadena(String cadena) {
        return titulo.equals(cadena) ||
               autor.equals(cadena) ||
               genero.equals(cadena);
    }
    
    
    
}
