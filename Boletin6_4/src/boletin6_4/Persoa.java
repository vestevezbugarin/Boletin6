package boletin6_4;

import javax.swing.JOptionPane;

public class Persoa {

    private String nome;
    private float peso;

    //Constructors
    public Persoa() {
    }

    public Persoa(String nome, float peso) {
        this.nome = nome;
        this.peso = peso;
    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    // Methods
    public void calcularPeso(Persoa individuo2) {
        if (this.peso > individuo2.getPeso()) {
            JOptionPane.showMessageDialog(null, "Nome: " + this.nome + "\n Peso: " + this.peso + ""
                    + "\n     " + this.nome + " pesa " + (this.peso - individuo2.getPeso()) + " kg máis que " + individuo2.getNome());
        } else {
            JOptionPane.showMessageDialog(null, "Nome: " + individuo2.getNome() + "\n Peso: " + individuo2.getPeso() + ""
                    + "\n     " + individuo2.getNome() + " pesa " + (individuo2.getPeso() - this.peso) + " kg máis que " + this.nome);

        }

    }
}
