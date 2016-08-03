
package app.modelo.ruido;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Ruido {
    
    public BufferedImage aditivo(BufferedImage aux, int porcentaje){
        BufferedImage imagen = new BufferedImage(aux.getWidth(), aux.getHeight(), BufferedImage.TYPE_INT_RGB);
        Random r = new Random();
        for( int i = 0; i < imagen.getWidth(); i++ ){
            for( int j = 0; j < imagen.getHeight(); j++ ){
                imagen.setRGB(i, j, aux.getRGB(i, j));
                int sal = Math.abs(r.nextInt())%100;
                if(sal<(porcentaje/10)){
                    Color c = new Color(255, 255, 255);
                    imagen.setRGB(i, j, c.getRGB());
                }
            }
        }
        return imagen;
    }
    
    public BufferedImage sustractivo(BufferedImage aux, int porcentaje){
        BufferedImage imagen = new BufferedImage(aux.getWidth(), aux.getHeight(), BufferedImage.TYPE_INT_RGB);
        Random r = new Random();
        for( int i = 0; i < imagen.getWidth(); i++ ){
            for( int j = 0; j < imagen.getHeight(); j++ ){
                imagen.setRGB(i, j, aux.getRGB(i, j));
                int pimienta = Math.abs(r.nextInt())%100;
                if(pimienta<(porcentaje/10)){
                    Color c = new Color(0, 0, 0);
                    imagen.setRGB(i, j, c.getRGB());
                }
            }
        }
        return imagen;
    }
    
}
