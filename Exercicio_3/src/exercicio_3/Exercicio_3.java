/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Neto Barboza
 */
public class Exercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num = 0;

        Double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o o valor dividendo:"));
        Double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor divisor:"));

        while (n1 > 1) { //Enquanto o valor dividendo ser maior que 1
            n1 = n1 - n2; //Subtrario o dividendo pelo divisor
            num++;// uso o contador para fazer o resultado.
            System.out.println(num);
            System.out.println("div:"+n1);
            System.out.println("dividen"+n2);
        }        
        JOptionPane.showMessageDialog(null,"O resultado da divisão é:"+ num);
        System.out.println("O resultado da divisão é: " + num);
    }

}
