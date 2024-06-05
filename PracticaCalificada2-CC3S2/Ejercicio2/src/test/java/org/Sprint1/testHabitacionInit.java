package org.Sprint1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

public class testHabitacionInit {
    @Test
    public void exepctionAlCrearHabitacionInvalida() {
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
                () -> {
                    Jugador jugador = new Jugador("Silva",new Habitacion(-1));
                }
        );
    }
}
