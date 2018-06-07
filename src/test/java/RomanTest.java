import Roman.Roman;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanTest {

    static private Roman roman;

    @BeforeAll
    static void setUp() {
        roman = new Roman();
    }

    @Test
    void shouldReturnI() {
        assertEquals(roman.convertFromInt(1),"I");
    }
}