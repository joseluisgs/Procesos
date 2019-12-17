/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 *
 * @author link
 */
public class Procesos07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Enviado datos de un proceso a otro y recibiendo sus datos
        try {
            // Pasandoles datos a un proceso
            Process ls=Runtime.getRuntime().exec ("ls");
            InputStream in=ls.getInputStream();
            Process grep=Runtime.getRuntime().exec ("grep build");
            OutputStream out = grep.getOutputStream();
            int b;
            // La salida de ls se la pasamos al grep para que busque el patrón indicado
            while((b = in.read()) != -1)
                out.write(b); // Escribimos en el buuffer de intercambio de grep lo que salga de ls
            
            ls.waitFor();  // Esperamos
            in.close();
            out.close();
            
            in = grep.getInputStream(); // Leemos la salida de grep
            while((b = in.read()) != -1)
                System.out.write(b);
            grep.waitFor();
            in.close();
            
        } catch (IOException ex) {
            System.err.println("Error al ejecutar el proceso");
        } catch (InterruptedException ex) {
            System.err.println("Error en wait for");
        }
            
    }
    
}
