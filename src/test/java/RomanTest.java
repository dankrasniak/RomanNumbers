import Roman.Roman;
import Roman.UnderFlowException;
import org.junit.Before;
import org.junit.Test;



public class RomanTest {

    private Roman roman;

    @Before
    public void setUp() {
        this.roman = new Roman();
    }


    @Test(expected = UnderFlowException.class)
    public void shouldThrowUnderflowException() {
        roman.convertFromInt(-1);
    }
}