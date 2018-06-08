import Roman.Roman;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RomanTest {

    private Roman roman;

    @Before
    public void setUp() {
        this.roman = new Roman();
    }

    @Test
    public void shouldReturnM1() {
        assertEquals(roman.convertFromInt(0),"-1");
        assertEquals(roman.convertFromInt(-1),"-1");
    }


}