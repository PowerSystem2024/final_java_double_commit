
package desafiogymgrafico;

import gui.Principal;

public class DesafioGymGrafico {

    public static void main(String[] args) {
        
        // inicializo mi ventana principal y la hacemos visible
        Principal principal = new Principal();        
        principal.setVisible(true);
        principal.setTitle("Power Gym");
        principal.setLocationRelativeTo(null); // centramos en la pantalla
    }
    
}
