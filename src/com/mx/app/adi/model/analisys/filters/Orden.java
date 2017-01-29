package com.mx.app.adi.model.analisys.filters;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Orden {

    public static BufferedImage maximo(BufferedImage original) {
        BufferedImage imagen = new BufferedImage(original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int y = 1; y < original.getHeight() - 1; y++) {
            for (int x = 1; x < original.getWidth() - 1; x++) {
                //encontrar la maximo
                int[] Rojo = Vencidad.vectorRojo(x, y, original);
                int[] Verde = Vencidad.vectorVerde(x, y, original);
                int[] Azul = Vencidad.vectorAzul(x, y, original);
                imagen.setRGB(x, y, new Color(best(Rojo), best(Verde), best(Azul)).getRGB());
            }
        }
        return imagen;
    }

    public static BufferedImage minimo(BufferedImage original) {
        BufferedImage imagen = new BufferedImage(original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int y = 1; y < original.getHeight() - 1; y++) {
            for (int x = 1; x < original.getWidth() - 1; x++) {
                //encontrar el minimo
                int[] Rojo = Vencidad.vectorRojo(x, y, original);
                int[] Verde = Vencidad.vectorVerde(x, y, original);
                int[] Azul = Vencidad.vectorAzul(x, y, original);
                imagen.setRGB(x, y, new Color(worst(Rojo), worst(Verde), worst(Azul)).getRGB());
            }
        }
        return imagen;
    }
    
    public static BufferedImage moda(BufferedImage original) {
        BufferedImage imagen = new BufferedImage(original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int y = 1; y < original.getHeight() - 1; y++) {
            for (int x = 1; x < original.getWidth() - 1; x++) {
                //encontrar el minimo
                int[] Rojo = Vencidad.vectorRojo(x, y, original);
                int[] Verde = Vencidad.vectorVerde(x, y, original);
                int[] Azul = Vencidad.vectorAzul(x, y, original);
                imagen.setRGB(x, y, new Color(hallarModa(Rojo, 0, Rojo.length-1), hallarModa(Verde, 0, Verde.length-1), hallarModa(Azul, 0, Azul.length-1)).getRGB());
            }
        }
        return imagen;
    }
    
    public static BufferedImage mediana(BufferedImage original) {
        BufferedImage imagen = new BufferedImage(original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int y = 1; y < original.getHeight() - 1; y++) {
            for (int x = 1; x < original.getWidth() - 1; x++) {
                //encontrar el minimo
                int[] Rojo = Vencidad.vectorRojo(x, y, original);
                int[] Verde = Vencidad.vectorVerde(x, y, original);
                int[] Azul = Vencidad.vectorAzul(x, y, original);
                imagen.setRGB(x, y, new Color(media(Rojo), media(Verde), media(Azul)).getRGB());
            }
        }
        return imagen;
    }

    private static int best(int[] A) {
        int best = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > best) {
                best = A[i];
            }
        }
        return best;
    }

    private static int worst(int[] A) {
        int worst = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] < worst) {
                worst = A[i];
            }
        }
        return worst;
    }

    public static int hallarModa(int a[], int prim, int ult) {
        int i, frec, maxfrec, moda;
        if (prim == ult) {
            return a[prim];
        }
        moda = a[prim];
        maxfrec = Frecuencia(a, a[prim], prim, ult);
        for (i = prim + 1; i <= ult; i++) {
            frec = Frecuencia(a, a[i], i, ult);
            if (frec > maxfrec) {
                maxfrec = frec;
                moda = a[i];
            }
        }

        return moda;

    }

    public static int Frecuencia(int a[], int p, int prim, int ult) {
        int i, suma;
        if (prim > ult) {
            return 0;
        }
        suma = 0;
        for (i = prim; i <= ult; i++) {
            if (a[i] == p) {
                suma++;
            }
        }

        return suma;

    }
    
    private static int media(int[] a){
        ArrayList<Integer> lista = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            Integer valor = a[i];
            if(!lista.contains(valor)){
                lista.add(valor);
            }
        }
        int n=0;
        lista = ordenar(lista);
        if(lista.size()%2 == 1){
            n = lista.size()/2;
        }
        else{
            n = lista.size()/2-1;
        }
//        System.out.println("valor de n " + n);
//        System.out.println("primer elemnto " + lista.get(0));
        return lista.get(n);
    }
    
    public static ArrayList<Integer> ordenar(ArrayList<Integer> lista) {
//        lista.sort(new Comparator<Integer>() {
//
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return new Integer(o1).compareTo(o2);
//            }
//        });
        return lista;
    }
    

}
