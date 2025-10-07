package davidemancini.U5_W1_D1.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class Runner implements CommandLineRunner {
    @Autowired
    private MenuDaStampare menuDaStampare;
    @Autowired
    private Ordine ordine;
    @Autowired
    private Tavolo tavolo;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(menuDaStampare);
        System.out.println(ordine);
        System.out.println(tavolo);
    }
}
