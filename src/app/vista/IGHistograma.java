
package app.vista;

import app.controlador.HistogramCreador;
import app.modelo.entidad.Imagen;
import app.modelo.histograma.Histograma;
import java.awt.Color;
import javax.swing.ImageIcon;

public class IGHistograma extends javax.swing.JFrame {

    public IGHistograma() {
        initComponents();
    }

    IGHistograma(Imagen imagen) {
        initComponents();
        int[][] histograma = Histograma.calcular(imagen.getBfImagen());
        HistogramCreador creator = new HistogramCreador();
        creator.crearHistograma(histograma[0], panelHistogramaRojo,"Canala Rojo", Color.red);
        creator.crearHistograma(histograma[1], panelHistogramaVerde,"Canala Verde", Color.green);
        creator.crearHistograma(histograma[2], panelHistogramaAzul,"Canala Azul", Color.blue);
        imagenHistograma.setIcon(new ImageIcon(imagen.getBfImagen()));
        setTitle("Histograma " + imagen.getNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHistogramaVerde = new javax.swing.JPanel();
        panelHistogramaRojo = new javax.swing.JPanel();
        panelHistogramaAzul = new javax.swing.JPanel();
        panelImagen = new javax.swing.JScrollPane();
        imagenHistograma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Histograma");

        panelHistogramaVerde.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHistogramaVerde.setAutoscrolls(true);

        javax.swing.GroupLayout panelHistogramaVerdeLayout = new javax.swing.GroupLayout(panelHistogramaVerde);
        panelHistogramaVerde.setLayout(panelHistogramaVerdeLayout);
        panelHistogramaVerdeLayout.setHorizontalGroup(
            panelHistogramaVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelHistogramaVerdeLayout.setVerticalGroup(
            panelHistogramaVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        panelHistogramaRojo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHistogramaRojo.setAutoscrolls(true);

        javax.swing.GroupLayout panelHistogramaRojoLayout = new javax.swing.GroupLayout(panelHistogramaRojo);
        panelHistogramaRojo.setLayout(panelHistogramaRojoLayout);
        panelHistogramaRojoLayout.setHorizontalGroup(
            panelHistogramaRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelHistogramaRojoLayout.setVerticalGroup(
            panelHistogramaRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        panelHistogramaAzul.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHistogramaAzul.setAutoscrolls(true);

        javax.swing.GroupLayout panelHistogramaAzulLayout = new javax.swing.GroupLayout(panelHistogramaAzul);
        panelHistogramaAzul.setLayout(panelHistogramaAzulLayout);
        panelHistogramaAzulLayout.setHorizontalGroup(
            panelHistogramaAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );
        panelHistogramaAzulLayout.setVerticalGroup(
            panelHistogramaAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        panelImagen.setViewportView(imagenHistograma);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelHistogramaAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelHistogramaRojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelHistogramaVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(panelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelHistogramaRojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panelHistogramaVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panelHistogramaAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagenHistograma;
    private javax.swing.JPanel panelHistogramaAzul;
    private javax.swing.JPanel panelHistogramaRojo;
    private javax.swing.JPanel panelHistogramaVerde;
    private javax.swing.JScrollPane panelImagen;
    // End of variables declaration//GEN-END:variables
}
