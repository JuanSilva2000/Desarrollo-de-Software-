package COHESION;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

public class LCOMCalculatorTest {
    private LCOMCalculator.ClassInfo classInfo = new LCOMCalculator.ClassInfo();

    @BeforeEach
    void setUp(){
        classInfo.addMethod("method1", new HashSet<>(Arrays.asList("attr1", "attr2")));
        classInfo.addMethod("method2", new HashSet<>(Arrays.asList("attr2")));
        classInfo.addMethod("method3", new HashSet<>(Arrays.asList("attr3","attr4")));
    }

    @Test
    public void testGetLCOM(){
        int lcom = classInfo.getLCOM();
        assertEquals(1,lcom,"LCOM must be 1");
    }


}
