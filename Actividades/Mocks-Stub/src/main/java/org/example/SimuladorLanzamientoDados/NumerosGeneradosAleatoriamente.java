package org.example.SimuladorLanzamientoDados;
import java.util.random.RandomGenerator;

public class NumerosGeneradosAleatoriamente implements INumerosAleatorios{

    private RandomGenerator rnd = RandomGenerator.getDefault();

    @Override
    public int obtenerNumeroAleatorio(int NUMERO_LADOS) {
        return rnd.nextInt(NUMERO_LADOS) + 1;
    }
}
