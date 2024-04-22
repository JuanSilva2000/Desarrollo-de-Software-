package com.wordz.domain;

import org.junit.jupiter.api.Test;

import static com.wordz.domain.Letter.*;
import static org.assertj.core.api.Assertions.assertThat;

public class WordTest {
    @Test
    public void oneIncorrectLetter() {
        var word = new Word("A");
        var score = word.guess("Z");
        assertScoreForGuess(score, INCORRECT);
    }

    @Test
    public void oneCorrectLetter() {
        var word = new Word("A"); // Parece que se crea una palabra por adivinar
        var score = word.guess("A"); // guess parece ser un metodo que recibe un intento y devuelve un resultado que indicará si es correcto o no
        assertScoreForGuess(score, CORRECT); // Se verifica que la avininaza de la letra es correcta
    }

    @Test
    public void secondLetterWrongPosition() {
        var word = new Word("AR");
        var score = word.guess("ZA");
        assertScoreForGuess(score, INCORRECT, PART_CORRECT);
    }

    @Test
    public void allScoreCombinations() {
        var word = new Word("ARI");
        var score = word.guess("ZAI");
        assertScoreForGuess(score, INCORRECT, PART_CORRECT, CORRECT);
    }

    //Nota: el segundo parametro es un Varargs
    // permite a los métodos aceptar cero o más argumentos del mismo tipo
    // sin necesidad de definirlos explícitamente o usar un arreglo.
    private void assertScoreForGuess(Score score, Letter... expectedScores) {
        for (int position = 0; position < expectedScores.length; position++) {
            Letter expected = expectedScores[position];
            assertThat(score.letter(position)).isEqualTo(expected);
        }
    }
}
