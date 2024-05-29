package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilsTestTwo {
    @Test
    public void strIsNullOrEmpty() {
        //T1
        Assertions.assertThat(StringUtils.substringsBetween(null,"a","b")).isEqualTo(null);

        //T2
        Assertions.assertThat(StringUtils.substringsBetween("","a","b")).isEqualTo(new String[0]);
    }

    //T16
    @Test
    public void openAndCLoseTagsOfDifferentSizes(){
        assertThat(StringUtils.substringsBetween("aabcc","xx","yy")).isEqualTo(null);
    }

    //La idea es refactorizar el metodo substringsBetween para que pase los tests
    @Test
    public void ignoresSpecialCharacters(){
        assertThat(StringUtils.substringsBetween("a*b?c!a@d", "a", "d")).isEqualTo(new String[] { "bc" }); //falta refactorizar
    }
}
