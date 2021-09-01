/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_10;

import javax.swing.JOptionPane;

/**
 *
 * @author Neto Barboza
 */
public class Exercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 0;
        int fat = 1;
         n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
        for (int i = n1; i >= 1; i--) {
            fat = (fat * i);            
        }
        System.out.println("O valor fatorial de: "+n1+", é: " +fat);
        JOptionPane.showMessageDialog(null,"O valor fatorial de: "+n1+", é: " +fat);
    }

}
