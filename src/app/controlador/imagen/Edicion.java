package app.controlador.imagen;

import app.controlador.componentes.Deslizador;
import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;
import app.modelo.ruido.Ruido;
import app.modelo.basicas.LogicaAritmetica;
import app.modelo.basicas.TransformacionBasica;
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
        return transformacionBasica.grises(i.getBfImagen());
    }

    public BufferedImage rotacionImagen(Imagen i) {
        return transformacionBasica.rorateArray(i.getBfImagen());
    }

    public BufferedImage binario(Imagen i) {
        return transformacionBasica.binario(i.getBfImagen());
    }

    public BufferedImage negativo(Imagen i) {
        return transformacionBasica.negativo(i.getBfImagen());
    }

    public BufferedImage umbral(Imagen i) {
        return transformacionBasica.umbral(i.getBfImagen(), Deslizador.obtener("Seleccione el valor del umbral", "Umbral ", INTERVALO_50, MAX_255));
    }
    public BufferedImage rotar(Imagen i) {
        return transformacionBasica.rorateArray(i.getBfImagen());
    }

    public BufferedImage aditivo(Imagen i) {
        return ruido.aditivo(i.getBfImagen(), Deslizador.obtener("Seleccione el porcentaje", "Porcentaje %", INTERVALO_10, MAX_100));
    }

    public BufferedImage sustractivo(Imagen i) {
        return ruido.sustractivo(i.getBfImagen(), Deslizador.obtener("Seleccione el porcentaje", "Porcentaje %", INTERVALO_10, MAX_100));
    }

    public BufferedImage mixto(Imagen i) {
        int porcentaje = Deslizador.obtener("Seleccione el porcentaje", "Porcentaje %", INTERVALO_10, MAX_100)/2;
        return ruido.aditivo(ruido.sustractivo(i.getBfImagen(), porcentaje), porcentaje);
    }
    
    public BufferedImage and(Imagen a,Imagen b) {
        if( a.getBfImagen().getWidth() == b.getBfImagen().getWidth() && a.getBfImagen().getHeight() == b.getBfImagen().getHeight()){
                return logicaAritmetica.and(a.getBfImagen(), b.getBfImagen());
        }
        JOptionPane.showMessageDialog(null, "No son de las mismas dimensiones", "Error en las imagenes", JOptionPane.ERROR_MESSAGE);
        return a.getBfImagen();
    }
    
    public BufferedImage or(Imagen a,Imagen b) {
        if( a.getBfImagen().getWidth() == b.getBfImagen().getWidth() && a.getBfImagen().getHeight() == b.getBfImagen().getHeight()){
                return logicaAritmetica.or(a.getBfImagen(), b.getBfImagen());
        }
        JOptionPane.showMessageDialog(null, "No son de las mismas dimensiones", "Error en las imagenes", JOptionPane.ERROR_MESSAGE);
        return a.getBfImagen();
    }
    public BufferedImage xor(Imagen a,Imagen b) {
        if( a.getBfImagen().getWidth() == b.getBfImagen().getWidth() && a.getBfImagen().getHeight() == b.getBfImagen().getHeight()){
                return logicaAritmetica.xor(a.getBfImagen(), b.getBfImagen());
        }
        JOptionPane.showMessageDialog(null, "No son de las mismas dimensiones", "Error en las imagenes", JOptionPane.ERROR_MESSAGE);
        return a.getBfImagen();
    }
    
    public BufferedImage not(Imagen a) {
        return logicaAritmetica.not(a.getBfImagen());
    }
    
    public BufferedImage suma(Imagen a,Imagen b) {
        if( a.getBfImagen().getWidth() == b.getBfImagen().getWidth() && a.getBfImagen().getHeight() == b.getBfImagen().getHeight()){
                return logicaAritmetica.suma(a.getBfImagen(), b.getBfImagen());
        }
        JOptionPane.showMessageDialog(null, "No son de las mismas dimensiones", "Error en las imagenes", JOptionPane.ERROR_MESSAGE);
        return a.getBfImagen();
    }
    
    public BufferedImage resta(Imagen a,Imagen b) {
        if( a.getBfImagen().getWidth() == b.getBfImagen().getWidth() && a.getBfImagen().getHeight() == b.getBfImagen().getHeight()){
                return logicaAritmetica.resta(a.getBfImagen(), b.getBfImagen());
        }
        JOptionPane.showMessageDialog(null, "No son de las mismas dimensiones", "Error en las imagenes", JOptionPane.ERROR_MESSAGE);
        return a.getBfImagen();
    }
    
    public BufferedImage masBrillo(Imagen i) {
        return transformacionBasica.masBrillo(i.getBfImagen());
    }
    
    public BufferedImage menosBrillo(Imagen i) {
        return transformacionBasica.menosBrillo(i.getBfImagen());
    }
    
}
