package org.example.SimuladorLanzamientoDados;

public class LanzamientoDados {
    private INumerosAleatorios numerosAleatorios;
    private final int NUMERO_LADOS = 6;

    public LanzamientoDados(INumerosAleatorios numerosAleatorios){
        this.numerosAleatorios = numerosAleatorios;
    }

    public int lanzar(){
        return numerosAleatorios.obtenerNumeroAleatorio(NUMERO_LADOS);
    }

}
