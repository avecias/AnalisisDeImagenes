
package com.mx.app.adi.model.analisys.filters;

import java.awt.image.BufferedImage;


public class Vencidad {
    
    public static int[] vectorRojo(int x, int y, BufferedImage original) {
        int z1 = (original.getRGB(x - 1, y - 1) & 0x00ff0000)>>16;
        int z2 = (original.getRGB(x, y - 1) & 0x00ff0000)>>16;
        int z3 = (original.getRGB(x + 1, y - 1) & 0x00ff0000)>>16;
        int z4 = (original.getRGB(x - 1, y) & 0x00ff0000)>>16;
        int z5 = (original.getRGB(x, y) & 0x00ff0000)>>16;
        int z6 = (original.getRGB(x + 1, y) & 0x00ff0000)>>16;
        int z7 = (original.getRGB(x - 1, y + 1) & 0x00ff0000)>>16;
        int z8 = (original.getRGB(x, y + 1) & 0x00ff0000)>>16;
        int z9 = (original.getRGB(x + 1, y + 1) & 0x00ff0000)>>16;
        return new int[] {z1,z2,z3 ,z4,z5,z6,z7,z8,z9};
    }

    public static int[] vectorVerde(int x, int y, BufferedImage original) {
        int z1 = (original.getRGB(x - 1, y - 1) & 0x0000ff00)>>8;
        int z2 = (original.getRGB(x, y - 1) & 0x0000ff00)>>8;
        int z3 = (original.getRGB(x + 1, y - 1) & 0x0000ff00)>>8;
        int z4 = (original.getRGB(x - 1, y) & 0x0000ff00)>>8;
        int z5 = (original.getRGB(x, y) & 0x0000ff00)>>8;
        int z6 = (original.getRGB(x + 1, y) & 0x0000ff00)>>8;
        int z7 = (original.getRGB(x - 1, y + 1) & 0x0000ff00)>>8;
        int z8 = (original.getRGB(x, y + 1) & 0x0000ff00)>>8;
        int z9 = (original.getRGB(x + 1, y + 1) & 0x0000ff00)>>8;
        return new int[] {z1,z2,z3 ,z4,z5,z6,z7,z8,z9};
    }

    public static int[] vectorAzul(int x, int y, BufferedImage original) {
        int z1 = original.getRGB(x - 1, y - 1) & 255;
        int z2 = original.getRGB(x, y - 1) & 255;
        int z3 = original.getRGB(x + 1, y - 1) & 255;
        int z4 = original.getRGB(x - 1, y) & 255;
        int z5 = original.getRGB(x, y) & 255;
        int z6 = original.getRGB(x + 1, y) & 255;
        int z7 = original.getRGB(x - 1, y + 1) & 255;
        int z8 = original.getRGB(x, y + 1) & 255;
        int z9 = original.getRGB(x + 1, y + 1) & 255;
        return new int[] {z1,z2,z3 ,z4,z5,z6,z7,z8,z9};
    }
}
