package org.example;
import org.junit.jupiter.api.Test;

public class TestLanzamientoDados {
    @Test
    public void produceMensaje(){
        var stub = new StubNumeroALeatorio();
        var lanzado = lanzado.asText();
        assertThat(actual).isEqualTo("Sacaste un 20");
    }
}
