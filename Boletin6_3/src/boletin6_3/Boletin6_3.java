package boletin6_3;

import javax.swing.JOptionPane;

public class Boletin6_3 {

    /**
     * Teclear un número e sacar por consola o signo “ + “ se o nº é positivo, o
     * signo “ –“ se é negativo e “ 0 “ se é cero .
     *
     * @param args
     */
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte o numero a comprobar: "));

        if (numero == 0) {
            JOptionPane.showMessageDialog(null, " O número é 0 ");
        }
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, " + ");
        }
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, " - ");
        } else {
            System.out.println("Número non válido");
        }

    }

}
