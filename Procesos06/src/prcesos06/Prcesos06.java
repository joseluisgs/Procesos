/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prcesos06;

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
public class Prcesos06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Pasandoles datos a un proceso
            Process p=Runtime.getRuntime().exec ("grep java");
            OutputStream out = p.getOutputStream();
            PrintWriter pw =new PrintWriter(new OutputStreamWriter(out));
            pw.println("Me gusta PSP y java");
            pw.println("Soy un crack de java");
            pw.println("No se me escapa ni una"); 
            pw.println("Pedazo de clase de java");
            pw.println("java y los prcesos me quieren");
            pw.close();
            
            // Ya le hemos pasado la información, ahora leemos su salida
            // Pero no vemos la salida. Vamos a leer la salida
            InputStream in=p.getInputStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            String linea;
            while ((linea = br.readLine()) != null)
                System.out.println(linea);
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
