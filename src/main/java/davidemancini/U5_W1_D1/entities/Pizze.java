package davidemancini.U5_W1_D1.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter

public class Pizze extends Menu{
private String base;
private List<Toppings> toppings;
    public Pizze(String nome,List<Toppings> toppings, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
        this.base="tomato,cheese,";
        this.toppings=toppings;
    }

    @Override
    public String toString() {
        return String.format("\n"+"%-20s | %5d kcal | %6.2f €" +"\n",Colori.YELLOW+nome,calorie,prezzo);
    }
}
