/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_12;

import javax.swing.JOptionPane;

/**
 *
 * @author Neto Barboza
 */
public class Exercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double total_gasto;
        Double media_gasto;

        Double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor gasto no primeiro mês:"));
        Double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor gasto no segundo mês:"));
        Double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor gasto no terceiro mês:"));

        total_gasto = n1 + n2 + n3;
        media_gasto = (n1 + n2 + n3 / 3);

        if (n1 > n2 && n1 > n3) {
            JOptionPane.showMessageDialog(null, "O total gasto no trimestre foi de: " + total_gasto
                    + "\n a media gasto do trimestre foi de: " + media_gasto + "\n e o maior gasto foi no 1º mês no valor de: " + n1);
            System.out.println("n1 é o maior valor gasto: ");
        } else {
            if (n2 > n1 && n2 > n3) {
                JOptionPane.showMessageDialog(null, "O total gasto no trimestre foi de: " + total_gasto
                        + " a media gasto do trimestre foi de: " + media_gasto + "\n e o maior gasto foi no 2º mês no valor de: " + n1);
                System.out.println("n2 é o maior valor gasto: ");
            } else {
                if (n3 > n1 && n3 > n2) {
                    JOptionPane.showMessageDialog(null, "O total gasto no trimestre foi de: " + total_gasto
                            + "\n a media gasto do trimestre foi de: " + media_gasto + "\n e o maior gasto foi no 3º mês no valor de: " + n1);
                    System.out.println("n3 é o maior valor gasto: ");
                }
            }
        }

    }

}
