package app.modelo.filtros;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class PasaBajas {

    //Promedio

    public static BufferedImage promedio(BufferedImage original) {
        BufferedImage imagen = new BufferedImage(original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int y = 1; y < original.getHeight() - 1; y++) {
            for (int x = 1; x < original.getWidth() - 1; x++) {
                int promedioRed = promedioRojo(x, y, original,1);
                int promedioGreen = promedioVerde(x, y, original,1);
                int promedioBlue = promedioAzul(x, y, original,1);
                imagen.setRGB(x, y, new Color(promedioRed, promedioGreen, promedioBlue).getRGB());
            }
        }
        return imagen;
    }
    
    //Promedio Pesado

    public static BufferedImage promedioPesado(BufferedImage original) {
        BufferedImage imagen = new BufferedImage(original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int y = 1; y < original.getHeight() - 1; y++) {
            for (int x = 1; x < original.getWidth() - 1; x++) {
                int promedioRed = promedioRojo(x, y, original,2);
                int promedioGreen = promedioVerde(x, y, original,2);
                int promedioBlue = promedioAzul(x, y, original,2);
                if(promedioRed > 255)
                    promedioRed = 255;
                if(promedioGreen > 255)
                    promedioGreen = 255;
                if(promedioBlue > 255)
                    promedioBlue = 255;
                imagen.setRGB(x, y, new Color(promedioRed, promedioGreen, promedioBlue).getRGB());
            }
        }
        return imagen;
    }

    private static int promedioRojo(int x, int y, BufferedImage original, int k) {
        int promedio = 0;
        int z1 = (original.getRGB(x - 1, y - 1) & 0x00ff0000)>>16;
        int z2 = (original.getRGB(x, y - 1) & 0x00ff0000)>>16;
        int z3 = (original.getRGB(x + 1, y - 1) & 0x00ff0000)>>16;
        int z4 = (original.getRGB(x - 1, y) & 0x00ff0000)>>16;
        int z5 = (original.getRGB(x, y) & 0x00ff0000)>>16;
        int z6 = (original.getRGB(x + 1, y) & 0x00ff0000)>>16;
        int z7 = (original.getRGB(x - 1, y + 1) & 0x00ff0000)>>16;
        int z8 = (original.getRGB(x, y + 1) & 0x00ff0000)>>16;
        int z9 = (original.getRGB(x + 1, y + 1) & 0x00ff0000)>>16;
        promedio = (int)(z1 + z2 + z3 + z4 + k*z5 + z6 + z7 + z8 + z9) / 9;
        //System.out.println("promedio rojo : " + promedio);
        return promedio;
    }

    private static int promedioVerde(int x, int y, BufferedImage original, int k) {
        int promedio = 0;
        int z1 = (original.getRGB(x - 1, y - 1) & 0x0000ff00)>>8;
        int z2 = (original.getRGB(x, y - 1) & 0x0000ff00)>>8;
        int z3 = (original.getRGB(x + 1, y - 1) & 0x0000ff00)>>8;
        int z4 = (original.getRGB(x - 1, y) & 0x0000ff00)>>8;
        int z5 = (original.getRGB(x, y) & 0x0000ff00)>>8;
        int z6 = (original.getRGB(x + 1, y) & 0x0000ff00)>>8;
        int z7 = (original.getRGB(x - 1, y + 1) & 0x0000ff00)>>8;
        int z8 = (original.getRGB(x, y + 1) & 0x0000ff00)>>8;
        int z9 = (original.getRGB(x + 1, y + 1) & 0x0000ff00)>>8;
        promedio = (int)(z1 + z2 + z3 + z4 + k*z5 + z6 + z7 + z8 + z9) / 9;
        //System.out.println("promedio verde : " + promedio);
        return promedio;
    }

    private static int promedioAzul(int x, int y, BufferedImage original, int k) {
        int promedio = 0;
        int z1 = original.getRGB(x - 1, y - 1) & 255;
        int z2 = original.getRGB(x, y - 1) & 255;
        int z3 = original.getRGB(x + 1, y - 1) & 255;
        int z4 = original.getRGB(x - 1, y) & 255;
        int z5 = original.getRGB(x, y) & 255;
        int z6 = original.getRGB(x + 1, y) & 255;
        int z7 = original.getRGB(x - 1, y + 1) & 255;
        int z8 = original.getRGB(x, y + 1) & 255;
        int z9 = original.getRGB(x + 1, y + 1) & 255;
        promedio = (int)(z1 + z2 + z3 + z4 + k*z5 + z6 + z7 + z8 + z9) / 9;
        //System.out.println("promedio azul : " + promedio);
        return promedio;
    }
}
