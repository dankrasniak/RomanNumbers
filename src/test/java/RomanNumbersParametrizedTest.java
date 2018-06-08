import Roman.Roman;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RomanNumbersParametrizedTest{

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1, "I"}, { 2, "II"}, { 3, "III"}, { 4, "IV"},
                { 5, "V"}, { 6, "VI"}, { 7, "VII"}, { 8, "VIII"}, { 9, "IX"},
                { 10, "X"}, { 11, "XI"}, { 12, "XII"}, { 13, "XIII"}, { 14, "XIV"},
                { 15, "XV"}, { 16, "XVI"}, { 17, "XVII"}, { 18, "XVIII"}, { 19, "XIX"}
        });
    }

    private int fInput;

    private String fExpected;

    public RomanNumbersParametrizedTest(int input, String expected) {
        this.fInput = input;
        this.fExpected = expected;
    }

    @Test
    public void test() {
        Roman roman = new Roman();
        assertEquals(fExpected, roman.convertFromInt(fInput));
    }
}