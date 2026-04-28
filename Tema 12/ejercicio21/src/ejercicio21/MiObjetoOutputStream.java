/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio21;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author alumno
 */
public class MiObjetoOutputStream extends ObjectOutputStream {
    
    public MiObjetoOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    public MiObjetoOutputStream() throws IOException, SecurityException {
        super();
    }

    // ctrl + I -> Override Method -> writeStreamHeader()
    @Override
    protected void writeStreamHeader() throws IOException {
        // No hace nada
    }
    
}
