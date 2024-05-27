package org.example;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class ActivityTest {

    @Test
    public void substringsBetweenMustReturnExpectedValue(){
        String str = "axcaycazc";
        String open = "a";
        String close = "c";

        String result[] = Activity.substringsBetween(str,open,close);

        assertArrayEquals(new String[]{"x", "y", "z"},result, "it must return {x,y,z}");
    }

    @Test
    void simpleCase() {
        assertThat(Activity.substringsBetween("abcd", "a", "d")).isEqualTo(new String[]{ "bc" });
    }

    @Test
    void manyStrings() {
        assertThat(Activity.substringsBetween("abcdabcdab", "a", "d")).isEqualTo(new String[]{ "bc", "bc" });
    }

    @Test
    void openAndCloseTagsThatAreLongerThan1Char() {
        assertThat(Activity.substringsBetween("aabcddaabfddaab", "aa", "dd")).isEqualTo(new String[]{ "bc", "bf" });
    }
}
