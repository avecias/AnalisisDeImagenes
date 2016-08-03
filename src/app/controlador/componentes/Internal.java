package app.controlador.componentes;

import app.modelo.entidad.Imagen;
import java.awt.FlowLayout;
import java.awt.event.ContainerEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Internal {

    public static void nuevaVentana(JDesktopPane desktopPane, Imagen imagen) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JLabel(new ImageIcon(imagen.getBfImagen())));
        JInternalFrame internal = new JInternalFrame(imagen.getNombre(), true, true, true, true);
        internal.setName(""+imagen.getIdImagen());
        internal.add(panel);
        internal.pack();
        desktopPane.add(internal);
        internal.setVisible(true);
    }

    public static void mismaVentana(JInternalFrame internalFrame,Imagen imagen) {
        JPanel panel =  (JPanel) internalFrame.getContentPane().getComponent(0);
        JLabel label = (JLabel) panel.getComponent(0);
        label.setIcon(new ImageIcon(imagen.getBfImagen()));
    }
    
    public static int ventanaSeleccionada(JDesktopPane desktopPane) {
        return Integer.valueOf(desktopPane.getSelectedFrame().getName());
    }

    public static int ventanaCerrada(ContainerEvent evt) {
        return Integer.valueOf(evt.getChild().getName());
    }
    
    public static boolean noHayVentanas(JDesktopPane desktopPane) {
        return desktopPane.getComponentCount() == 0;
    }
    
    public static String[] lista(ArrayList<Imagen> imagenes){
        String lista = "";
        for (Imagen imagen : imagenes) {
            if(imagen != null){
                lista += imagen.getNombre() + ",";
            }
        }
        return lista.split(",");
    }
    
}
