package org.example;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void substringsBetweenMustReturnExpectedValue(){
        String str = "axcaycazc";
        String open = "a";
        String close = "c";

        String result[] = StringUtils.substringsBetween(str,open,close);

        assertArrayEquals(new String[]{"x", "y", "z"},result, "it must return {x,y,z}");
    }

    //Test de Dagmar
    @Test
    public void testSubstringsBetween(){
        Assertions.assertThat(StringUtils.substringsBetween("axcaycazc","a","c")).isEqualTo(new String[]{"x", "y", "z"});
    }

    @Test
    void simpleCase() {
        Assertions.assertThat(StringUtils.substringsBetween("abcd", "a", "d")).isEqualTo(new String[]{ "bc" });
    }

    @Test
    void manyStrings() {
        Assertions.assertThat(StringUtils.substringsBetween("abcdabcdab", "a", "d")).isEqualTo(new String[]{ "bc", "bc" });
    }

    @Test
    void openAndCloseTagsThatAreLongerThan1Char() {
        Assertions.assertThat(StringUtils.substringsBetween("aabcddaabfddaab", "aa", "dd")).isEqualTo(new String[]{ "bc", "bf" });
    }


}