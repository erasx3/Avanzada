package Controladora;

import Logica.Empresa;
import Visual.ControladoraVisual;
import Visual.MenuPrincipal;


public class Main {
    public static void main(String[] args)
    {
        ControladoraVisual unaControladora = new ControladoraVisual();
        MenuPrincipal miMenuPrincipal = new MenuPrincipal(unaControladora);
        miMenuPrincipal.show();
       
        
        
    }
}
