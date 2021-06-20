/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas_beyoud;

/**
 *
 * @author macbook
 */
import esix.EcouteurModele;
public class Cadenas_BEYOUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Cadenas cad= new Cadenas(3,2,4,7);
    
     cad.ajoutEcouteur(new EcouteurModele() {
        @Override
        public void changementModele(Object source) {
            System.out.println(cad); //To change body of generated methods, choose Tools | Templates.
        }
        
    });
     new CadenasGUI(cad);
    
    
  
    }
    
}
