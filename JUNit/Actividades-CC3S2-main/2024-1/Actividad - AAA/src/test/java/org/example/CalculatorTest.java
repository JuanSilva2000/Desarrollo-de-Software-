package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testSum_PositiveNumbers_ShouldReturnCorrectSum() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado = calculador.sumar(numeroA, numeroB);

        // Assert
        assertEquals(15, resultado, "10 + 5 deberia ser 15");
    }

    @Test
    public void testSum_NegativeNumbers_ShouldReturnCorrectSum() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = -5;
        int numeroB = -6;

        // Act
        int resultado = calculador.sumar(numeroA, numeroB);

        // Assert
        assertEquals(-11, resultado, "-5 + (-6) deberia ser -11");
    }

    @Test
    public void testRest_PositiveNumbers_ShouldReturnCorrectRest(){
        //Arrange
        Calculador calculador = new Calculador();
        int numberA = 6;
        int numberB = 9;

        //Act
        int result = calculador.restar(numberA,numberB);

        //Assert
        assertEquals(-3,result,"6-9 deberia ser -3");
    }

    @Test
    public void testRest_NegativeNumbers_ShouldReturnCorrectRest(){
        //Arrange
        Calculador calculador = new Calculador();
        int numberA = -15;
        int numberB = -5;

        //Act
        int result = calculador.restar(numberA,numberB);

        //Assert
        assertEquals(-10,result,"-15-(-5) deberia ser -10");
    }

    @Test
    public void testMulti_PositiveNumbers_ShouldReturnCorrecctProduct(){
        //Arrange
        Calculador calculador = new Calculador();
        int numberA = 5;
        int numberB = 7;

        //Act
        int result = calculador.multiplicacion(numberA,numberB);

        //Assert
        assertEquals(35,result,"5x7 deberia ser 35");
    }

    @Test
    public void testMulti_NegativeNumbers_ShoudlReturnCorrectProduct(){
        
    }


}
