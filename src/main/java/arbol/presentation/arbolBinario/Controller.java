package arbol.presentation.arbolBinario;

import java.awt.*;
import java.util.List;

public class Controller {
    private final View view;
    private final Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        view.setController(this);
        view.setModel(model);
    }

    public void drawTree(int value) {
        DrawTree arbol = new DrawTree();
        arbol = new DrawTree(250, 350, 250, 250, value, model.getColor());
        model.setArbol(arbol);
    }

    public void commit(){
        model.commit();
    }
}
