package boletin6_6;

import javax.swing.JOptionPane;

public class Boletin6_6 {

    public static void main(String[] args) {

        Produto articulo = new Produto();

        articulo.setNome(JOptionPane.showInputDialog("Inserta o nome do articulo:"));

        articulo.setCantidade(Integer.parseInt(JOptionPane.showInputDialog("Inserta numero de ventas anuais do articulo:")));

        articulo.clasificar();
    }

}
