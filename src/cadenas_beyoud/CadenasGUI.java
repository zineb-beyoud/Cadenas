/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas_beyoud;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author macbook
 */
public class CadenasGUI extends JFrame implements ActionListener{
    private Cadenas c;
     private JButton plus,moins;
    public CadenasGUI(Cadenas c) {
        super("Cadenas");
        this.c=c;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp=this.getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(new VueCadenas(c),BorderLayout.CENTER);
        
        plus= new JButton("+");
        cp.add(plus,BorderLayout.EAST);
        plus.addActionListener(this);
        
        moins= new JButton("-");
        cp.add(moins,BorderLayout.WEST);
        moins.addActionListener(this);
        pack();
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
        
        
    }
    
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==plus){
                int chiffre1=c.getChiffre(1);
                int chiffre2=c.getChiffre(2);
                int chiffre3=c.getChiffre(3);
                int chiffre4=c.getChiffre(4);
                if(chiffre1<9)  {
                c.setChiffre(1,chiffre1++);
                System.out.print(chiffre1);
                } 
                else if(chiffre1==9){
                    c.setChiffre(1,0);
                    if(chiffre2<9){
                    c.setChiffre(2,chiffre2++);}
                    else {
                        c.setChiffre(2,0);
                        if(chiffre3<9){
                        c.setChiffre(3,chiffre3++);}
                        else{
                        c.setChiffre(3,0);
                        if(chiffre4<9)
                        c.setChiffre(4,chiffre4++);
                        else c.setChiffre(4,0);
                        }
                        
                    }
                   
                }}
                
       if(e.getSource()==moins){
           
           int chiffre1=c.getChiffre(1);
                int chiffre2=c.getChiffre(2);
                int chiffre3=c.getChiffre(3);
                int chiffre4=c.getChiffre(4);
                if(chiffre1>0)  {
                c.setChiffre(1,chiffre1--);
                } 
                else if(chiffre1==0){
                    c.setChiffre(1,0);
                    if(chiffre2>0){
                    c.setChiffre(2,chiffre2--);}
                    else {
                        c.setChiffre(2,0);
                        if(chiffre3>0){
                        c.setChiffre(3,chiffre3--);}
                        else{
                        c.setChiffre(3,0);
                        if(chiffre4>0)
                        c.setChiffre(4,chiffre4--);
                        else c.setChiffre(4,0);
                        }
                        
                    }
                }
           
           
                    }
    }
    
}
