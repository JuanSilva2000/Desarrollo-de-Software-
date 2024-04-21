package com.wordz.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Score {
    private final String correct;
    private Letter resultado = Letter.INCORRECT;
    private int position; //(**)

    public Score(String correct) {
        this.correct = correct;
    }

    public Letter letter(int position) {
        return resultado;
    }

    //Metodo assess No Refactorizado
    //Aqui se verifica si la letra de entrada coincide en la posicion correcta con la lerta de la palabra
//    public void assess(int position, String attempt) {
//        if (correct.charAt(position) == attempt.charAt(position)) {
//            resultado = Letter.CORRECT;
//        }
//    }

//----------------------------------------------------------------------------------------
    //Metodo assess refactorizado: (*)
//    public void assess(int position, String attempt){
//        if(isCorrectLetter(position,attempt)){
//            resultado = Letter.CORRECT;
//        }
//    }

    //(*)
//    private boolean isCorrectLetter(int position, String attempt){
//        return correct.charAt((position)) == attempt.charAt(position);
//    }

//----------------------------------------------------------------------------------------
    //Segunda Refacotirzacion de assess (cambio de diseño, un parametro en isCorrectLetter) (**)
//    public void assess(String attempt){
//        if(isCorrectLetter(attempt)){
//            resultado = Letter.CORRECT;
//        }
//    }
//
//    private boolean isCorrectLetter(String attempt){
//        return correct.charAt(position) == attempt.charAt(position);
//    }
//----------------------------------------------------------------------------------------
    //Refactorizacion para que funcione con segunda letra
//    public void assess(String attempt) {
//        for (char current: attempt.toCharArray()) {
//            if (isCorrectLetter(current)) {
//                resultado = Letter.CORRECT;
//            } else if (occursInWord(current)) {
//                resultado = Letter.PART_CORRECT;
//            }
//        }
//    }

    //En el pdf añaden atributo position, pero eso rompe
    // todo, aqui esta la solucion
    public void assess(String attempt) {
        for (int i = 0; i < attempt.length(); i++) {
            char current = attempt.charAt(i);
            this.position = i; // Ajusta position para cada caracter evaluado
            if (isCorrectLetter(current)) {
                resultado = Letter.CORRECT;
            } else if (occursInWord(current)) {
                resultado = Letter.PART_CORRECT;
            }
        }
    }

    private boolean isCorrectLetter(char currentLetter) {
        return correct.charAt(position) == currentLetter;
    }

    //Verifica si la letra actual esta en cualquier parte de la palabra
    private boolean occursInWord(char current) {
        return correct.contains(String.valueOf(current));
    }
}
