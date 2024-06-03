package org.example.SimuladorLanzamientoDado;
import org.example.SimuladorLanzamientoDados.INumerosAleatorios;
import org.example.SimuladorLanzamientoDados.LanzamientoDados;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.*;

public class LanzamientoDadosTest {
    class STUBNumerosAleatorios implements INumerosAleatorios {

        @Override
        public int obtenerNumeroAleatorio(int n) {
            return 4;
        }
    }

    @Test
    public void TestLanzamientoDados(){
        //ARRANGE
        var stub = new STUBNumerosAleatorios();
        var lanzamiento = new LanzamientoDados(stub);

        //ACT
        int result = lanzamiento.lanzar();

        //ASSERT
        assertThat(result).isEqualTo(4);
    }






}
