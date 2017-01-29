package com.mx.app.adi.model.components;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Deslizador {

    private static JFrame parent;
    private static JOptionPane optionPane;
    private static JSlider slider;
    private static int valorMaximo;
    private static int valorIntervalo;

    public static int obtener(String titulo, String mensaje, int valorIntervalo, int valorMaximo) {
        Deslizador.valorMaximo = valorMaximo;
        Deslizador.valorIntervalo = valorIntervalo;
        parent = new JFrame();
        optionPane = new JOptionPane();
        slider = getSlider(mensaje);
        optionPane.setMessage(new Object[]{mensaje, slider});
        optionPane.setMessageType(JOptionPane.QUESTION_MESSAGE);
        optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
        JDialog dialog = optionPane.createDialog(parent, titulo);
        dialog.setVisible(true);
        Object rx = optionPane.getInputValue();
        dialog.dispose();
        parent.dispose();
        return (rx instanceof String)? 0: (int)rx;
    }

    private static JSlider getSlider(final String mensaje) {
        slider = new JSlider();
        slider.setMajorTickSpacing(valorIntervalo);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMaximum(valorMaximo);
        slider.setValue(0);
        ChangeListener changeListener = new ChangeListener() {
            public void stateChanged(ChangeEvent changeEvent) {
                JSlider theSlider = (JSlider) changeEvent.getSource();
                if (!theSlider.getValueIsAdjusting()) {
                    optionPane.setInputValue(new Integer(theSlider.getValue()));
                    optionPane.setMessage(new Object[]{mensaje + theSlider.getValue(), slider});
                }
            }
        };
        slider.addChangeListener(changeListener);
        return slider;
    }
}
