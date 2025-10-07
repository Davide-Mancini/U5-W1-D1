package davidemancini.U5_W1_D1.entities;

public class Tavolo {
    int numeroTavolo;
    int numMaxCoperti;
    StatoTavolo statoTavolo;

    public Tavolo(int numeroTavolo, int numMaxCoperti, StatoTavolo statoTavolo) {
        this.numeroTavolo = numeroTavolo;
        this.numMaxCoperti = numMaxCoperti;
        this.statoTavolo = statoTavolo;
    }

    public int getNumeroTavolo() {
        return numeroTavolo;
    }

    public void setNumeroTavolo(int numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }

    public int getNumMaxCoperti() {
        return numMaxCoperti;
    }

    public void setNumMaxCoperti(int numMaxCoperti) {
        this.numMaxCoperti = numMaxCoperti;
    }

    public StatoTavolo getStatoTavolo() {
        return statoTavolo;
    }

    public void setStatoTavolo(StatoTavolo statoTavolo) {
        this.statoTavolo = statoTavolo;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "numeroTavolo=" + numeroTavolo +
                ", numMaxCoperti=" + numMaxCoperti +
                ", statoTavolo=" + statoTavolo +
                '}';
    }
}
