/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esix;

/**
 *
 * @author macbook
 */
import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public abstract class AbstractModeleEcoutable {
    private ArrayList<EcouteurModele> ecouteurs;
    public AbstractModeleEcoutable(){
    ecouteurs=new ArrayList<>();
    }
    public void ajoutEcouteur(EcouteurModele e){
    ecouteurs.add(e);
    
    }
    
    protected void fireChangement(){
        for(EcouteurModele e :ecouteurs){
            e.changementModele(this);
        }
    }
}

