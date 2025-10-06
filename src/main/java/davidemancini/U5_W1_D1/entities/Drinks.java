package davidemancini.U5_W1_D1.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Drinks extends Menu{

    public Drinks(String nome, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
    }

    @Override
    public String toString() {
        return String.format("\n"+"%-20s | %5d kcal | %6.2f €" +"\n",Colori.GREEN+nome,calorie,prezzo);
    }
}
