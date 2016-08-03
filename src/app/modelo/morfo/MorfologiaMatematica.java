
package app.modelo.morfo;

import java.awt.image.BufferedImage;


public class MorfologiaMatematica {
    
    //metodo para la erosion
    public static BufferedImage erosion(BufferedImage original, Integer[] mascara) {
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
                if(z5 == 255){
                    if(z1 == mascara[0] && z2 == mascara[1] && z3 == mascara[2] && z4 == mascara[3] && z5 == mascara[4] && z6 == mascara[5] && z7 == mascara[6] && z8 == mascara[7] && z9 == mascara[8]){
                    imagen.setRGB(x, y, (z5 << 16) | (z5 << 8) | z5);
                    }
                    else{
                    imagen.setRGB(x-1, y-1,0); 
                    imagen.setRGB(x, y-1,0);
                    imagen.setRGB(x+1, y-1,0);
                    imagen.setRGB(x-1, y,0);
                    imagen.setRGB(x, y,0);
                    imagen.setRGB(x+1, y,0);
                    imagen.setRGB(x-1, y+1,0);
                    imagen.setRGB(x, y+1,0);
                    imagen.setRGB(x+1, y+1,0);
                    }     
                }
            }
        }
        return imagen;
    }
    
        public static BufferedImage dilatacion(BufferedImage original, Integer[] mascara) {
        BufferedImage imagen = new BufferedImage(original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int y = 1; y < original.getHeight()-1; y++) {
            for (int x = 1; x < original.getWidth()-1; x++) {
                int z5 = original.getRGB(x, y)&255;
                if(z5 == 255){
                    imagen.setRGB(x-1, y-1,(mascara[0] << 16) | (mascara[0] << 8) | mascara[0]); 
                    imagen.setRGB(x, y-1,(mascara[1] << 16) | (mascara[1] << 8) | mascara[1]);
                    imagen.setRGB(x+1, y-1,(mascara[2] << 16) | (mascara[2] << 8) | mascara[2]);
                    imagen.setRGB(x-1, y,(mascara[3] << 16) | (mascara[3] << 8) | mascara[3]);
                    imagen.setRGB(x, y,(mascara[4] << 16) | (mascara[4] << 8) | mascara[4]);
                    imagen.setRGB(x+1, y,(mascara[5] << 16) | (mascara[5] << 8) | mascara[5]);
                    imagen.setRGB(x-1, y+1,(mascara[6] << 16) | (mascara[6] << 8) | mascara[6]);
                    imagen.setRGB(x, y+1,(mascara[7] << 16) | (mascara[7] << 8) | mascara[7]);
                    imagen.setRGB(x+1, y+1,(mascara[8] << 16) | (mascara[8] << 8) | mascara[8]);
                }
                else
                    imagen.setRGB(x, y, (z5 << 16) | (z5 << 8) | z5);
            }
        }
        return imagen;
    }
}
