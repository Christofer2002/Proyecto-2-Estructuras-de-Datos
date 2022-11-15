package arbol.presentation.arbolBinario;

import java.awt.*;
import java.util.List;

public class Model extends java.util.Observable {

    public DrawTree getArbol() {
        return arbol;
    }

    public void setArbol(DrawTree arbol) {
        this.arbol = arbol;
    }

    DrawTree arbol;

    public double getAltura() {
        return altura;
    }

    double altura = 15;


    double angulo = -90;

    public List<Color> getColor() {
        return color;
    }

    public void setColor(List<Color> color) {
        this.color = color;
    }

    List<Color> color;

    public double getMoverRamas() {
        return moverRamas;
    }

    public void setMoverRamas(double moverRamas) {
        this.moverRamas = moverRamas;
    }

    private double moverRamas;

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

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setAngulo(int angulo) {
        this.angulo = angulo;
    }

    public double getAngulo() {
        return angulo;
    }
}
