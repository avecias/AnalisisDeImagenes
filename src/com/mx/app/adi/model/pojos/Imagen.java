
package com.mx.app.adi.model.pojos;

import com.mx.app.adi.model.components.WindowInternal;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class Imagen{

    private int idImagen;
    private String nombre;
    private String direccion;
    private BufferedImage bufferedImage;
    private WindowInternal windowInternal;

    public Imagen() {
    }

    public Imagen(int idImagen, String nombre, String direccion, BufferedImage bufferedImage, WindowInternal windowInternal) {
        this.idImagen = idImagen;
        this.nombre = nombre;
        this.direccion = direccion;
        this.bufferedImage = bufferedImage;
        this.windowInternal = windowInternal;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }

    public void setBufferedImage(BufferedImage bufferedImage) {
        this.bufferedImage = bufferedImage;
    }

    public WindowInternal getWindowInternal() {
        return windowInternal;
    }

    public void setWindowInternal(WindowInternal windowInternal) {
        this.windowInternal = windowInternal;
    }
    
    
    
    @Override
    public String toString() {
        String imagenMatriz = new String();
        for (int i = 0; i < bufferedImage.getHeight(); i++) {
            for (int j = 0; j < bufferedImage.getWidth(); j++) {
                Color color = new Color(bufferedImage.getRGB(j, i));
                imagenMatriz += "[R: " + color.getRed() + ", G: " + color.getGreen() + ", B: " + color.getBlue() + "] ";
            }
            imagenMatriz += "\n";
        }
        return imagenMatriz;
    }
    
}
