import Roman.Roman;
import Roman.UnderFlowException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanTestJUnit5 {
    static private Roman roman;

    @BeforeAll
    static void setUp() {
        roman = new Roman();
    }

    @Test
    void shouldReturnI() {
        assertEquals("I", roman.convertFromInt(1));
    }

    @ParameterizedTest
    @CsvSource({
            "1, I", "2, II", "3, III", "4, IV", "5, V",
            "6, VI", "7, VII,","8, VIII", "9, IX", "10, X",
            "11, XI", "12, XII", "13, XIII", "14, XIV", "15, XV",
            "16, XVI", "17, XVII,","18, XVIII", "19, XIX", "20, XX",
            "100, C", "500, D", "521, DXXI", "3221, MMMCCXXI"
    })
    void shouldReturnFirstTen(int first, String second) {
        assertEquals(roman.convertFromInt(first), second);
    }


    @Test
    void shouldThrowUnderflowException() throws UnderFlowException{
        roman.convertFromInt(-1);
    }
}
