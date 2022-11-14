package arbol.presentation.arbolBinario;

import javax.swing.*;
import java.awt.*;

public class DrawTree extends JPanel {
    private int puntoInicialX;
    private int puntoInicialY;
    private int angulo;
    private int profundidad;
    private Color color;

    private double altura;

    public DrawTree(int puntoInicialX, int puntoInicialY, Color color, int angulo , int profundidad, double altura) {
        this.puntoInicialX = puntoInicialX;
        this.puntoInicialY = puntoInicialY;
        this.color = color;
        this.angulo = angulo;
        this.profundidad = profundidad;
        this.altura = altura;
    }

    public DrawTree(){
        this.puntoInicialX = 0;
        this.puntoInicialY = 0;
        this.color = Color.GREEN;
        this.angulo = 0;
        this.profundidad = 0;
        this.altura = 5;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        drawTreeRecursive(g2D, puntoInicialX, puntoInicialY, angulo, profundidad);
    }
    public void drawTreeRecursive(Graphics2D g, int puntoInicialX, int puntoInicialY, int angulo, int profundidad){
        if(profundidad == 0) return;
        g.setColor(color);
        g.setStroke(new BasicStroke(1.5f));
        int x2 = puntoInicialX + (int) (Math.cos(Math.toRadians(angulo)) * profundidad * altura);
        int y2 = puntoInicialY + (int) (Math.sin(Math.toRadians(angulo)) * profundidad * altura);
        g.drawLine(puntoInicialX, puntoInicialY, x2, y2);
        drawTreeRecursive(g, x2, y2, angulo - 20, profundidad - 1);
        drawTreeRecursive(g, x2, y2, angulo, profundidad - 1);
        drawTreeRecursive(g, x2, y2, angulo + 20, profundidad - 1);
    }
}
