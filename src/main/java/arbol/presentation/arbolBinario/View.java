package arbol.presentation.arbolBinario;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;

public class View implements java.util.Observer {
    Controller controller;
    Model model;
    private JPanel panel;

    private JSpinner spinnerNiveles;
    private JPanel panelArbol;
    private JLabel colores;
    private JButton buttonColor1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JSlider slider1;
    private JSlider sliderAngulo;
    private JSlider sliderAltura;

    DrawTree arbol;

    private JColorChooser colorChooser;

    private JPanel panelColor;

    public void setController(Controller controller) {
        this.controller = controller;
        arbol = new DrawTree();
        controller.drawTree((int) spinnerNiveles.getValue(), arbol);
    }

    public void setModel(Model model) {
        this.model = model;
        model.addObserver(this);
    }

    public JPanel getPanel() {
        return panel;
    }

    public JPanel getPanelArbol() {
        return panelArbol;
    }

    public View() {
        initComponents();
          ChangeListener listener = new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                controller.drawTree((int) spinnerNiveles.getValue(), arbol);
                controller.commit();
            }
        };

        spinnerNiveles.addChangeListener(listener);
        sliderAngulo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                model.setAngulo(sliderAngulo.getValue());
            }
        });
        buttonColor1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorChooser = new JColorChooser();
                Color color = JColorChooser.showDialog(panelColor, "Seleccione un color", Color.BLACK);
                model.setColor(color);
                buttonColor1.setBackground(color);
                controller.drawTree((int) spinnerNiveles.getValue(), arbol);
                controller.commit();
            }
        });

        sliderAltura.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                model.setAltura(sliderAltura.getValue());
                controller.drawTree((int) spinnerNiveles.getValue(), arbol);
                controller.commit();
            }
        });

    }
    private void initComponents() {
        //SpinnerNiveles max 8
        spinnerNiveles.setModel(new SpinnerNumberModel(0, 0, 8, 1));
        panelArbol.setLayout(new BorderLayout());

    }

    @Override
    public void update(Observable observable, Object o) {
        if(model.getArbol() != null){
            panelArbol.add(model.getArbol(), BorderLayout.CENTER);
        }
        panel.revalidate();
    }
}
