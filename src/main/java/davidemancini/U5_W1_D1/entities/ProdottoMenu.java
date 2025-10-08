package davidemancini.U5_W1_D1.entities;

public class ProdottoMenu {
    private Pizze pizza;
    private Drinks drink;
    private Toppings toppings;


    public ProdottoMenu(Pizze pizza) {
        this.pizza = pizza;
    }

    public ProdottoMenu(Drinks drink) {
        this.drink = drink;
    }

    public ProdottoMenu(Toppings toppings) {
        this.toppings = toppings;
    }

    public Pizze getPizza() {
        return pizza;
    }

    public void setPizza(Pizze pizza) {
        this.pizza = pizza;
    }

    public Toppings getToppings() {
        return toppings;
    }

    public void setToppings(Toppings toppings) {
        this.toppings = toppings;
    }

    public Drinks getDrink() {
        return drink;
    }

    public void setDrink(Drinks drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "ProdottoMenu{" +
                "pizza=" + pizza +
                ", drink=" + drink +
                ", toppings=" + toppings +
                '}';
    }
}
