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

    public void drawTree(int profundidad, DrawTree arbol, List<Color> listColores) {
        model.setColor(listColores);
        arbol = new DrawTree(600, 700, model.getColor(), (int) model.getAngulo(), profundidad+1, model.getAltura(), model.getMoverRamas(), model.getAnguloRamas());
        model.setArbol(arbol);
    }

    public void commit(){
        model.commit();
    }
}
