package boletin6_4;

import javax.swing.JOptionPane;

public class Boletin6_4 {

    /**
     * Coñecidos o nome e o peso de dúas persoas, queremos escribir os datos da
     * que pesa máis e, a diferenza de peso entre elas .
     *
     * @param args
     */
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog(null, "Introduce o nome da persoa 1:");
        float peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce o peso da persoa 1:"));

        Persoa persoa1 = new Persoa(nome, peso);

        String nome2 = JOptionPane.showInputDialog(null, "Introduce o nome da persoa 2:");
        float peso2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce o peso da persoa 2:"));

        Persoa persoa2 = new Persoa(nome2, peso2);
        
        persoa1.calcularPeso(persoa2);

    }

}
