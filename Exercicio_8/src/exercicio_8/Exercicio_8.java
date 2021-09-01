/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_8;

import javax.swing.JOptionPane;

/**
 *
 * @author Neto Barboza
 */
public class Exercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here.
        int aux = 1;
        int res = 0;
        Integer n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o o valor dividendo:"));
        
        while (aux <= n1){
            
            res +=aux;
            
            aux++;
        }
        
        JOptionPane.showMessageDialog(null,"O resultado da soma de todos os números inteiros até " +n1+" é: "+res);
        
        
    }    
}
