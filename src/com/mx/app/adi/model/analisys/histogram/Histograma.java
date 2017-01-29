package com.mx.app.adi.model.analisys.histogram;

//import app.modelo.entidad.Imagen;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class Histograma {

    public static int[][] calcular(BufferedImage imagen) {
        int[][] histograma = new int[3][256];
        Color colorAux;
        for (int i = 0; i < imagen.getWidth(); i++) {
            for (int j = 0; j < imagen.getHeight(); j++) {
                colorAux = new Color(imagen.getRGB(i, j));
                histograma[0][colorAux.getRed()]++;
                histograma[1][colorAux.getGreen()]++;
                histograma[2][colorAux.getBlue()]++;
            }
        }
        return histograma;
    }

//    public static void main(String[] args) {
//        BufferedImage i = new BufferedImage(10, 5, BufferedImage.TYPE_INT_RGB);
//        int[] v = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        for (int y = 0; y < i.getHeight(); y++) {
//            for (int x = 0; x < i.getWidth(); x++) {
//                int valor = (v[x] << 16) | (v[x] << 8) | v[x];
//                i.setRGB(x, y, valor);
//            }
//        }
//        int[][] calcular = Histograma.calcular(i);
//        for (int j = 0; j < 256; j++) {
//            System.out.println("Valor rojo " + j + ", cantidad =  " + calcular[0][j]);
//            System.out.println("Valor verde " + j + ", cantidad =  " + calcular[0][j]);
//            System.out.println("Valor azul " + j + ", cantidad =  " + calcular[0][j]);
//        }
//        Imagen imagen = new Imagen(i);
//        System.out.println(imagen.toString());
//    }
}
