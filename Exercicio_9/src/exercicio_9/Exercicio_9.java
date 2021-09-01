/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_9;

import javax.swing.JOptionPane;

/**
 *
 * @author Neto Barboza
 */
public class Exercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aux = 0;
        Double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));

        if ((n1 % 5) == 0) {
            System.out.println("o número informado "+n1+" é multiplo por 5!");

            while (aux <= n1) {
                if (aux % 5 == 0) {
                    System.out.println(aux + " é multiplo de 5");
                } else {
                    System.out.println(aux + " não é multiplo de 5");
                }
                aux++;
            }
        } else {
            return;
        }
    }

}
