package boletin6_2;

import javax.swing.JOptionPane;

public class Boletin6_2 {

    /**
     * Implementa un programa no que se tecleen dous números de tipo short . Se
     * o primeiro é maior ou igual que o segundo, visualizaremos a resta . En
     * calquera caso visualizaremos a suma .
     *
     * @param args
     */
    public static void main(String[] args) {

        short num1 = Short.parseShort(JOptionPane.showInputDialog(null, "Inserta o primeiro valor:"));
        short num2 = Short.parseShort(JOptionPane.showInputDialog(null, "Inserta o segundo valor:"));

        if (num1 >= num2) {
            JOptionPane.showMessageDialog(null, "A resta de " + num1 + " menos " + num2 + " é igual a : " + (num1 - num2));
        } else {
            JOptionPane.showMessageDialog(null, "A suma de " + num1 + " menos " + num2 + " é igual a : " + (num1 + num2));

        }

    }

}
