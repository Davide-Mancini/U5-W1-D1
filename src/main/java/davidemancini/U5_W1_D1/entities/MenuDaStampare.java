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

    public List<Pizze> getPizzeList() {
        return pizzeList;
    }

    public void setPizzeList(List<Pizze> pizzeList) {
        this.pizzeList = pizzeList;
    }

    public List<Drinks> getDrinksList() {
        return drinksList;
    }

    public void setDrinksList(List<Drinks> drinksList) {
        this.drinksList = drinksList;
    }

    public List<Toppings> getToppingsList() {
        return toppingsList;
    }

    public void setToppingsList(List<Toppings> toppingsList) {
        this.toppingsList = toppingsList;
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
