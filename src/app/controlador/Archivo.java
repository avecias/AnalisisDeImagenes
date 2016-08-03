package app.controlador;

import app.modelo.entidad.Imagen;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Archivo {

    public static void guardarImagen(BufferedImage actual) {
        JFileChooser selector = new JFileChooser();
        selector.setDialogTitle("Guardar como");
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("JPG & GIF & BMP", "jpg", "gif", "bmp");
        selector.setFileFilter(filtroImagen);
        int flag = selector.showSaveDialog(null);
        if (flag == JFileChooser.APPROVE_OPTION) {
            try {
                ImageIO.write(actual, "JPG", selector.getSelectedFile());
            } catch (Exception e) {
            }

        }
    }

    public static Imagen abrirImagen(int id) {
        Imagen imagen = null;
        try {
            JFileChooser selector = new JFileChooser();
            selector.setDialogTitle("Seleccione una imagen");
            selector.setFileFilter(new FileNameExtensionFilter("JPG & GIF & BMP", "jpg", "gif", "bmp", "png"));
            if (selector.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File archivo = selector.getSelectedFile();
                imagen = new Imagen(id, archivo.getName(), archivo.getPath(),ImageIO.read(archivo));
            }
            else{
                JOptionPane.showMessageDialog(null, "Ninguna imagen fue selecionada", "Ningun archivo", JOptionPane.ERROR_MESSAGE);
            }
            return imagen;
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo, " + e, "Erro en el archivo", JOptionPane.ERROR_MESSAGE);
            return imagen;
        }
    }

    public static void guardarImagen(Imagen imagen) {
        try {
            JFileChooser selector = new JFileChooser();
            selector.setDialogTitle("Guardar como");
            selector.setFileFilter(new FileNameExtensionFilter("JPG & GIF & BMP", "jpg", "gif", "bmp", "png"));
            selector.setSelectedFile(new File(imagen.getNombre()));
            if (selector.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                ImageIO.write(imagen.getBfImagen(), "JPG", selector.getSelectedFile());
            }
            else{
                JOptionPane.showMessageDialog(null, "Ninguna imagen fue selecionada", "Ningun archivo", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo, " + e, "Erro en el archivo", JOptionPane.ERROR_MESSAGE);
        }
    }
}
