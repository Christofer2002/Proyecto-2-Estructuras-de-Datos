package arbol;


import javax.swing.*;

import arbol.presentation.arbolBinario.DrawTree;
import arbol.presentation.arbolBinario.Model;
import arbol.presentation.arbolBinario.View;

public class Application {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");}
        catch (Exception ex) {};

        window = new JFrame();

        Model model= new Model();
        View view = new View();
        arbol.presentation.arbolBinario.Controller controller = new arbol.presentation.arbolBinario.Controller(view, model);
        window.setSize(750,500);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setTitle("Arbol Binario");

        window.setContentPane(view.getPanel());
        window.setVisible(true);
    }

    public static JFrame window;

}
