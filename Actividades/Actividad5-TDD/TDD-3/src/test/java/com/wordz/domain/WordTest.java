package com.wordz.domain;

import org.junit.jupiter.api.Test;

import static com.wordz.domain.Letter.*;
import static org.assertj.core.api.Assertions.assertThat;

public class WordTest {

    @Test
    public void oneCorrectLetter() {
        var word = new Word("A"); // Parece que se crea una palabra por adivinar
        var score = word.guess("A"); // guess parece ser un metodo que recibe un intento y devuelve un resultado que indicará si es correcto o no
        assertThat(score.letter(0)).isEqualTo(CORRECT); // Se verifica que la avininaza de la letra es correcta

        //Tomamos el assert anterior y lo movemos a un metodo privado
        assertScoreForLetter(score,0, CORRECT);
    }

    @Test
    void allScoreCombinations() {
        var word = new Word("ARI");
        var score = word.guess("ZAI");
        assertScoreForLetter(score, 0, Letter.INCORRECT);
        assertScoreForLetter(score, 1, Letter.PART_CORRECT);
        assertScoreForLetter(score, 2, Letter.CORRECT);
    }

    @Test
    void secondLetterWrongPosition() {
        var word = new Word("AR");
        var score = word.guess("ZA");
        assertScoreForLetter(score, 1, Letter.PART_CORRECT);
    }

    private  void assertScoreForLetter(Score score, int position, Letter expected){
        assertThat(score.letter(position)).isEqualTo(expected);
    }
}

