import org.junit.Test;
import static org.junit.Assert.*;

public class ApplesTest {
    String apple = "apple";

    @Test
    public void testGetApple() throws Exception{
        assertEquals("apple", apple);
    }
}
