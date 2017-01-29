/*
 Aplicacion para la edicion de imagenes usando el anlisis de imagenes
 operaciones matematicas y logicas
 operaciones con matrices para el analisis de las imagenes
 */
package com.mx.app.adi.view;

import com.mx.app.adi.controller.edition.Edicion;
import com.mx.app.adi.controller.load.LoadFile;
import com.mx.app.adi.model.components.WindowInternal;
import com.mx.app.adi.model.entities.Session;
import com.mx.app.adi.model.pojos.Imagen;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class IGPrincipal extends javax.swing.JFrame {

    private final LoadFile loadFile;
    private final Session session;
    private final ArrayList<Imagen> imagenes;
    private final Edicion edicion;
    private int idIncremetable;

    public IGPrincipal(Session session) {
        this.session = session;
        imagenes = new ArrayList<>();
        edicion = new Edicion();
        loadFile = new LoadFile();
        initComponents();
        //componentesInciales(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuAbrir = new javax.swing.JMenuItem();
        menuGuardar = new javax.swing.JMenuItem();
        nuevo = new javax.swing.JMenuItem();
        menuReiniciar = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        menuOriginal = new javax.swing.JMenuItem();
        otraVentana = new javax.swing.JCheckBoxMenuItem();
        menuTransformaciones = new javax.swing.JMenu();
        menuGris = new javax.swing.JMenuItem();
        menuBinario = new javax.swing.JMenuItem();
        menuNegativo = new javax.swing.JMenuItem();
        menuRotar = new javax.swing.JMenuItem();
        menuBinarizacion = new javax.swing.JMenu();
        menuOpeUmbral = new javax.swing.JMenuItem();
        menuHistograma = new javax.swing.JMenu();
        menuVerHistograma = new javax.swing.JMenuItem();
        menuRuido = new javax.swing.JMenu();
        menuAditivo = new javax.swing.JMenuItem();
        menuSustractivo = new javax.swing.JMenuItem();
        separadorRuido = new javax.swing.JPopupMenu.Separator();
        menuMixto = new javax.swing.JMenuItem();
        menuFiltros = new javax.swing.JMenu();
        menuPasaAltas = new javax.swing.JMenu();
        menuSobel = new javax.swing.JMenuItem();
        menuPrewitt = new javax.swing.JMenuItem();
        menuRobert = new javax.swing.JMenuItem();
        menuLaplaciano = new javax.swing.JMenuItem();
        menuPasaBajas = new javax.swing.JMenu();
        menuPromedio = new javax.swing.JMenuItem();
        menuPromedioPesado = new javax.swing.JMenuItem();
        menuOrden = new javax.swing.JMenu();
        menuMinimo = new javax.swing.JMenuItem();
        menuMaximo = new javax.swing.JMenuItem();
        menuMedia = new javax.swing.JMenuItem();
        menuModa = new javax.swing.JMenuItem();
        menuOperacion = new javax.swing.JMenu();
        menuLogico = new javax.swing.JMenu();
        menuAnd = new javax.swing.JMenuItem();
        menuNot = new javax.swing.JMenuItem();
        menuOr = new javax.swing.JMenuItem();
        menuXor = new javax.swing.JMenuItem();
        menuAritmetico = new javax.swing.JMenu();
        menuAdd = new javax.swing.JMenuItem();
        menuSubs = new javax.swing.JMenuItem();
        menuHerramientas = new javax.swing.JMenu();
        menuBrilloMas = new javax.swing.JMenuItem();
        menuBrilloMenos = new javax.swing.JMenuItem();
        menuMorfologia = new javax.swing.JMenu();
        menuErosion = new javax.swing.JMenuItem();
        menuDilatacion = new javax.swing.JMenuItem();
        menuApertura = new javax.swing.JMenuItem();
        menuClausura = new javax.swing.JMenuItem();
        menuEsquinas = new javax.swing.JMenuItem();
        bordeExterno = new javax.swing.JMenuItem();
        bordeInterno = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        menuAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analisis de Imagenes");

        escritorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seleccionar(evt);
            }
        });
        escritorio.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                ventanaCerrada(evt);
            }
        });

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1053, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jToolBar1.setRollover(true);

        jLabel1.setText("jLabel1");
        jToolBar1.add(jLabel1);

        menuArchivo.setText("Archivo");

        menuAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/app/imagenes/Folder.png"))); // NOI18N
        menuAbrir.setText("Abrir");
        menuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuAbrir);

        menuGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/app/imagenes/Save.png"))); // NOI18N
        menuGuardar.setText("Guardar");
        menuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarActionPerformed(evt);
            }
        });
        menuArchivo.add(menuGuardar);

        nuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/app/imagenes/Add.png"))); // NOI18N
        nuevo.setText("Nueva Imagen");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        menuArchivo.add(nuevo);

        menuReiniciar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menuReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/app/imagenes/Synchronize.png"))); // NOI18N
        menuReiniciar.setText("Reiniciar");
        menuReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReiniciarActionPerformed(evt);
            }
        });
        menuArchivo.add(menuReiniciar);

        menuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mx/app/imagenes/Log Out.png"))); // NOI18N
        menuSalir.setText("Cerrar");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuSalir);

        menu.add(menuArchivo);

        menuEditar.setText("Editar");

        menuOriginal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        menuOriginal.setText("Imagen Original");
        menuOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOriginalActionPerformed(evt);
            }
        });
        menuEditar.add(menuOriginal);

        otraVentana.setSelected(false);
        otraVentana.setText("Otra ventana");
        menuEditar.add(otraVentana);

        menu.add(menuEditar);

        menuTransformaciones.setText("Trans. Basicas");

        menuGris.setText("Grises");
        menuGris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGrisActionPerformed(evt);
            }
        });
        menuTransformaciones.add(menuGris);

        menuBinario.setText("Binario");
        menuBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBinarioActionPerformed(evt);
            }
        });
        menuTransformaciones.add(menuBinario);

        menuNegativo.setText("Negativo");
        menuNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNegativoActionPerformed(evt);
            }
        });
        menuTransformaciones.add(menuNegativo);

        menuRotar.setText("Rotar imagen");
        menuRotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRotarActionPerformed(evt);
            }
        });
        menuTransformaciones.add(menuRotar);

        menuBinarizacion.setText("Binarizacion");

        menuOpeUmbral.setText("Ope. Umbral");
        menuOpeUmbral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpeUmbralActionPerformed(evt);
            }
        });
        menuBinarizacion.add(menuOpeUmbral);

        menuTransformaciones.add(menuBinarizacion);

        menu.add(menuTransformaciones);

        menuHistograma.setText("Histograma");

        menuVerHistograma.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        menuVerHistograma.setText("Ver");
        menuVerHistograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerHistogramaActionPerformed(evt);
            }
        });
        menuHistograma.add(menuVerHistograma);

        menu.add(menuHistograma);

        menuRuido.setText("Ruido");

        menuAditivo.setText("Aditivo");
        menuAditivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAditivoActionPerformed(evt);
            }
        });
        menuRuido.add(menuAditivo);

        menuSustractivo.setText("Sustractivo");
        menuSustractivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSustractivoActionPerformed(evt);
            }
        });
        menuRuido.add(menuSustractivo);
        menuRuido.add(separadorRuido);

        menuMixto.setText("Mixto");
        menuMixto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMixtoActionPerformed(evt);
            }
        });
        menuRuido.add(menuMixto);

        menu.add(menuRuido);

        menuFiltros.setText("Filtros");

        menuPasaAltas.setText("Pasa altas");

        menuSobel.setText("Sobel");
        menuSobel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobelActionPerformed(evt);
            }
        });
        menuPasaAltas.add(menuSobel);

        menuPrewitt.setText("Prewitt");
        menuPrewitt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrewittActionPerformed(evt);
            }
        });
        menuPasaAltas.add(menuPrewitt);

        menuRobert.setText("Robert");
        menuRobert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRobertActionPerformed(evt);
            }
        });
        menuPasaAltas.add(menuRobert);

        menuLaplaciano.setText("Laplaciano");
        menuLaplaciano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLaplacianoActionPerformed(evt);
            }
        });
        menuPasaAltas.add(menuLaplaciano);

        menuFiltros.add(menuPasaAltas);

        menuPasaBajas.setText("Pasa bajas");

        menuPromedio.setText("Promedio");
        menuPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPromedioActionPerformed(evt);
            }
        });
        menuPasaBajas.add(menuPromedio);

        menuPromedioPesado.setText("Prom. Pesado");
        menuPromedioPesado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPromedioPesadoActionPerformed(evt);
            }
        });
        menuPasaBajas.add(menuPromedioPesado);

        menuFiltros.add(menuPasaBajas);

        menuOrden.setText("Orden");

        menuMinimo.setText("Minimo");
        menuMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMinimoActionPerformed(evt);
            }
        });
        menuOrden.add(menuMinimo);

        menuMaximo.setText("Maximo");
        menuMaximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMaximoActionPerformed(evt);
            }
        });
        menuOrden.add(menuMaximo);

        menuMedia.setText("Media");
        menuMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMediaActionPerformed(evt);
            }
        });
        menuOrden.add(menuMedia);

        menuModa.setText("Moda");
        menuModa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuModaActionPerformed(evt);
            }
        });
        menuOrden.add(menuModa);

        menuFiltros.add(menuOrden);

        menu.add(menuFiltros);

        menuOperacion.setText("Operacion");

        menuLogico.setText("Logicos");

        menuAnd.setText("And");
        menuAnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAndActionPerformed(evt);
            }
        });
        menuLogico.add(menuAnd);

        menuNot.setText("Not");
        menuNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNotActionPerformed(evt);
            }
        });
        menuLogico.add(menuNot);

        menuOr.setText("Or");
        menuOr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOrActionPerformed(evt);
            }
        });
        menuLogico.add(menuOr);

        menuXor.setText("Xor");
        menuXor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuXorActionPerformed(evt);
            }
        });
        menuLogico.add(menuXor);

        menuOperacion.add(menuLogico);

        menuAritmetico.setText("Aritmetico");

        menuAdd.setText("Add");
        menuAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddActionPerformed(evt);
            }
        });
        menuAritmetico.add(menuAdd);

        menuSubs.setText("Subs");
        menuSubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSubsActionPerformed(evt);
            }
        });
        menuAritmetico.add(menuSubs);

        menuOperacion.add(menuAritmetico);

        menu.add(menuOperacion);

        menuHerramientas.setText("Herramientas");

        menuBrilloMas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_UP, java.awt.event.InputEvent.CTRL_MASK));
        menuBrilloMas.setText("Brillo +");
        menuBrilloMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBrilloMasActionPerformed(evt);
            }
        });
        menuHerramientas.add(menuBrilloMas);

        menuBrilloMenos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DOWN, java.awt.event.InputEvent.CTRL_MASK));
        menuBrilloMenos.setText("Brillo -");
        menuBrilloMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBrilloMenosActionPerformed(evt);
            }
        });
        menuHerramientas.add(menuBrilloMenos);

        menu.add(menuHerramientas);

        menuMorfologia.setText("Morfologia mat");

        menuErosion.setText("Erosion");
        menuErosion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuErosionActionPerformed(evt);
            }
        });
        menuMorfologia.add(menuErosion);

        menuDilatacion.setText("Dilatacion");
        menuDilatacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDilatacionActionPerformed(evt);
            }
        });
        menuMorfologia.add(menuDilatacion);

        menuApertura.setText("Apertura");
        menuApertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAperturaActionPerformed(evt);
            }
        });
        menuMorfologia.add(menuApertura);

        menuClausura.setText("Clausura");
        menuClausura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClausuraActionPerformed(evt);
            }
        });
        menuMorfologia.add(menuClausura);

        menuEsquinas.setText("Det. Esquinas");
        menuEsquinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEsquinasActionPerformed(evt);
            }
        });
        menuMorfologia.add(menuEsquinas);

        bordeExterno.setText("Borde Externo");
        bordeExterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bordeExternoActionPerformed(evt);
            }
        });
        menuMorfologia.add(bordeExterno);

        bordeInterno.setText("Borde Interno");
        bordeInterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bordeInternoActionPerformed(evt);
            }
        });
        menuMorfologia.add(bordeInterno);

        menu.add(menuMorfologia);

        menuAyuda.setText("Ayuda");

        menuAcerca.setText("Acerca de...");
        menuAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAcercaActionPerformed(evt);
            }
        });
        menuAyuda.add(menuAcerca);

        menu.add(menuAyuda);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarActionPerformed
        // 

    }//GEN-LAST:event_menuGuardarActionPerformed

    private void menuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirActionPerformed
        // Abrir una imagen en formato JPGE y PNG
        loadFile.openImage(++idIncremetable, imagenes, escritorio);
    }//GEN-LAST:event_menuAbrirActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuGrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGrisActionPerformed
        // TODO add your handling code here:
        edicion.grises(selected(escritorio));
    }//GEN-LAST:event_menuGrisActionPerformed

    private void menuBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBinarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuBinarioActionPerformed

    private void menuNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNegativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuNegativoActionPerformed

    private void menuRotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRotarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRotarActionPerformed

    private void menuOpeUmbralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpeUmbralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuOpeUmbralActionPerformed

    private void menuVerHistogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerHistogramaActionPerformed
        // TODO add your handling code here:
        new GUIHistogram(selected(escritorio)).setVisible(true);
    }//GEN-LAST:event_menuVerHistogramaActionPerformed

    private void menuAditivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAditivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAditivoActionPerformed

    private void menuSustractivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSustractivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSustractivoActionPerformed

    private void menuMixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMixtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuMixtoActionPerformed

    private void menuOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOriginalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuOriginalActionPerformed

    private void menuSobelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSobelActionPerformed

    private void menuPrewittActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrewittActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuPrewittActionPerformed

    private void menuRobertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRobertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRobertActionPerformed

    private void menuModaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuModaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuModaActionPerformed

    private void menuPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPromedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuPromedioActionPerformed

    private void menuPromedioPesadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPromedioPesadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuPromedioPesadoActionPerformed

    private void menuAndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAndActionPerformed
        // TODO add your handling code here:
