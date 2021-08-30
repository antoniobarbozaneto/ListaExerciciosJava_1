/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_6;

import javax.swing.JOptionPane;

/**
 *
 * @author Neto Barboza
 */
public class Exercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1,n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
        if(n1 == n2){
            JOptionPane.showMessageDialog(null,"o valor "+n1+" e "+n2+" são iguais!");
        }
        else{
            if(n1> n2){
                JOptionPane.showMessageDialog(null,"o primeiro valor: "+n1+" e maior que o segundo valor: "+n2);
            }else{
                JOptionPane.showMessageDialog(null,"o segundo valor: "+n2+" e maior que o primeiro valor: "+n1);
            }
        }
    }
    
}
