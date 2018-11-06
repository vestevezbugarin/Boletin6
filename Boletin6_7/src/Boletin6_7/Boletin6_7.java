package Boletin6_7;

import javax.swing.JOptionPane;

public class Boletin6_7 {

    public static void main(String[] args) {

        int opt;

        do {

            String[] options = {"Sair", "Rectangulo", "Triangulo", "Circulo", "Trapecio"};
            opt = JOptionPane.showOptionDialog(null, "Seleccione a forma desexada", ""
                    + "Calculadora de áreas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            switch (opt) {
                case 0:
                    JOptionPane.showMessageDialog(null, "¡Hasta luego... (ノ ಥ ウಥ )ノ  ");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Introduce os valores necesareos para realizar os calculos:", ""
                            + "Rectangulo / Cadrado", JOptionPane.INFORMATION_MESSAGE);
                    try {
                        float base = Float.parseFloat(JOptionPane.showInputDialog("Inserte la Base"));
                        float altura = Float.parseFloat(JOptionPane.showInputDialog("Inserte la Altura"));

                        Rectangulo rect1 = new Rectangulo(base, altura);

                        JOptionPane.showMessageDialog(null, "A area do Rectangulo é :" + rect1.calculo());
                    } catch (Exception e) {
                        System.out.println(e.getMessage()); //Saida por consola que non ten utilidade real
                    }
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Introduce os valores necesareos para realizar os calculos:", ""
                            + "Triangulo", JOptionPane.INFORMATION_MESSAGE);
                    try {
                        float baseT = Float.parseFloat(JOptionPane.showInputDialog("Inserte la Base"));
                        float alturaT = Float.parseFloat(JOptionPane.showInputDialog("Inserte la Altura"));

                        Triangulo tria1 = new Triangulo(baseT, alturaT);

                        JOptionPane.showMessageDialog(null, "A area do Triangulo é :" + tria1.calculo());
                    } catch (Exception e) {
                        System.out.println(e.getMessage()); //Saida por consola que non ten utilidade real
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Introduce os valores necesareos para realizar os calculos:", ""
                            + "Circulo", JOptionPane.INFORMATION_MESSAGE);
                    try {
                        float radio = Float.parseFloat(JOptionPane.showInputDialog("Inserte el Radio"));

                        Circulo circ1 = new Circulo(radio);

                        JOptionPane.showMessageDialog(null, "A area do Circulo é :" + circ1.calculo());
                    } catch (Exception e) {
                        System.out.println(e.getMessage()); //Saida por consola que non ten utilidade real
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Introduce os valores necesareos para realizar os calculos:", ""
                            + "Trapecio", JOptionPane.INFORMATION_MESSAGE);
                    try {
                        float baseMayor = Float.parseFloat(JOptionPane.showInputDialog("Inserte la Base Mayor"));
                        float baseMenor = Float.parseFloat(JOptionPane.showInputDialog("Inserte la Base Menor"));
                        float alto = Float.parseFloat(JOptionPane.showInputDialog("Inserte la Altura"));

                        Trapecio trap1 = new Trapecio(baseMayor, baseMenor, alto);

                        JOptionPane.showMessageDialog(null, "A area do Trapecio é :" + trap1.calculo());
                    } catch (Exception e) {
                        System.out.println(e.getMessage()); //Saida por consola que non ten utilidade real
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Esta opción non está contemplada. ");
                    break;

            }

        } while (opt != 0);

    }

}
