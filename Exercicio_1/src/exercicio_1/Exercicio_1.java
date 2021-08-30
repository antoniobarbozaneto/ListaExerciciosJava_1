/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Neto Barboza
 */
public class Exercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double r = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio:"));
        Double area = Math.PI * Math.pow(r, 2); //Raio elevado ao quadrado
        Double comprimento = 2* Math.PI * r;
        //
        DecimalFormat fmt = new DecimalFormat("0.00");
        String areaformatada = fmt.format(area);
        //
        JOptionPane.showMessageDialog(null," Area: " +areaformatada+ ", Comprimento " + comprimento);
        
                
    }
    
}
