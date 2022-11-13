package arbol.presentation.arbolBinario;

public class Model extends java.util.Observable {

    public DrawTree getArbol() {
        return arbol;
    }

    public void setArbol(DrawTree arbol) {
        this.arbol = arbol;
    }

    DrawTree arbol;

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
