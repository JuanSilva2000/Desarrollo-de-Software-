package org.example.SimuladorLanzamientoDados;

public class AppProduccion {
    public static void main(String[] args) {
        NumerosGeneradosAleatoriamente RandomNumber = new NumerosGeneradosAleatoriamente();
        LanzamientoDados lanzamientoDados = new LanzamientoDados(RandomNumber);

        for(int i=0;i<10;i++){
            System.out.println("Resultado del lanzamiento " + i + " : " + lanzamientoDados.lanzar());
        }



    }
}
