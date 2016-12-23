
package com.mx.app.adi.model.pojos;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class Imagen{

    private int idImagen;
    private String nombre;
    private String direccion;
    private BufferedImage bfImagen;

    public Imagen(int idImagen, String nombre, String direccion, BufferedImage bfImagen) {
        this.idImagen = idImagen;
        this.nombre = nombre;
        this.direccion = direccion;
        this.bfImagen = bfImagen;
    }

    public Imagen(BufferedImage bfImagen) {
        this.bfImagen = bfImagen;
    }

    public Imagen(int idImagen, String nombre, BufferedImage bfImagen) {
        this.idImagen = idImagen;
        this.nombre = nombre;
        this.bfImagen = bfImagen;
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

    public BufferedImage getBfImagen() {
        return bfImagen;
    }

    public void setBfImagen(BufferedImage bfImagen) {
        this.bfImagen = bfImagen;
    }

    @Override
    public String toString() {
        String imagenMatriz = new String();
        for (int i = 0; i < bfImagen.getHeight(); i++) {
            for (int j = 0; j < bfImagen.getWidth(); j++) {
                Color color = new Color(bfImagen.getRGB(j, i));
                imagenMatriz += "[R: " + color.getRed() + ", G: " + color.getGreen() + ", B: " + color.getBlue() + "] ";
            }
            imagenMatriz += "\n";
        }
        return imagenMatriz;
    }
    
}
