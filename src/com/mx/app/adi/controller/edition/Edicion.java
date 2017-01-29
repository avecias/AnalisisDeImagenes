package com.mx.app.adi.controller.edition;

import com.mx.app.adi.model.components.Deslizador;
import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;
import com.mx.app.adi.model.analisys.noise.Ruido;
import com.mx.app.adi.model.analisys.basic.LogicaAritmetica;
import com.mx.app.adi.model.analisys.basic.TransformacionBasica;
import com.mx.app.adi.model.pojos.Imagen;

public class Edicion {
    
    public static final int INTERVALO_50 = 50;
    public static final int INTERVALO_10 = 10;
    public static final int MAX_255 = 255;
    public static final int MAX_100 = 100;
    private TransformacionBasica transformacionBasica;
    private Ruido ruido;
    private LogicaAritmetica logicaAritmetica;

    public Edicion() {
        transformacionBasica = new TransformacionBasica();
        ruido = new Ruido();
        logicaAritmetica = new LogicaAritmetica();
    }
    
    public BufferedImage grises(Imagen i) {
        return transformacionBasica.grises(i.getBufferedImage());
    }

    public BufferedImage rotacionImagen(Imagen i) {
        return transformacionBasica.rorateArray(i.getBufferedImage());
    }

    public BufferedImage binario(Imagen i) {
        return transformacionBasica.binario(i.getBufferedImage());
    }

    public BufferedImage negativo(Imagen i) {
        return transformacionBasica.negativo(i.getBufferedImage());
    }

    public BufferedImage umbral(Imagen i) {
        return transformacionBasica.umbral(i.getBufferedImage(), Deslizador.obtener("Seleccione el valor del umbral", "Umbral ", INTERVALO_50, MAX_255));
    }
    public BufferedImage rotar(Imagen i) {
        return transformacionBasica.rorateArray(i.getBufferedImage());
    }

    public BufferedImage aditivo(Imagen i) {
        return ruido.aditivo(i.getBufferedImage(), Deslizador.obtener("Seleccione el porcentaje", "Porcentaje %", INTERVALO_10, MAX_100));
    }

    public BufferedImage sustractivo(Imagen i) {
        return ruido.sustractivo(i.getBufferedImage(), Deslizador.obtener("Seleccione el porcentaje", "Porcentaje %", INTERVALO_10, MAX_100));
    }

    public BufferedImage mixto(Imagen i) {
        int porcentaje = Deslizador.obtener("Seleccione el porcentaje", "Porcentaje %", INTERVALO_10, MAX_100)/2;
        return ruido.aditivo(ruido.sustractivo(i.getBufferedImage(), porcentaje), porcentaje);
    }
    
    public BufferedImage and(Imagen a,Imagen b) {
        if( a.getBufferedImage().getWidth() == b.getBufferedImage().getWidth() && a.getBufferedImage().getHeight() == b.getBufferedImage().getHeight()){
                return logicaAritmetica.and(a.getBufferedImage(), b.getBufferedImage());
        }
        JOptionPane.showMessageDialog(null, "No son de las mismas dimensiones", "Error en las imagenes", JOptionPane.ERROR_MESSAGE);
        return a.getBufferedImage();
    }
    
    public BufferedImage or(Imagen a,Imagen b) {
        if( a.getBufferedImage().getWidth() == b.getBufferedImage().getWidth() && a.getBufferedImage().getHeight() == b.getBufferedImage().getHeight()){
                return logicaAritmetica.or(a.getBufferedImage(), b.getBufferedImage());
        }
        JOptionPane.showMessageDialog(null, "No son de las mismas dimensiones", "Error en las imagenes", JOptionPane.ERROR_MESSAGE);
        return a.getBufferedImage();
    }
    public BufferedImage xor(Imagen a,Imagen b) {
        if( a.getBufferedImage().getWidth() == b.getBufferedImage().getWidth() && a.getBufferedImage().getHeight() == b.getBufferedImage().getHeight()){
                return logicaAritmetica.xor(a.getBufferedImage(), b.getBufferedImage());
        }
        JOptionPane.showMessageDialog(null, "No son de las mismas dimensiones", "Error en las imagenes", JOptionPane.ERROR_MESSAGE);
        return a.getBufferedImage();
    }
    
    public BufferedImage not(Imagen a) {
        return logicaAritmetica.not(a.getBufferedImage());
    }
    
    public BufferedImage suma(Imagen a,Imagen b) {
        if( a.getBufferedImage().getWidth() == b.getBufferedImage().getWidth() && a.getBufferedImage().getHeight() == b.getBufferedImage().getHeight()){
                return logicaAritmetica.suma(a.getBufferedImage(), b.getBufferedImage());
        }
        JOptionPane.showMessageDialog(null, "No son de las mismas dimensiones", "Error en las imagenes", JOptionPane.ERROR_MESSAGE);
        return a.getBufferedImage();
    }
    
    public BufferedImage resta(Imagen a,Imagen b) {
        if( a.getBufferedImage().getWidth() == b.getBufferedImage().getWidth() && a.getBufferedImage().getHeight() == b.getBufferedImage().getHeight()){
                return logicaAritmetica.resta(a.getBufferedImage(), b.getBufferedImage());
        }
        JOptionPane.showMessageDialog(null, "No son de las mismas dimensiones", "Error en las imagenes", JOptionPane.ERROR_MESSAGE);
        return a.getBufferedImage();
    }
    
    public BufferedImage masBrillo(Imagen i) {
        return transformacionBasica.masBrillo(i.getBufferedImage());
    }
    
    public BufferedImage menosBrillo(Imagen i) {
        return transformacionBasica.menosBrillo(i.getBufferedImage());
    }
    
}
