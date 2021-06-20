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

import esix.AbstractModeleEcoutable;
import esix.EcouteurModele;
import javax.swing.JLabel;
public class VueCadenas extends JLabel implements EcouteurModele {
    Cadenas c;
    public VueCadenas(Cadenas c) {
        this.c=c;
        c.etatactuel(0,0,0,0);
        c.ajoutEcouteur(this);
    }
    

    @Override
    public void changementModele(Object source) {
       setText(" "+c); 
    }
    
}
