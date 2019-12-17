/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos01;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author link
 */
public class Procesos01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Vamos a lanzar un proceso
        try { 
            //directorio/ejecutable es el path del ejecutable y un nombre // 
            //Process p = Runtime.getRuntime().exec ("directorio/ejecutable");
            //Process p = Runtime.getRuntime().exec ("cmd /c dir");
            // La primera con el comando open
            Process p1 = Runtime.getRuntime().exec ("ls -ls");
            // Vamos a dejarlo abierto 5 segundos y me lo cargo

        } 
        catch (IOException ex) { 
            System.err.println("Error al lanzar proceso");
        }   
    }
    
}
