package davidemancini.U5_W1_D1;

import davidemancini.U5_W1_D1.entities.Colori;
import davidemancini.U5_W1_D1.entities.MenuDaStampare;
import davidemancini.U5_W1_D1.entities.Pizze;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W1D1Application {
	public static void main(String[] args) {
		SpringApplication.run(U5W1D1Application.class, args);
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D1Application.class);

        System.out.println(Colori.BG_BLACK+Colori.RED+" (   (       )   )     (   (             \n" +
                " )\\ ))\\ ) ( /(( /(     )\\ ))\\ )   (      \n" +
                "(()/(()/( )\\())\\())(  (()/(()/(   )\\     \n" +
                " /(_))(_)|(_)((_)\\ )\\  /(_))(_)|(((_)(   \n" +
                "(_))(_))  _((_)((_|(_)(_))(_))  )\\ _ )\\  \n" +
                "| _ \\_ _||_  /_  /| __| _ \\_ _| (_)_\\(_) \n" +
                "|  _/| |  / / / / | _||   /| |   / _ \\   \n" +
                "|_| |___|/___/___||___|_|_\\___| /_/ \\_\\  \n" +
                "                                         \n");
        MenuDaStampare menuDaStampare = ctx.getBean("menuDaStampare", MenuDaStampare.class);
        System.out.println(Colori.BG_BLACK+ Colori.RED+menuDaStampare);
	}
}
