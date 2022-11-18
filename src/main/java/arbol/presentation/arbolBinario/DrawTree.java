package arbol.presentation.arbolBinario;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DrawTree extends JPanel {
    private int puntoInicialX;
    private int puntoInicialY;
    private int angulo;
    private int profundidad;
    private List<Color> color;
    private boolean entro = false;
    private double moverRamas;

    private int anguloRamas = 15;

    private double altura;

    public DrawTree(int puntoInicialX, int puntoInicialY, List<Color> color, int angulo , int profundidad, double altura, double moverRamas, int anguloRamas) {
        this.puntoInicialX = puntoInicialX;
        this.puntoInicialY = puntoInicialY;
        this.color = color;
        this.angulo = angulo;
        this.profundidad = profundidad;
        this.altura = altura;
        this.moverRamas = moverRamas;
        this.anguloRamas = anguloRamas;
    }

    public DrawTree(){
        this.puntoInicialX = 0;
        this.puntoInicialY = 0;
        this.color = new ArrayList<>();
        this.angulo = 0;
        this.profundidad = 0;
        this.altura = 5;
        this.anguloRamas = 0;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        drawTreeRecursive(g2D, puntoInicialX, puntoInicialY, angulo, profundidad, 5.0, (int) moverRamas);
    }
    public void drawTreeRecursive(Graphics2D g, int puntoInicialX, int puntoInicialY, int angulo, int profundidad, double anchoRamas, int moverRamas){
        if(profundidad == 0) return;
        for (int i = 0; i < color.size(); i++) {
            if(i+1 == profundidad){
                g.setColor(color.get(i));
            }
        }

        if((profundidad == 1) && (!entro)){
            g.setStroke(new BasicStroke((float) anchoRamas));
            int x2 = puntoInicialX + (int) (Math.cos(Math.toRadians(angulo)) * profundidad * altura);
            int y2 = puntoInicialY + (int) (Math.sin(Math.toRadians(angulo)) * profundidad * altura );
            g.drawLine(puntoInicialX, puntoInicialY, x2, y2);
            entro = true;

        }else{
            g.setStroke(new BasicStroke((float) anchoRamas));
            int x2 = puntoInicialX + (int) (Math.cos(Math.toRadians(angulo)) * profundidad * altura + moverRamas);
            int y2 = puntoInicialY + (int) (Math.sin(Math.toRadians(angulo)) * profundidad * altura + moverRamas);
            g.drawLine(puntoInicialX, puntoInicialY, x2, y2);
            drawTreeRecursive(g, x2, y2, angulo - anguloRamas, profundidad - 1, anchoRamas - 0.6, moverRamas);
            drawTreeRecursive(g, x2, y2, angulo, profundidad - 1, anchoRamas - 0.6, moverRamas);
            drawTreeRecursive(g, x2, y2, angulo + anguloRamas, profundidad - 1, anchoRamas - 0.6, moverRamas);
        }

    }
}
