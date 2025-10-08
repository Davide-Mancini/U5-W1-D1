package davidemancini.U5_W1_D1;

import davidemancini.U5_W1_D1.entities.Ordine;
import davidemancini.U5_W1_D1.entities.StatoOrdine;
import davidemancini.U5_W1_D1.entities.StatoTavolo;
import davidemancini.U5_W1_D1.entities.Tavolo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class U5W1D1ApplicationTests {

@Autowired Ordine ordine;
@Autowired Tavolo tavolo;


//TEST CHE CONTROLLA IL TOTALE DELL'ORDINE CHE ABBIAMO CREATO.
	@Test
    void controllaIlTotaleOrdine(){
        Assertions.assertEquals(6,ordine.calcolaTotale());
    }

    @Test
    void controllaNumProdottiOrdine(){
        Assertions.assertEquals(0,ordine.getProdottiMenu().size());
    }

    @Test
    void controllaCopertiTavolo(){
        Assertions.assertEquals(4,tavolo.getNumMaxCoperti());
    }

    @ParameterizedTest
    @EnumSource(value = StatoOrdine.class, names = "INCORSO")
    void controllaStatoOrdine(StatoOrdine statoOrdine){
        Assertions.assertEquals(statoOrdine,ordine.getStatoOrdine());
    }


    @ParameterizedTest
    @EnumSource(value = StatoTavolo.class,names = "LIBERO") //QUESTO ENUMSOURCE EFFETTUA IL TEST PER OGNI VALORE DELL'ENUM CHE GLI PASSIAMO COME VALUE QUINDI UN TEST PASSESRA E UNO NO.
                                           //A MENO CHE NON SPECIFICO IL NOME DEL VALORE
    void controllaStatoDelTavolo(StatoTavolo statoTavolo){
        Assertions.assertNotEquals(statoTavolo,tavolo.getStatoTavolo());
    }
}
