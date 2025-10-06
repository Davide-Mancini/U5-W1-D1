package davidemancini.U5_W1_D1.entities;

import java.util.List;

public class MenuDaStampare {
    private List<Pizze> pizzeList;
    private List<Toppings> toppingsList;
    private List<Drinks> drinksList;

    public MenuDaStampare(List<Pizze> pizzeList, List<Toppings> toppingsList, List<Drinks> drinksList) {
        this.pizzeList = pizzeList;
        this.toppingsList = toppingsList;
        this.drinksList = drinksList;
    }

    @Override
    public String toString() {
        return "\n" +
                "LE NOSTRE PIZZE:" + pizzeList +"\n"+
                "AGGIUNGI TOPPING:" + toppingsList +"\n"+
                "LISTA DEI DRINK:" + drinksList +
                '}';
    }
}
