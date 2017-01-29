/*
this class allows load files PNG's, JPG's, etc to software
 */
package com.mx.app.adi.controller.load;

import com.mx.app.adi.model.components.WindowInternal;
import com.mx.app.adi.model.entities.Session;
import com.mx.app.adi.model.pojos.Imagen;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class LoadFile {

    public void saveImageAs(BufferedImage select) {
        JFileChooser selector = new JFileChooser();
        selector.setDialogTitle("Guardar imagen como");
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("JPG & GIF & BMP", "jpg", "gif", "bmp");
        selector.setFileFilter(filtroImagen);
        if (selector.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                ImageIO.write(select, "JPG", selector.getSelectedFile());
            } catch (IOException ex) {
                System.err.println("Erro al guardar la imagen " + ex);
            }
        }
    }

    public void openImage(int idIncremetable, ArrayList<Imagen> imagenes, JDesktopPane escritorio) {
        JFileChooser selector = new JFileChooser();
        selector.setDialogTitle("Seleccione una imagen");
        selector.setFileFilter(new FileNameExtensionFilter("JPG & GIF & BMP", "jpg", "gif", "bmp", "png"));
        if (selector.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                File file = selector.getSelectedFile();
                BufferedImage fileImage = ImageIO.read(file);
                // Crear la ventana interna
                WindowInternal internal = null;
                Imagen imagen = new Imagen(idIncremetable, file.getName(), file.getPath(), fileImage, internal);
                // Ver en la interfaz principal
                LoadImagePrincipalDesktop.newWindow(escritorio, imagen, internal);
            } catch (IOException ex) {
                Logger.getLogger(LoadFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static void guardarImagen(Imagen imagen) {
            JFileChooser selector = new JFileChooser();
            selector.setDialogTitle("Guardar como");
            selector.setFileFilter(new FileNameExtensionFilter("JPG & GIF & BMP", "jpg", "gif", "bmp", "png"));
            selector.setSelectedFile(new File(imagen.getNombre()));
    }

}
