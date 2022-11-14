package arbol.presentation.arbolBinario;

import java.awt.*;

public class Model extends java.util.Observable {

    public DrawTree getArbol() {
        return arbol;
    }

    public void setArbol(DrawTree arbol) {
        this.arbol = arbol;
    }

    DrawTree arbol;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    Color color;

    public Model() {
        arbol = null;
    }
    public void addObserver(java.util.Observer o) {
        super.addObserver(o);
        this.commit();
    }

    public void commit(){
        this.setChanged();
        this.notifyObservers();
    }

}
