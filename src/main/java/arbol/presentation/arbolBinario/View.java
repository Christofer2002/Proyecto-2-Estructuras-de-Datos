package arbol.presentation.arbolBinario;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.List;
import java.util.Observable;

public class View implements java.util.Observer {
    Controller controller;
    Model model;
    private JPanel panel;
    private JSpinner spinnerNiveles;
    private JPanel panelArbol;
    private JLabel colores;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JSlider slider1;

    public void setController(Controller controller) {
        this.controller = controller;
        controller.drawTree((int) spinnerNiveles.getValue());
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
                controller.drawTree((int) spinnerNiveles.getValue());
                controller.commit();
            }
        };

        spinnerNiveles.addChangeListener(listener);
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
