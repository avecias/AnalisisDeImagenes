/*
Ventana interna en el panel principal
 */
package com.mx.app.adi.model.components;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WindowInternal extends JInternalFrame{

    private JPanel panel;
    private JLabel labelImage;
    private int idWindowInternal;

    public WindowInternal(String title, boolean resizable, boolean closable, boolean maximizable,int idWindowInternal) {
        super(title, resizable, closable, maximizable);
        this.idWindowInternal = idWindowInternal;
    }

    public void init(BufferedImage image){
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        labelImage = new JLabel(new ImageIcon(image));
        panel.add(labelImage);
        add(panel);
    }

    public int getIdWindowInternal() {
        return idWindowInternal;
    }

    public void setIdWindowInternal(int idWindowInternal) {
        this.idWindowInternal = idWindowInternal;
    }
    
    
}
