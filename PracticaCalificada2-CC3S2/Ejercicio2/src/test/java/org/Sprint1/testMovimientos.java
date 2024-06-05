package org.Sprint1;

import org.Sprint1.Habitacion;
import org.Sprint1.Jugador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThat;

public class testMovimientos {
    Habitacion[] habitaciones = new Habitacion[5];
    @BeforeEach
    void setUp() {
        for (int i = 0; i < habitaciones.length; i++) {
            habitaciones[i] = new Habitacion(i);
            habitaciones[i].setId(i);
        }
    }


    @Test
    public void movimientoSurInvalido() {
        Jugador jugador = new Jugador("Silva",new Habitacion(0));

        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
                () -> {
                    jugador.mover("mover sur",habitaciones);
                }
        );
    }

    @Test
    public void movimientoSurValido() {
        Jugador jugador = new Jugador("Silva",new Habitacion(3));

        jugador.mover("mover sur",habitaciones);

        assertThat(jugador.getHabitacionActual().getId()).isEqualTo(2);
    }

    @Test
    public void movimientoNorteInvalido() {
        Jugador jugador = new Jugador("Silva",new Habitacion(4));

        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
                () -> {
                    jugador.mover("mover norte",habitaciones);
                }
        );
    }

    @Test
    public void movimientoNorteValido() {
        Jugador jugador = new Jugador("Silva",new Habitacion(2));

        jugador.mover("mover norte",habitaciones);

        assertThat(jugador.getHabitacionActual().getId()).isEqualTo(3);
    }

    @Test
    public void movimientoInvalido() {
        Jugador jugador = new Jugador("Silva",new Habitacion(3));

        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
                () -> {
                    jugador.mover("mover arriba",habitaciones);
                }
        );
    }
}
