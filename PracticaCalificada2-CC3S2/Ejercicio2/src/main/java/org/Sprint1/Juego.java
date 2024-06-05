package org.Sprint1;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Habitacion[] habitaciones = new Habitacion[5];
        int habitacionInicial = 0;
        for (int i = 0; i < habitaciones.length; i++) {
            habitaciones[i] = new Habitacion(i);
            habitaciones[i].setId(i);
        }

        Jugador jugador1 = new Jugador("Juan",habitaciones[habitacionInicial]);

        Scanner scanner = new Scanner (System.in);

        System.out.println("Habitacion 4\nHabitacion 3\nHabitacion 2\nHabitacion 1\nHabitacion 0 (inicial)");

        System.out.print("\nIngrese movimiento: ");
        String movimiento = scanner.nextLine();

        jugador1.mover(movimiento,habitaciones);

        System.out.println("Usted de está en Habitacion  " + jugador1.getHabitacionActual().getId());

    }
}
