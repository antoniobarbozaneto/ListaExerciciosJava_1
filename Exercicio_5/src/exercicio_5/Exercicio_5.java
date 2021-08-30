/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_5;

import javax.swing.JOptionPane;

/**
 *
 * @author Neto Barboza
 */
public class Exercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor multiplicado: "));
        
        
        if(n1 > 30){
            JOptionPane.showMessageDialog(null,"O valor: "+n1+", é maior que 30");
        }
        else
        {
            if(n1 < 20){
                JOptionPane.showMessageDialog(null,"O valor: "+n1+", é menor que 20");
            }
            else{
                JOptionPane.showMessageDialog(null,"O valor: "+n1+", está entre 20 e 30");
            }
        }
    }
    
}
