package arbol.presentation.arbolBinario;

import javax.swing.*;
import java.awt.*;

public class DrawTree extends JPanel {
    private int nivel;
    private final int comienzoX;
    private final int comienzoY;
    private int ancho;
    private final int finalX;
    private final int finalY;
    //Color
    private Color color;

    public DrawTree(int comienzoX, int comienzoY, int finalX, int finalY, int nivel, Color color) {
        this.comienzoX = comienzoX;
        this.comienzoY = comienzoY;
        this.finalX = finalX;
        this.finalY = finalY;
        this.nivel = nivel;
        this.color = color;
    }

    public DrawTree(){
        this.comienzoX = 0;
        this.comienzoY = 0;
        this.finalX = 0;
        this.finalY = 0;
        this.nivel = 0;
        this.color = Color.GREEN;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int finalNivelRama1X, finalNivelRama1Y, finalNivelRama2X, finalNivelRama2Y;
        g.setColor(color);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setStroke(new BasicStroke(4));
        if(nivel == 0){
            g2D.drawLine(comienzoX, comienzoY, finalX, finalY);
        }else if(nivel == 1) {
            g2D.drawLine(comienzoX, comienzoY, finalX, finalY);
            g2D.setStroke(new BasicStroke(2));
            g2D.drawLine(finalX, finalY, 200, 218);
            g2D.drawLine(finalX, finalY, comienzoX, 175);
            g2D.drawLine(finalX, finalY, 292, 219);
        }
    }
}
