package arbol.presentation.arbolBinario;

public class Model extends java.util.Observable {
    public void addObserver(java.util.Observer o) {
        super.addObserver(o);
        this.commit();
    }

    public void commit(){
        this.setChanged();
        this.notifyObservers();
    }
}
