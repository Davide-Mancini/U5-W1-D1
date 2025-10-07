package davidemancini.U5_W1_D1;

import davidemancini.U5_W1_D1.entities.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class ConfigClass {


    //-------------------------------TOPPINGS--------------------------------------
    @Bean
    public Toppings vuoto(){
        return new Toppings(" ",0,0);
    }
    @Bean
    public Toppings prosciutto(){
        return new Toppings("prosciutto",92,0.69);
    }
    @Bean
    public Toppings ananas(){
        return new Toppings("ananas",24,0.79);
    }
    @Bean(name = "prova")
    public Toppings salami(){
        return new Toppings("salami",86,0.99);
    }
    @Bean
    public Toppings onions(){
        return new Toppings("onions",22,0.69);
    }
    @Bean
    public Toppings cheese(){
        return new Toppings("cheese",92,0.69);
    }


    //-------------------------------PIZZE--------------------------------------
    @Bean(name = "pizzaMargherita")
    public Pizze pizzaMargherita(Toppings vuoto){
        List<Toppings>toppingsList=new ArrayList<>();
        toppingsList.add(vuoto);
        return new Pizze("Margherita",toppingsList,1048,4.99);
    }
    @Bean(name = "hawaiana")
    public Pizze pizzaHawaiian(Toppings prosciutto, Toppings ananas){
        List<Toppings> toppingsList = new ArrayList<>();
        toppingsList.add(prosciutto);
        toppingsList.add(ananas);
        return new Pizze("Hawaiana ",toppingsList,1048,4.99);
    }
    @Bean(name = "salamiPizza")
    public Pizze pizzaSalami (Toppings prova){
        List<Toppings> toppingsList = new ArrayList<>();
        toppingsList.add(prova);
        return new Pizze("Salami", toppingsList, 1160, 5.99);

    }

    //-------------------------------DRINKS--------------------------------------
    @Bean
    public Drinks lemonade (){
        return new Drinks("lemonade",128,1.29);
    }
    @Bean
    public Drinks water (){
        return new Drinks("water",0,1.29);
    }
    @Bean
    public Drinks wine (){
        return new Drinks("wine",607,7.49);
    }

    @Bean(name = "menuDaStampare")
    public MenuDaStampare menuDaStampare(Pizze pizzaMargherita,Pizze hawaiana,Pizze salamiPizza,Toppings prosciutto,Toppings ananas, Toppings prova, Toppings onions, Drinks lemonade,Drinks water, Drinks wine ){
        List<Pizze>pizzeList= new ArrayList<>();
        List<Toppings>toppingsList= new ArrayList<>();
        List<Drinks>drinksList= new ArrayList<>();
        pizzeList.add(pizzaMargherita);
        pizzeList.add(hawaiana);
        pizzeList.add(salamiPizza);
        toppingsList.add(prosciutto);
        toppingsList.add(ananas);
        toppingsList.add(prova);
        toppingsList.add(onions);
        drinksList.add(lemonade);
        drinksList.add(wine);
        drinksList.add(water);
        return new MenuDaStampare(pizzeList,toppingsList,drinksList);
    }
    @Value("${coperto.costo}")
   private double costoCoperto;

    @Bean
    public double getCostoCoperto(){
        return costoCoperto;
    }
    @Bean
    public Tavolo tavolo1 (){
        return new Tavolo(1,4,StatoTavolo.OCCUPATO);
    }
    @Bean
    public Ordine ordine1 (@Qualifier("tavolo1") Tavolo tavolo1,@Value("${coperto.costo}") double costoCoperto){
        return new Ordine(StatoOrdine.INCORSO,4,tavolo1,costoCoperto);
    }


}
