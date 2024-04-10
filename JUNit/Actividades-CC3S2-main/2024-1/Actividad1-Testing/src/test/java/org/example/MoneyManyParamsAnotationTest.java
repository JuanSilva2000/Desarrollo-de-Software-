package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

public class MoneyManyParamsAnotationTest {
    @ParameterizedTest //Para inferir que este metodo de prueba va a recibir parametros de entrada
    @CsvSource({
            "10, USD", //First set of arguments
            "15, EUR", //second set of arguments
            "50, CHF" //third set of arguments
    })

    //Aqui ponemos dos parametros
    void constructorShouldSetAmountAndCurrency(int amount, String currency){ //Esto es la firma
        Money money = new Money(amount,currency);
        assertThat(money.getAmount()).isEqualTo(amount);
        assertThat(money.getCurrency()).isEqualTo(currency);
    }
}
