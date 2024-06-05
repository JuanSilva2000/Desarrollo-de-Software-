package org.Sprint2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Juego2 {
    public static void main(String[] args) {
        Habitacion2[] habitaciones = new Habitacion2[5];
        int habitacionInicial = 0;

        for (int i = 0; i < habitaciones.length; i++) {
            habitaciones[i] = new Habitacion2(i);
            habitaciones[i].setId(i);
        }

        habitaciones[0].setAcertijoRespuesta("¿Quién es el rey de la sabana ?:", "Leon");
        habitaciones[1].setAcertijoRespuesta("¿Quién es el mejor amigo del hombre ?:","Perro");
        habitaciones[2].setAcertijoRespuesta("¿Quién es el pentacampeon del mundo? ", "Brasil");
        habitaciones[3].setAcertijoRespuesta("Sale de dia, se oculta en la noche, los planetas giran al rededor de el, ¿quién soy?","Sol");
        habitaciones[4].setAcertijoRespuesta("Soy un planeta, vecino del tuyo, tengo un anillo ¿quién soy?", "Saturno");



        Jugador2 jugador1 = new Jugador2("Juan",habitaciones[habitacionInicial]);

        Scanner scanner = new Scanner (System.in);

        System.out.println("Habitacion 4\nHabitacion 3\nHabitacion 2\nHabitacion 1\nHabitacion 0 (inicial)");

        boolean flag = habitaciones[habitacionInicial].isCompletado();

        while(!flag){
            String respuesta = "";

            System.out.println("Usted está en Habitacion " + jugador1.getHabitacionActual().getId());

            do {
                System.out.println("Resuleve acertijo: " + jugador1.getHabitacionActual().getAcertijo());
                System.out.print("Tu respuesta: " );
                respuesta = scanner.nextLine();
            }while(!respuesta.equals(jugador1.getHabitacionActual().getRespuesta()));

            jugador1.getHabitacionActual().setCompletado(true);

            System.out.print("\nIngrese movimiento: ");
            String movimiento = scanner.nextLine();

            jugador1.mover(movimiento,habitaciones);

            flag = jugador1.getHabitacionActual().isCompletado();

        }
    }
}
