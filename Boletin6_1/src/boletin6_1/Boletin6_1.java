package boletin6_1;

import javax.swing.*;

public class Boletin6_1 {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte un numero para comprobar se é positivo:"));
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O número é negativo!", "Negativo", 2);
        } else {
            JOptionPane.showMessageDialog(null, "O número é positivo!", "Positivo", 1);

        }
    }

}
