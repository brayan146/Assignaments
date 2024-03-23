package NumerosPrimos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class EsPrimoTest {

    @Test
    public void testEsPrimo() {
        EsPrimo checker = new EsPrimo();
        assertTrue(checker.esPrimo(2));
        assertTrue(checker.esPrimo(3));
        assertTrue(checker.esPrimo(5));
        assertTrue(checker.esPrimo(7));
        assertTrue(checker.esPrimo(11));
    }
    @Test
    public void testNoEsPrimo() {
        EsPrimo checker = new EsPrimo();
        assertFalse(checker.esPrimo(1));
        assertFalse(checker.esPrimo(4));
        assertFalse(checker.esPrimo(6));
        assertFalse(checker.esPrimo(8));
        assertFalse(checker.esPrimo(9));
    }
}
