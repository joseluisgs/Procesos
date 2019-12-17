/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos02;

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
public class Procesos02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            // Otra forma de llamar a procesos es usando Desktop,
            // lanza la aplicacion predeterminada en el sistema
            Desktop d = null;
            d = Desktop.getDesktop();
            d.browse(new URI("http://www.google.es"));
        } catch (URISyntaxException ex) {
            System.err.println("Error la lanzar URI");
        } catch (IOException ex) {
            System.err.println("Error la lanzar Proceso Desktop");
        }
    }
    
}
