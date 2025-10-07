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

    public Ordine(StatoOrdine statoOrdine, int numeroCoperti, Tavolo tavolo, double costoCoperto) {
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
            totale += prodotto.getPrezzo();
        }
        return totale;
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
