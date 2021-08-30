/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Neto Barboza
 */
public class Exercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o o valor dividendo:"));
        Double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor divisor:"));
        Double res = n1 % n2;
        JOptionPane.showMessageDialog(null,"O resto da divisão de "+ n1 + " por "+n2+" é: "+res);
        
    }
    
}
