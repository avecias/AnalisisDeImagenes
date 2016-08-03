package app.modelo.filtros;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class PasaAltas {

    //metodo de detencion de bordes por sobel
    public static BufferedImage sobel(BufferedImage original, int T) {
        BufferedImage imagen = new BufferedImage(original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int y = 1; y < original.getHeight()-1; y++) {
            for (int x = 1; x < original.getWidth()-1; x++) {
                int z1 = original.getRGB(x-1, y-1)&255;
                int z2 = original.getRGB(x, y-1)&255;
                int z3 = original.getRGB(x+1, y-1)&255;
                int z4 = original.getRGB(x-1, y)&255;
                int z5 = original.getRGB(x, y)&255;
                int z6 = original.getRGB(x+1, y)&255;
                int z7 = original.getRGB(x-1, y+1)&255;
                int z8 = original.getRGB(x, y+1)&255;
                int z9 = original.getRGB(x+1, y+1)&255;
                int gx = z3 + 2*z6 + z9 - z1 - 2*z4 - z7; 
                int gy = z7 + 2*z8 + z9 - z1 - 2*z2 - z3;
                int g = Math.abs(gx + gy);
                if(g<=T){
                    imagen.setRGB(x, y, 0);
                }
                else{
                    imagen.setRGB(x, y,new Color(255, 255, 255).getRGB() );
                }
            }
        }
        return imagen;
    }
    //deteccion de borde por prewitt
    public static BufferedImage prewitt(BufferedImage original, int T) {
        BufferedImage imagen = new BufferedImage(original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int y = 1; y < original.getHeight()-1; y++) {
            for (int x = 1; x < original.getWidth()-1; x++) {
                int z1 = original.getRGB(x-1, y-1)&255;
                int z2 = original.getRGB(x, y-1)&255;
                int z3 = original.getRGB(x+1, y-1)&255;
                int z4 = original.getRGB(x-1, y)&255;
//                int z5 = original.getRGB(x, y)&255;
                int z6 = original.getRGB(x+1, y)&255;
                int z7 = original.getRGB(x-1, y+1)&255;
                int z8 = original.getRGB(x, y+1)&255;
                int z9 = original.getRGB(x+1, y+1)&255;
                int gx = z1 + z4 + z7 - z3 - z6 - z9; 
                int gy = z1 + z2 + z3 - z7 - z8 - z9;
                int g = Math.abs(gx + gy);
                if(g<=T){
                    imagen.setRGB(x, y, 0);
                }
                else{
                    imagen.setRGB(x, y,new Color(255, 255, 255).getRGB() );
                }
            }
        }
        return imagen;
    }
    //metodo de detencion de bordes por robert
    public static BufferedImage robert(BufferedImage original, int T) {
        BufferedImage imagen = new BufferedImage(original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int y = 1; y < original.getHeight()-1; y++) {
            for (int x = 1; x < original.getWidth()-1; x++) {
                int z1 = original.getRGB(x-1, y-1)&255;
//                int z2 = original.getRGB(x, y-1)&255;
                int z3 = original.getRGB(x+1, y-1)&255;
//                int z4 = original.getRGB(x-1, y)&255;
                int z5 = original.getRGB(x, y)&255;
//                int z6 = original.getRGB(x+1, y)&255;
//                int z7 = original.getRGB(x-1, y+1)&255;
//                int z8 = original.getRGB(x, y+1)&255;
//                int z9 = original.getRGB(x+1, y+1)&255;
                int gx = z5 -z1; 
                int gy = z5 -z3;
                int g = Math.abs(gx + gy);
                if(g<=T){
                    imagen.setRGB(x, y, 0);
                }
                else{
                    imagen.setRGB(x, y,new Color(255, 255, 255).getRGB() );
                }
            }
        }
        return imagen;
    }
    //filtro laplaceanp
    public static BufferedImage laplaceano(BufferedImage original, int T) {
        BufferedImage imagen = new BufferedImage(original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int y = 1; y < original.getHeight()-1; y++) {
            for (int x = 1; x < original.getWidth()-1; x++) {
                int z2 = original.getRGB(x, y-1)&255;
                int z4 = original.getRGB(x-1, y)&255;
                int z5 = original.getRGB(x, y)&255;
                int z6 = original.getRGB(x+1, y)&255;
                int z8 = original.getRGB(x, y+1)&255;
                int g = z2 + z4 - 4*z5 + z6 + z8;
                if(g<=T){
                    imagen.setRGB(x, y, 0);
                }
                else{
                    imagen.setRGB(x, y,new Color(255, 255, 255).getRGB() );
                }
            }
        }
        return imagen;
    }
}
