package arbol.presentation.principal;

import javax.swing.*;
import java.util.Observable;

public class View implements java.util.Observer {
    private JTabbedPane tabbedPane;
    Controller controller;
    Model model;
    private JPanel panel;

    public View() {

    }

    public JTabbedPane getPanel() {
        return tabbedPane;
    }


    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void setModel(Model model) {
        this.model = model;
        model.addObserver(this);
    }

    @Override
    public void update(Observable updatedModel, Object parametros) {

    }
}
