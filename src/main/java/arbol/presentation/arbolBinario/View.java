package arbol.presentation.arbolBinario;

import javax.swing.*;
import java.util.Observable;

public class View implements java.util.Observer {
    Controller controller;
    Model model;
    private JPanel panel;
    private JSlider slider1;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void setModel(Model model) {
        this.model = model;
        model.addObserver(this);
    }

    public JPanel getPanel() {
        return panel;
    }

    public View() {

    }

    @Override
    public void update(Observable observable, Object o) {

    }
}
