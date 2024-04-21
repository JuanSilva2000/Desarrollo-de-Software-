package com.wordz.domain;

public class Word {
    private final String word;

    public Word(String correctWord) {
        this.word = correctWord;
    }

    //Método para crear un nuevo objeto Score
    public Score guess(String attempt) {
        var score = new Score(word);

        score.assess(attempt); //assess evalua lo que debe puntuar la adivinacion
        return score;
    }
}
