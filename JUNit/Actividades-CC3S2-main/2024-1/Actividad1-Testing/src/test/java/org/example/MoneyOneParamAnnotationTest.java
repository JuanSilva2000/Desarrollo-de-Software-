package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class MoneyOneParamAnnotationTest {
    @ParameterizedTest //Para inferir que este metodo de prueba va a recibir parametros de entrada
    @ValueSource(ints = {10,15,50}) //Forma mas sencilla de proporcionar un unico de parametro de prueba, proveedor de datos de pruebas
    void constructorShouldSetAmountAndCurrency(int amount) {
        Money money = new Money(amount,"USD");
        assertThat(money.getAmount()).isEqualTo(amount);
    }
}

//Para probar varios valores de entrada podemos trabajar con @ParameterizedTest y @ValueSource
//Una firma de metodo es la combinacion del nombre y la lista de parametros,
//En este ejemplo, la firma del método suma es suma(int a, int b). La firma indica que este método se llama suma, espera dos parámetros de tipo int (a y b), y devuelve un valor de tipo int.
