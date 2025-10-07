package davidemancini.U5_W1_D1.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalTime;


public class Ordine {
    @Autowired
    MenuDaStampare menu;
    int numeroOrdine;
    StatoOrdine statoOrdine;
    int numeroCoperti;
    LocalTime oraAcquisizione;
    double importoTotale;
    @Autowired
    Tavolo tavolo;

    public Ordine( int numeroOrdine, StatoOrdine statoOrdine, int numeroCoperti, LocalTime oraAcquisizione, double importoTotale, Tavolo tavolo) {

        this.numeroOrdine = numeroOrdine;
        this.statoOrdine = statoOrdine;
        this.numeroCoperti = numeroCoperti;
        this.oraAcquisizione = oraAcquisizione;
        this.importoTotale = importoTotale;
        this.tavolo = tavolo;
    }
}
