package davidemancini.U5_W1_D1.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class Ordine {

    private static int contatoreOrdini = 1;

    private int numeroOrdine;
    private StatoOrdine statoOrdine;
    private int numeroCoperti;
    private LocalTime oraAcquisizione;
    private Tavolo tavolo;
    private double costoCoperto;
    private List<ProdottoMenu> prodottiMenu = new ArrayList<>();

    public Ordine(List<ProdottoMenu> listaDiProdotti,StatoOrdine statoOrdine, int numeroCoperti, Tavolo tavolo, double costoCoperto) {
        this.prodottiMenu=listaDiProdotti;
        this.numeroOrdine = contatoreOrdini++;
        this.statoOrdine = statoOrdine;
        this.numeroCoperti = numeroCoperti;
        this.tavolo = tavolo;
        this.costoCoperto = costoCoperto;
        this.oraAcquisizione = LocalTime.now();
    }

    public void aggiungiProdotto(ProdottoMenu prodotto) {
        prodottiMenu.add(prodotto);
    }

    public double calcolaTotale() {
        double totale = numeroCoperti * costoCoperto;
        for (ProdottoMenu prodotto : prodottiMenu) {
            totale += prodotto.getPizza().getPrezzo();
        }
        return totale;
    }

    public static int getContatoreOrdini() {
        return contatoreOrdini;
    }

    public static void setContatoreOrdini(int contatoreOrdini) {
        Ordine.contatoreOrdini = contatoreOrdini;
    }

    public int getNumeroOrdine() {
        return numeroOrdine;
    }

    public void setNumeroOrdine(int numeroOrdine) {
        this.numeroOrdine = numeroOrdine;
    }

    public StatoOrdine getStatoOrdine() {
        return statoOrdine;
    }

    public void setStatoOrdine(StatoOrdine statoOrdine) {
        this.statoOrdine = statoOrdine;
    }

    public int getNumeroCoperti() {
        return numeroCoperti;
    }

    public void setNumeroCoperti(int numeroCoperti) {
        this.numeroCoperti = numeroCoperti;
    }

    public LocalTime getOraAcquisizione() {
        return oraAcquisizione;
    }

    public void setOraAcquisizione(LocalTime oraAcquisizione) {
        this.oraAcquisizione = oraAcquisizione;
    }

    public Tavolo getTavolo() {
        return tavolo;
    }

    public void setTavolo(Tavolo tavolo) {
        this.tavolo = tavolo;
    }

    public double getCostoCoperto() {
        return costoCoperto;
    }

    public void setCostoCoperto(double costoCoperto) {
        this.costoCoperto = costoCoperto;
    }

    public List<ProdottoMenu> getProdottiMenu() {
        return prodottiMenu;
    }

    public void setProdottiMenu(List<ProdottoMenu> prodottiMenu) {
        this.prodottiMenu = prodottiMenu;
    }

    @Override
    public String toString() {
        return "Ordine #" + numeroOrdine +
                "Stato: " + statoOrdine +
                "Tavolo: " + tavolo +
                "Coperti: " + numeroCoperti +
                "Ora: " + oraAcquisizione +
                "Prodotti: " + prodottiMenu +
                "Totale: €" + calcolaTotale();
    }
}
