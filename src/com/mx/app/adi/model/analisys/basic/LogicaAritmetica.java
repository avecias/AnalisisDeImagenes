
package com.mx.app.adi.model.analisys.basic;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class LogicaAritmetica {
    
    //Operacion de and
    public BufferedImage and(BufferedImage a, BufferedImage b){
        BufferedImage imagen = new BufferedImage(a.getWidth(), a.getHeight(), BufferedImage.TYPE_INT_RGB);
        for( int y = 0; y < imagen.getHeight(); y++ ){
            for( int x = 0; x < imagen.getWidth(); x++ ){
                imagen.setRGB(x, y,(a.getRGB(x, y) & b.getRGB(x, y)));
            }
        }
        return imagen;
    }
    
    //Operacion de or
    public BufferedImage or(BufferedImage a, BufferedImage b){
        BufferedImage imagen = new BufferedImage(a.getWidth(), a.getHeight(), BufferedImage.TYPE_INT_RGB);
        for( int y = 0; y < imagen.getHeight(); y++ ){
            for( int x = 0; x < imagen.getWidth(); x++ ){
                imagen.setRGB(x, y,(a.getRGB(x, y) | b.getRGB(x, y)));
            }
        }
        return imagen;
    }
    
    //Operacion de xor
    public BufferedImage xor(BufferedImage a, BufferedImage b){
        BufferedImage imagen = new BufferedImage(a.getWidth(), a.getHeight(), BufferedImage.TYPE_INT_RGB);
        for( int y = 0; y < imagen.getHeight(); y++ ){
            for( int x = 0; x < imagen.getWidth(); x++ ){
                imagen.setRGB(x, y,(a.getRGB(x, y) ^ b.getRGB(x, y)));
            }
        }
        return imagen;
    }
    
    //Operacion de not
    public BufferedImage not(BufferedImage a){
        BufferedImage imagen = new BufferedImage(a.getWidth(), a.getHeight(), BufferedImage.TYPE_INT_RGB);
        for( int y = 0; y < imagen.getHeight(); y++ ){
            for( int x = 0; x < imagen.getWidth(); x++ ){
                imagen.setRGB(x, y,~a.getRGB(x, y));
            }
        }
        return imagen;
    }
    
    //Operacion de suma
    public BufferedImage suma(BufferedImage a, BufferedImage b){
        BufferedImage imagen = new BufferedImage(a.getWidth(), a.getHeight(), BufferedImage.TYPE_INT_RGB);
        for( int y = 0; y < imagen.getHeight(); y++ ){
            for( int x = 0; x < imagen.getWidth(); x++ ){
                Color ca = new Color(a.getRGB(x, y));
                Color cb = new Color(b.getRGB(x, y));
                int rojo = ca.getRed() + cb.getRed();
                int verde = ca.getGreen()+ cb.getGreen();
                int azul = ca.getBlue()+ cb.getBlue();
                if(rojo >= 255)
                    rojo = 255;
                if(verde >= 255)
                    verde = 255;
                if(azul >= 255)
                    azul = 255;
                imagen.setRGB(x, y,new Color(rojo, verde,azul).getRGB());
            }
        }
        return imagen;
    }
    
    //Operacion de resta
    public BufferedImage resta(BufferedImage a, BufferedImage b){
        BufferedImage imagen = new BufferedImage(a.getWidth(), a.getHeight(), BufferedImage.TYPE_INT_RGB);
        for( int y = 0; y < imagen.getHeight(); y++ ){
            for( int x = 0; x < imagen.getWidth(); x++ ){
                Color ca = new Color(a.getRGB(x, y));
                Color cb = new Color(b.getRGB(x, y));
                int rojo = ca.getRed() - cb.getRed();
                int verde = ca.getGreen() - cb.getGreen();
                int azul = ca.getBlue() - cb.getBlue();
                if(rojo <= 0)
                    rojo = 0;
                if(verde <= 0)
                    verde = 0;
                if(azul <= 0)
                    azul = 0;
                imagen.setRGB(x, y,new Color(rojo, verde,azul).getRGB());
            }
        }
        return imagen;
    }
}
