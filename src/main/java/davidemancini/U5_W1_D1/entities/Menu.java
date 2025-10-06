package davidemancini.U5_W1_D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Menu {
    protected String nome;
    protected int calorie;
    protected double prezzo;
}
