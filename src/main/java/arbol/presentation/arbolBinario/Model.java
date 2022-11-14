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

    public double getAltura() {
        return altura;
    }

    double altura = 15;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    double angulo = -90;

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
