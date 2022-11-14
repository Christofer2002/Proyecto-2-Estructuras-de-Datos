package arbol.presentation.arbolBinario;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class View implements java.util.Observer {
    Controller controller;
    Model model;
    private JPanel panel;

    private JSpinner spinnerNiveles;
    private JPanel panelArbol;
    private JLabel colores;
    private JButton btnColorNivel0;
    private JButton btnColorNivel1;
    private JButton btnColorNivel2;
    private JButton btnColorNivel3;
    private JSlider slider1;
    private JSlider sliderAngulo;
    private JSlider sliderAltura;
    private JButton btnColorNivel4;
    private JButton btnColorNivel5;
    private JButton btnColorNivel6;
    private JButton btnColorNivel7;

    DrawTree arbol;

    private JColorChooser colorChooser;
    List<Color> listColores;

    int pos = 0;

    private JPanel panelColor;

    public void setController(Controller controller) {
        this.controller = controller;
        listColores = new ArrayList<>();
        arbol = new DrawTree();
        controller.drawTree((int) spinnerNiveles.getValue(), arbol, listColores);
    }

    public void setModel(Model model) {
        this.model = model;
        model.addObserver(this);
    }

    public JPanel getPanel() {
        return panel;
    }

    public JPanel getPanelArbol() {
        return panelArbol;
    }

    public View() {
        initComponents();
          ChangeListener listener = new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                controller.drawTree((int) spinnerNiveles.getValue(), arbol, listColores);
                controller.commit();
            }
        };

        spinnerNiveles.addChangeListener(listener);
        sliderAngulo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                model.setAngulo(sliderAngulo.getValue());
            }
        });
        btnColorNivel0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorChooser = new JColorChooser();
                Color color = JColorChooser.showDialog(panelColor, "Seleccione un color", Color.BLACK);
                listColores.add(pos, color);
                if(listColores.size() < 8){
                    pos = pos + 1;
                }else{
                    pos = 0;
                }
                btnColorNivel0.setBackground(color);
                controller.drawTree((int) spinnerNiveles.getValue(), arbol, listColores);
                controller.commit();
            }
        });

        btnColorNivel1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorChooser = new JColorChooser();
                Color color = JColorChooser.showDialog(panelColor, "Seleccione un color", Color.BLACK);
                listColores.add(pos, color);
                if(listColores.size() < 8){
                    pos = pos + 1;
                }else{
                    pos = 0;
                }
                btnColorNivel1.setBackground(color);
                controller.drawTree((int) spinnerNiveles.getValue(), arbol, listColores);
                controller.commit();
            }
        });

        btnColorNivel2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorChooser = new JColorChooser();
                Color color = JColorChooser.showDialog(panelColor, "Seleccione un color", Color.BLACK);
                listColores.add(pos, color);
                if(listColores.size() < 8){
                    pos = pos + 1;
                }else{
                    pos = 0;
                }
                btnColorNivel2.setBackground(color);
                controller.drawTree((int) spinnerNiveles.getValue(), arbol, listColores);
                controller.commit();
            }
        });

        btnColorNivel3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorChooser = new JColorChooser();
                Color color = JColorChooser.showDialog(panelColor, "Seleccione un color", Color.BLACK);
                listColores.add(pos, color);
                if(listColores.size() < 8){
                    pos = pos + 1;
                }else{
                    pos = 0;
                }
                btnColorNivel3.setBackground(color);
                controller.drawTree((int) spinnerNiveles.getValue(), arbol, listColores);
                controller.commit();
            }
        });

        btnColorNivel4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorChooser = new JColorChooser();
                Color color = JColorChooser.showDialog(panelColor, "Seleccione un color", Color.BLACK);
                listColores.add(pos, color);
                if(listColores.size() < 8){
                    pos = pos + 1;
                }else{
                    pos = 0;
                }
                btnColorNivel4.setBackground(color);
                controller.drawTree((int) spinnerNiveles.getValue(), arbol, listColores);
                controller.commit();
            }
        });

        btnColorNivel5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorChooser = new JColorChooser();
                Color color = JColorChooser.showDialog(panelColor, "Seleccione un color", Color.BLACK);
                listColores.add(pos, color);
                if(listColores.size() < 8){
                    pos = pos + 1;
                }else{
                    pos = 0;
                }
                btnColorNivel5.setBackground(color);
                controller.drawTree((int) spinnerNiveles.getValue(), arbol, listColores);
                controller.commit();
            }
        });

        btnColorNivel6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorChooser = new JColorChooser();
                Color color = JColorChooser.showDialog(panelColor, "Seleccione un color", Color.BLACK);
                listColores.add(pos, color);
                if(listColores.size() < 8){
                    pos = pos + 1;
                }else{
                    pos = 0;
                }
                btnColorNivel6.setBackground(color);
                controller.drawTree((int) spinnerNiveles.getValue(), arbol, listColores);
                controller.commit();
            }
        });

        btnColorNivel7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorChooser = new JColorChooser();
                Color color = JColorChooser.showDialog(panelColor, "Seleccione un color", Color.BLACK);
                listColores.add(pos, color);
                if(listColores.size() < 8){
                    pos = pos + 1;
                }else{
                    pos = 0;
                }
                btnColorNivel7.setBackground(color);
                controller.drawTree((int) spinnerNiveles.getValue(), arbol, listColores);
                controller.commit();
            }
        });



        sliderAltura.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                model.setAltura(sliderAltura.getValue());
                controller.drawTree((int) spinnerNiveles.getValue(), arbol, listColores);
                controller.commit();
            }
        });

    }
    private void initComponents() {
        //SpinnerNiveles max 8
        spinnerNiveles.setModel(new SpinnerNumberModel(0, 0, 8, 1));
        panelArbol.setLayout(new BorderLayout());

    }

    @Override
    public void update(Observable observable, Object o) {
        if(model.getArbol() != null){
            panelArbol.add(model.getArbol(), BorderLayout.CENTER);
        }
        panel.revalidate();
    }
}
