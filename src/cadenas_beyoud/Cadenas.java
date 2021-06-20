/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas_beyoud;
import esix.AbstractModeleEcoutable;
import esix.EcouteurModele;
/**
 *
 * @author macbook
 */
public class Cadenas extends AbstractModeleEcoutable{
    private int i,j,k,l;
    protected int m,n,o,p;
    protected int etat=0;
    protected int c = 0;
    public Cadenas(int i, int j, int k, int l) {
        this.i=i;
        this.j=j;
        this.k=k;
        this.l=l;
    }
    
    public void etatactuel(int i, int j, int k, int l ){
        this.m=i;
        this.n=j;
        this.o=k;
        this.p=l;
              
        if(this.i==i && this.j==j && this.i==i && this.j==j)
            etat=1;//ouvert
        else 
            etat=0;//fermé
       
    
    }
    public void setChiffre(int rang, int valeur){
    if(rang==1){
        m=valeur;
        fireChangement();}
    if(rang==2){
        n=valeur;  
        fireChangement();}
    if(rang==3){
        o=valeur;
        fireChangement();}
    if(rang==4){
        p=valeur;   
        fireChangement();}
    }
    public int getChiffre(int rang){
       
     if(rang==1){
        c=m;}
    if(rang==2){
        c=n;   }
    if(rang==3){
        c=o;}
    if(rang==4){
        c=p;  }
    return c;
    
    }
    public boolean estOuvert(){
    boolean var=false;
    if(etat==1) var=true;
    else var=false;
    return var;
        
    }

    @Override
    public String toString() {
        return  " " + m +" "+ n+ " " + o+ " " + p + " ";
    }
    
     
}
