package com.mx.app.adi.model.analisys.morphologi;

import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;
import com.mx.app.adi.model.analisys.basic.LogicaAritmetica;

public class Morfologia {

    public static BufferedImage erosion(BufferedImage i) {
        Integer[] mascara = obtenerMascara();
        return MorfologiaMatematica.erosion(i, mascara);
    }

    public static BufferedImage dilatacion(BufferedImage i) {
        Integer[] mascara = obtenerMascara();
        return MorfologiaMatematica.dilatacion(i, mascara);
    }

    public static BufferedImage esquinas(BufferedImage i) {
        BufferedImage i1 = DeteccionEsquina.primera(i);
        BufferedImage i2 = DeteccionEsquina.segunda(i);
        BufferedImage i3 = DeteccionEsquina.tercera(i);
        BufferedImage i4 = DeteccionEsquina.cuarta(i);
//        i1 = LogicaAritmetica.or(i1, i2);
//        i1 = LogicaAritmetica.or(i1, i3);
//        return LogicaAritmetica.or(i1, i4);
        return i;
    }

    public static BufferedImage bordeInterno(BufferedImage i) {
        Integer[] mascara = obtenerMascara();
        BufferedImage i2 = MorfologiaMatematica.erosion(i, mascara);
        return i;//LogicaAritmetica.resta(i, i2);
    }

    public static BufferedImage bordeExterno(BufferedImage i) {
        Integer[] mascara = obtenerMascara();
        BufferedImage i2 = MorfologiaMatematica.dilatacion(i, mascara);
        return i;//LogicaAritmetica.resta(i2, i);
    }

    public static BufferedImage clausura(BufferedImage i) {
        Integer[] mascara = obtenerMascara();
        BufferedImage i2 = MorfologiaMatematica.dilatacion(i, mascara);
        return MorfologiaMatematica.erosion(i2, mascara);
    }

    public static BufferedImage apertura(BufferedImage i) {
        Integer[] mascara = obtenerMascara();
        BufferedImage i2 = MorfologiaMatematica.erosion(i, mascara);
        return MorfologiaMatematica.dilatacion(i2, mascara);
    }

    private static Integer[] obtenerMascara() {
        String arreglo = JOptionPane.showInputDialog("Inserte los valores del elemento de estructura");
        String[] split = arreglo.split(",");
        Integer[] mascara = new Integer[split.length];
        for (int j = 0; j < split.length; j++) {
            mascara[j] = Integer.valueOf(split[j]);
            System.out.println(split[j] + ",");
        }
        return mascara;
    }
}