//        Object[] lista = Internal.lista(this);
//        String s = (String) JOptionPane.showInputDialog(null, "Seleccione otra imagen", "Eliga una opcion", JOptionPane.PLAIN_MESSAGE, null, lista, lista[0]);
//        int n = (int) s.charAt(6) - 48;
//        hacerCambios(Edicion.and(imagenes.get(Internal.ventanaSeleccionada(this)), imagenes.get(n)));
    }//GEN-LAST:event_menuAndActionPerformed

    private void menuOrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuOrActionPerformed

    private void menuXorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuXorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuXorActionPerformed

    private void menuAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAddActionPerformed

    private void menuSubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSubsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSubsActionPerformed

    private void menuNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuNotActionPerformed

    private void menuMinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMinimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuMinimoActionPerformed

    private void menuMaximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMaximoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuMaximoActionPerformed

    private void menuMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuMediaActionPerformed

    private void menuBrilloMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBrilloMasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuBrilloMasActionPerformed

    private void menuBrilloMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBrilloMenosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuBrilloMenosActionPerformed

    private void menuReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReiniciarActionPerformed
        //Reiniciar el programa
        IGPrincipal e = new IGPrincipal(session);
        e.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_menuReiniciarActionPerformed

    private void menuLaplacianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLaplacianoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuLaplacianoActionPerformed

    private void ventanaCerrada(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_ventanaCerrada
        // Ventana cerrada en el excritorio
        imagenes.set(0, null);
    }//GEN-LAST:event_ventanaCerrada

    private void menuErosionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuErosionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuErosionActionPerformed

    private void menuDilatacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDilatacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuDilatacionActionPerformed

    private void menuEsquinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEsquinasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuEsquinasActionPerformed

    private void bordeExternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bordeExternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bordeExternoActionPerformed

    private void bordeInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bordeInternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bordeInternoActionPerformed

    private void menuAperturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAperturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAperturaActionPerformed

    private void menuClausuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClausuraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuClausuraActionPerformed

    private void menuAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAcercaActionPerformed
        // TODO add your handling code here:
        new GUIAboutit().setVisible(true);
    }//GEN-LAST:event_menuAcercaActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        // Una nueva imagen en blanco
    }//GEN-LAST:event_nuevoActionPerformed

    private void seleccionar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionar
        // TODO add your handling code here:
    }//GEN-LAST:event_seleccionar

    private void hacerCambios(BufferedImage imagenCambio) {

    }

    private void componentesInciales(boolean b) {
        menuEditar.setVisible(b);
        menuTransformaciones.setVisible(b);
        //menuHistograma.setVisible(b);
        menuFiltros.setVisible(b);
        menuRuido.setVisible(b);
        menuOperacion.setVisible(b);
        menuHerramientas.setVisible(b);
        menuMorfologia.setVisible(b);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bordeExterno;
    private javax.swing.JMenuItem bordeInterno;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem menuAbrir;
    private javax.swing.JMenuItem menuAcerca;
    private javax.swing.JMenuItem menuAdd;
    private javax.swing.JMenuItem menuAditivo;
    private javax.swing.JMenuItem menuAnd;
    private javax.swing.JMenuItem menuApertura;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAritmetico;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenuItem menuBinario;
    private javax.swing.JMenu menuBinarizacion;
    private javax.swing.JMenuItem menuBrilloMas;
    private javax.swing.JMenuItem menuBrilloMenos;
    private javax.swing.JMenuItem menuClausura;
    private javax.swing.JMenuItem menuDilatacion;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenuItem menuErosion;
    private javax.swing.JMenuItem menuEsquinas;
    private javax.swing.JMenu menuFiltros;
    private javax.swing.JMenuItem menuGris;
    private javax.swing.JMenuItem menuGuardar;
    private javax.swing.JMenu menuHerramientas;
    private javax.swing.JMenu menuHistograma;
    private javax.swing.JMenuItem menuLaplaciano;
    private javax.swing.JMenu menuLogico;
    private javax.swing.JMenuItem menuMaximo;
    private javax.swing.JMenuItem menuMedia;
    private javax.swing.JMenuItem menuMinimo;
    private javax.swing.JMenuItem menuMixto;
    private javax.swing.JMenuItem menuModa;
    private javax.swing.JMenu menuMorfologia;
    private javax.swing.JMenuItem menuNegativo;
    private javax.swing.JMenuItem menuNot;
    private javax.swing.JMenuItem menuOpeUmbral;
    private javax.swing.JMenu menuOperacion;
    private javax.swing.JMenuItem menuOr;
    private javax.swing.JMenu menuOrden;
    private javax.swing.JMenuItem menuOriginal;
    private javax.swing.JMenu menuPasaAltas;
    private javax.swing.JMenu menuPasaBajas;
    private javax.swing.JMenuItem menuPrewitt;
    private javax.swing.JMenuItem menuPromedio;
    private javax.swing.JMenuItem menuPromedioPesado;
    private javax.swing.JMenuItem menuReiniciar;
    private javax.swing.JMenuItem menuRobert;
    private javax.swing.JMenuItem menuRotar;
    private javax.swing.JMenu menuRuido;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenuItem menuSobel;
    private javax.swing.JMenuItem menuSubs;
    private javax.swing.JMenuItem menuSustractivo;
    private javax.swing.JMenu menuTransformaciones;
    private javax.swing.JMenuItem menuVerHistograma;
    private javax.swing.JMenuItem menuXor;
    private javax.swing.JMenuItem nuevo;
    private javax.swing.JCheckBoxMenuItem otraVentana;
    private javax.swing.JPopupMenu.Separator separadorRuido;
    // End of variables declaration//GEN-END:variables

    private Imagen selected(JDesktopPane escritorio) {
        WindowInternal selectedFrame = (WindowInternal) escritorio.getSelectedFrame();
        return imagenes.get(selectedFrame.getIdWindowInternal());
    }
}
