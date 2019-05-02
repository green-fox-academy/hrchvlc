import org.junit.Test;
import static org.junit.Assert.*;

public class SumTest {
    @Test
    public void testSumOf() {
        assertEquals(10,10);
    }

    @Test
    public void testGetRatio() {
        // MethodName_StateUnderTest_ExpectedBehavior
        double ratio = Sum.getRatio(6, 2);
        assertEquals(3, ratio, 0.0001);
    }
    @Test
    public void getRatio_dividedByZero_ReturnZero() {
        double ratio = Sum.getRatio(6, 0);
        assertEquals(0, ratio, 0.0001);
    }
}
