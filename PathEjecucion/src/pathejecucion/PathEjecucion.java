/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathejecucion;

import java.io.File;

/**
 *
 * @author link
 */
public class PathEjecucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Path Actual, directorio de la BD
        String path = System.getProperty("user.dir");
        // usamos path separator para mejorar la detección del path del sistema
        String pathDir = path+File.separator+"build"+File.separator;
        System.out.println(pathDir);
    }
    


    
}
