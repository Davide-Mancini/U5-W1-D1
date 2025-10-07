package davidemancini.U5_W1_D1.entities;

public class ProdottoMenu {
    private String nome;
    private  double prezzo;

    public ProdottoMenu(double prezzo, String nome) {
        this.prezzo = prezzo;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "ProdottoMenu{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
