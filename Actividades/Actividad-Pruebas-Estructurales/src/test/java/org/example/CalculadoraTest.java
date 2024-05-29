package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;


class CalculadoraTest {

    Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora();
    }

    @Test
    void testAdd() {
        assertThat(calc.add(2,3)).isEqualTo(5);
    }

    @Test
    void testSubtract() {
        assertThat(calc.subtract(5,3)).isEqualTo(2);
    }

    @Test
    void testMultiply() {
        assertThat(calc.multiply(5,9)).isEqualTo(45);
    }

    @Test
    void testDivide() {
        assertThat(calc.divide(-30,2)).isEqualTo(-15);
    }

    @Test
    void testDoesntDivideZero(){
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
                ()-> {
                    calc.divide(5,0);
                }
        );
    }
}

//Ver build/reports/test/test/index.html
//Ver el gradle.txt para ejecuar en terminal y generar el reporte
//Por hacer: Estudiar que significan los resultados y que se pude hacer para mejorarlo