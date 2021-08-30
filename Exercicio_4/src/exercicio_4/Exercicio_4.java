/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Neto Barboza
 */
public class Exercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2,res =0;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor multiplicado: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor multiplicador: "));
        
        for(int x = 1; x <= n2 ; x++){
            //System.out.println(x);
            res +=n1;
        }
        JOptionPane.showMessageDialog(null,"O resultado da multiplação de " +n1+ " por "+n2+ " é: "+res);
        System.out.println("resultado: " +res);
                
    }
    
}
