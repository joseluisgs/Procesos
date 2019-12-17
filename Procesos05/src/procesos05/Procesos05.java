/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author link
 */
public class Procesos05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Leyendo la salida de un proceso
            Process p=Runtime.getRuntime().exec ("ls -ls");
            // Pero no vemos la salida. Vamos a leer la salida
            InputStream in=p.getInputStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            String linea;
            while ((linea = br.readLine()) != null){
                System.out.println(linea);
            }
            br.close();
            // Esto no es obligatorio pero me gusta
            p.waitFor();
            System.out.println("valor de salida " + p.exitValue()); 
        } catch (IOException ex) {
            System.err.println("Error al ejecutar el proceso");
        } catch (InterruptedException ex) {
            System.err.println("Error en wait for");
        }
    }
    
}
