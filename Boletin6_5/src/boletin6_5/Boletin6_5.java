package boletin6_5;

import javax.swing.JOptionPane;

public class Boletin6_5 {

    /**
     * Dados 3 números que se supon distintos , indicar cal é o maior
     *
     * @param args
     */
    public static void main(String[] args) {
        int maior;
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Inserta o primeiro número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inserta o segundo número"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Inserta o terceiro número"));

        if (num1 > num2 && num1 > num3) {
            maior = num1;
        } else if (num3 > num2 && num3 > num1) {
            maior = num3;
        } else {
            maior = num2;
        }

        JOptionPane.showMessageDialog(null, " O maior é :" + maior);

    }

}
