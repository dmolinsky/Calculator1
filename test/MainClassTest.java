import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainClassTest {
    @Test
    @DisplayName("Testing addition method")
    public void testAddMethod() {
        int a = 5,b=6;
        int c = a + b;
        assertEquals(11,c);

    }
    @Test
    @DisplayName("Testing subtract method")
    public void testSubtractMethod() {
        int a = 5, b = 6;
        int c = a - b;
        assertEquals(-1,c);
    }
}
