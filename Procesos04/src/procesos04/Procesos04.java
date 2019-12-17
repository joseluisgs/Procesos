/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos04;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author link
 */
public class Procesos04 {

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
            Process p1 = Runtime.getRuntime().exec ("ls");
            // Ahora dejamos el programa bloqueado (este de java) hasta que se cierre el otro
            p1.waitFor();
            System.out.println("valor de salida " + p1.exitValue()); 
        }catch (IOException ex) { 
            System.err.println("Error al lanzar proceso");
        } catch (InterruptedException ex) {
            System.err.println("Error n waitFor");
        } 
    }
    
}
