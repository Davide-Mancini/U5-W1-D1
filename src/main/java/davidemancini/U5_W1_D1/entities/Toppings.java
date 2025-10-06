package davidemancini.U5_W1_D1.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter

public class Toppings extends Menu{
    public Toppings(String nome, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
    }

    @Override
    public String toString() {
        return String.format("\n"+"%-20s | %5d kcal | %6.2f €" +"\n",Colori.BLUE+nome,calorie,prezzo);
    }
}
