import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import org.junit.jupiter.api.Test;

public class CalculadorTest {

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
    public void testResta_PositiveNumbers_ShouldReturnCorrectRest(){
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
    public void testResta_NegativeNumbers_ShouldReturnCorrectRest(){
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
    public void testMultiplicacion_PositiveNumbers_ShouldReturnCorrecctProduct(){
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
    public void testMultiplicacion_NegativeNumbers_ShouldReturnCorrectProduct(){
        //Arrange
        Calculador calculador = new Calculador();
        int numberA = -3;
        int numberB = -5;

        //Act
        int resut = calculador.multiplicacion(numberA,numberB);

        //Assert
        assertEquals(15,resut,"(-3x(-5)deberia ser 15)");
    }

    @Test
    public void testDivision_PositiveNumbers_ShouldReturnCorrectDivision(){
        //Arrange
        Calculador calculador = new Calculador();
        int numberA = 15;
        int numberB = 5;

        //Act
        double result = calculador.division(numberA,numberB);

        //Assert
        assertEquals(3,result,"15/5 deberia ser 3");
    }

    @Test
    public void testDivision_NegativeNumbers_ShouldReturnCorrectDivision(){
        //Arrange
        Calculador calculador = new Calculador();
        int numberA = -15;
        int numberB = -5;

        //Act
        double result = calculador.division(numberA,numberB);

        //Assert
        assertEquals(3,result,"(-15)/(-5) deberia ser 3");
    }

    @Test
    public void testDivision_Zero_ShouldReturnExcepction(){
        //Arrange
        Calculador calculador = new Calculador();
        int numberA = 5;
        int numberB = 0;

        //Act
        double result = calculador.division(numberA,numberB);

        //Assert
        assertThatExceptionOfType(ArithmeticException.class)
                .isThrownBy(() -> {
                    double result1 = result;
                });
    }


}
