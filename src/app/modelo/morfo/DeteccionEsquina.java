package app.modelo.morfo;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class DeteccionEsquina {

    public static BufferedImage primera(BufferedImage original) {
        //primera deteccion de esquina
        BufferedImage imagen = new BufferedImage(original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int y = 1; y < imagen.getHeight() -1; y++) {
            for (int x = 1; x < imagen.getWidth() -1; x++) {
                int z2 = original.getRGB(x, y - 1) & 255;
                int z4 = original.getRGB(x - 1, y) & 255;
                int z5 = original.getRGB(x, y) & 255;
                int z6 = original.getRGB(x + 1, y) & 255;
                int z7 = original.getRGB(x - 1, y + 1) & 255;
                int z8 = original.getRGB(x, y + 1) & 255;
                if (z2 == 255 && z4 == 0 && z5 == 255 && z6 == 255 && z7 == 0 && z8 == 0) {
                    imagen.setRGB(x, y - 1, Color.white.getRGB());
                    imagen.setRGB(x - 1, y, 0);
                    imagen.setRGB(x, y, Color.white.getRGB());
                    imagen.setRGB(x + 1, y, Color.white.getRGB());
                    imagen.setRGB(x - 1, y + 1, 0);
                    imagen.setRGB(x, y + 1, 0);
                }
            }
        }
        return imagen;
    }

    public static BufferedImage segunda(BufferedImage original) {
        //segunda deteccion de esquina
        BufferedImage imagen = new BufferedImage(original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int y = 1; y < imagen.getHeight() -1; y++) {
            for (int x = 1; x < imagen.getWidth() -1; x++) {
                int z2 = original.getRGB(x, y - 1) & 255;
                int z4 = original.getRGB(x - 1, y) & 255;
                int z5 = original.getRGB(x, y) & 255;
                int z6 = original.getRGB(x + 1, y) & 255;
                int z8 = original.getRGB(x, y + 1) & 255;
                int z9 = original.getRGB(x + 1, y + 1) & 255;
                if (z2 == 255 && z4 == 255 && z5 == 255 && z6 == 0 && z8 == 0 && z9 == 0) {
                    imagen.setRGB(x, y - 1, Color.white.getRGB());
                    imagen.setRGB(x - 1, y, Color.white.getRGB());
                    imagen.setRGB(x, y, Color.white.getRGB());
                    imagen.setRGB(x + 1, y, 0);
                    imagen.setRGB(x, y + 1, 0);
                    imagen.setRGB(x + 1, y + 1, 0);
                }
            }
        }
        return imagen;
    }

    public static BufferedImage cuarta(BufferedImage original) {
        //tercera deteccion de esquina
        BufferedImage imagen = new BufferedImage(original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int y = 1; y < imagen.getHeight() -1; y++) {
            for (int x = 1; x < imagen.getWidth() -1; x++) {
                int z2 = original.getRGB(x, y - 1) & 255;
                int z3 = original.getRGB(x+1, y-1)&255;
                int z4 = original.getRGB(x - 1, y) & 255;
                int z5 = original.getRGB(x, y) & 255;
                int z6 = original.getRGB(x + 1, y) & 255;
                int z8 = original.getRGB(x, y + 1) & 255;
                if (z2 == 0 && z3 == 0 && z4 == 255 && z5 == 255 && z6 == 0 && z8 == 255) {
                    imagen.setRGB(x, y - 1, 0);
                    imagen.setRGB(x+1, y-1, 0);
                    imagen.setRGB(x - 1, y , Color.white.getRGB());
                    imagen.setRGB(x, y, Color.white.getRGB());
                    imagen.setRGB(x + 1, y, 0);
                    imagen.setRGB(x - 1, y + 1, Color.white.getRGB());
                }
            }
        }
        return imagen;
    }

    public static BufferedImage tercera(BufferedImage original) {
        //cuarta deteccion de esquina
        BufferedImage imagen = new BufferedImage(original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int y = 1; y < imagen.getHeight() -1; y++) {
            for (int x = 1; x < imagen.getWidth() -1; x++) {
                int z1 = original.getRGB(x-1, y-1)&255;
                int z2 = original.getRGB(x, y - 1) & 255;
                int z4 = original.getRGB(x - 1, y) & 255;
                int z5 = original.getRGB(x, y) & 255;
                int z6 = original.getRGB(x + 1, y) & 255;
                int z8 = original.getRGB(x, y + 1) & 255;
                if (z1 == 0 && z2 == 0 && z4 == 0 && z5 == 255 && z6 == 255 && z8 == 255) {
                    imagen.setRGB(x - 1, y - 1, 0);
                    imagen.setRGB(x, y - 1, 0);
                    imagen.setRGB(x - 1, y, 0);
                    imagen.setRGB(x, y, Color.white.getRGB());
                    imagen.setRGB(x + 1, y, Color.white.getRGB());
                    imagen.setRGB(x, y + 1, Color.white.getRGB());
                }
            }
        }
        return imagen;
    }
}
