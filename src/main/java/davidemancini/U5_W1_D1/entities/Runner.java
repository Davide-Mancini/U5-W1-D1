package davidemancini.U5_W1_D1.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private MenuDaStampare menuDaStampare;
    @Autowired
    private Ordine ordine1;
    @Autowired
    private Tavolo tavolo1;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(menuDaStampare);
        System.out.println(ordine1);
        System.out.println(tavolo1);
        System.out.println("totale:" + ordine1.calcolaTotale());
    }
}
