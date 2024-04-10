package org.example;
import org.junit.jupiter.api.Test; //Permite la anotacion de la linea 6
import static org.assertj.core.api.Assertions.assertThat; //Importancion estatica del método asserThat de la clase Assertions

public class MoneyTest { //Clase de prueba no implementa ninguna interfaz, hay un acuerdo de que siempre termine en Test
    @Test
    void constructorShouldSetAmountAndCurrency() { //método de prueba unitaria que está destinado a verificar el comportamiento del constructor de una clase money
        Money money = new Money(10,"USD"); //Se crea el SUT (sistema bajo prueba)

        //El SUT de pone a prueba usando el método estático asserThat
        assertThat(money.getAmount()).isEqualTo(10);
        assertThat(money.getCurrency()).isEqualTo("USD");
    }

}