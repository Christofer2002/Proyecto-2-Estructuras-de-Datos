package arbol;


import javax.swing.*;
import arbol.presentation.principal.Controller;

public class Application {

    public static void main(String[] args) {
        try { UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");}
        catch (Exception ex) {};

        arbol.presentation.arbolBinario.View viewArbol = new arbol.presentation.arbolBinario.View();
        arbol.presentation.arbolBinario.Model modelArbol = new arbol.presentation.arbolBinario.Model();
        arbol.presentation.arbolBinario.Controller controllerArbol = new arbol.presentation.arbolBinario.Controller(viewArbol, modelArbol);
        ARBOL = controllerArbol;

        arbol.presentation.principal.View viewPrincipal = new arbol.presentation.principal.View();
        arbol.presentation.principal.Model modelPrincipal = new arbol.presentation.principal.Model();
        arbol.presentation.principal.Controller controllerPrincipal = new arbol.presentation.principal.Controller(viewPrincipal, modelPrincipal);
        PRINCIPAL = controllerPrincipal;

        viewPrincipal.getPanel().add("Arbol Binario",viewArbol.getPanel());

        window = new JFrame();
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setTitle("Arbol Binario");
        window.setVisible(true);

        PRINCIPAL.show();
    }

    public static JFrame window;

    public static arbol.presentation.principal.Controller PRINCIPAL;

    public static arbol.presentation.arbolBinario.Controller ARBOL;
}
