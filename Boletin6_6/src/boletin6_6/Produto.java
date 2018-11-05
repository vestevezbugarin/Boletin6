package boletin6_6;

import javax.swing.JOptionPane;

public class Produto {

    private String nome;
    private int cantidade;
    private String tipoConsumo;

    public Produto() {
    }

    public Produto(String nome, int cantidade, String tipoConsumo) {
        this.nome = nome;
        this.cantidade = cantidade;
        this.tipoConsumo = tipoConsumo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCantidade() {
        return cantidade;
    }

    public void setCantidade(int cantidade) {
        this.cantidade = cantidade;
    }

    public String getTipoConsumo() {
        return tipoConsumo;
    }

    public void setTipoConsumo(String tipoConsumo) {
        this.tipoConsumo = tipoConsumo;
    }

    public void clasificar() {
        if (cantidade < 100) {
            JOptionPane.showMessageDialog(null, " Artigo de consumo baixo. ");
            this.tipoConsumo = "baixo";
        } else if (cantidade <= 500) {
            JOptionPane.showMessageDialog(null, " Artigo de consumo medio. ");
             this.tipoConsumo = "medio";
        } else if (cantidade <= 1000) {
            JOptionPane.showMessageDialog(null, " Artigo de consumo alto ");
             this.tipoConsumo = "alto";
        } else if (cantidade > 1000) {
            JOptionPane.showMessageDialog(null, " Artigo de primeira necesidade ");
             this.tipoConsumo = "Primeira Necesidade";
        } else {
            JOptionPane.showMessageDialog(null, " Cantidade non válida ");
        }

//        return tipoConsumo;
    }

}
