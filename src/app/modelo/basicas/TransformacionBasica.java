package app.modelo.basicas;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class TransformacionBasica {

    public BufferedImage grises(BufferedImage aux) {
        BufferedImage imagen = new BufferedImage(aux.getWidth(), aux.getHeight(), BufferedImage.TYPE_INT_RGB);
        int mediaPixel, colorSRGB;
        Color colorAux;
        for (int i = 0; i < imagen.getWidth(); i++) {
            for (int j = 0; j < imagen.getHeight(); j++) {
                colorAux = new Color(aux.getRGB(i, j));
                mediaPixel = (int) ((colorAux.getRed() + colorAux.getGreen() + colorAux.getBlue()) / 3);
                colorSRGB = (mediaPixel << 16) | (mediaPixel << 8) | mediaPixel;
                imagen.setRGB(i, j, colorSRGB);
            }
        }
        return imagen;
    }

    public BufferedImage binario(BufferedImage aux) {
        //canal rojo para binarizar
        BufferedImage imagen = new BufferedImage(aux.getWidth(), aux.getHeight(), BufferedImage.TYPE_INT_RGB);
        int mediaPixel, colorSRGB;
        Color colorAux;
        for (int i = 0; i < imagen.getWidth(); i++) {
            for (int j = 0; j < imagen.getHeight(); j++) {
                colorAux = new Color(aux.getRGB(i, j));
                mediaPixel = (int) colorAux.getRed();
                if (mediaPixel < 128) {
                    mediaPixel = 0;
                } else {
                    mediaPixel = 255;
                }
                colorSRGB = (mediaPixel << 16) | (mediaPixel << 8) | mediaPixel;
                imagen.setRGB(i, j, colorSRGB);
            }
        }
        return imagen;
    }

    public BufferedImage negativo(BufferedImage aux) {
        BufferedImage imagen = new BufferedImage(aux.getWidth(), aux.getHeight(), BufferedImage.TYPE_INT_RGB);
        int rojo, verde, azul;
        Color colorAux;
        for (int i = 0; i < imagen.getWidth(); i++) {
            for (int j = 0; j < imagen.getHeight(); j++) {
                colorAux = new Color(aux.getRGB(i, j));
                rojo = 255 - colorAux.getRed();
                verde = 255 - colorAux.getGreen();
                azul = 255 - colorAux.getBlue();
                Color color = new Color(rojo, verde, azul);
                imagen.setRGB(i, j, color.getRGB());
            }
        }
        return imagen;
    }

    public BufferedImage umbral(BufferedImage aux, int umbral) {
        BufferedImage imagen = new BufferedImage(aux.getWidth(), aux.getHeight(), BufferedImage.TYPE_INT_RGB);
        int mediaPixel;
        Color colorAux;
        for (int i = 0; i < imagen.getWidth(); i++) {
            for (int j = 0; j < imagen.getHeight(); j++) {
                colorAux = new Color(aux.getRGB(i, j));
                mediaPixel = ((colorAux.getRed() + colorAux.getGreen() + colorAux.getBlue()) / 3);
                if (mediaPixel < umbral) {
                    mediaPixel = 0;
                } else {
                    mediaPixel = 255;
                }
                Color color = new Color(mediaPixel, mediaPixel, mediaPixel);
                imagen.setRGB(i, j, color.getRGB());
            }
        }
        return imagen;
    }

    public BufferedImage masBrillo(BufferedImage original) {
        BufferedImage imagen = new BufferedImage(original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int y = 0; y < imagen.getHeight(); y++) {
            for (int x = 0; x < imagen.getWidth(); x++) {
                Color ca = new Color(original.getRGB(x, y));
                int rojo = ca.getRed() + 5;
                int verde = ca.getGreen() + 5;
                int azul = ca.getBlue() + 5;
                if (rojo >= 255) {
                    rojo = 255;
                }
                if (verde >= 255) {
                    verde = 255;
                }
                if (azul >= 255) {
                    azul = 255;
                }
                imagen.setRGB(x, y, new Color(rojo, verde, azul).getRGB());
            }
        }
        return imagen;
    }

    public BufferedImage menosBrillo(BufferedImage original) {
        BufferedImage imagen = new BufferedImage(original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int y = 0; y < imagen.getHeight(); y++) {
            for (int x = 0; x < imagen.getWidth(); x++) {
                Color ca = new Color(original.getRGB(x, y));
                int rojo = ca.getRed() - 5;
                int verde = ca.getGreen() - 5;
                int azul = ca.getBlue() - 5;
                if (rojo <= 0) {
                    rojo = 0;
                }
                if (verde <= 0) {
                    verde = 0;
                }
                if (azul <= 0) {
                    azul = 0;
                }
                imagen.setRGB(x, y, new Color(rojo, verde, azul).getRGB());
            }
        }
        return imagen;
    }

    public BufferedImage rorateArray(BufferedImage original) {
        BufferedImage imagen = new BufferedImage(original.getHeight(),original.getWidth(), BufferedImage.TYPE_INT_RGB);
        for (int y = 0; y < imagen.getHeight(); y++) {
            for (int x = 0; x < imagen.getWidth(); x++) {
                imagen.setRGB(x, y, original.getRGB(y, x));
            }
        }
        return imagen;
    }
}
