import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitCounterTest {

    private final DigitCounter digitCounter = new DigitCounter();

    @Test
    public void testCountDigitsWithNoDuplicates() {
        assertEquals(1, digitCounter.countDigits(new int[]{3, 7, 5}));
        assertEquals(1, digitCounter.countDigits(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testCountDigitsWithDuplicates() {
        assertEquals(2, digitCounter.countDigits(new int[]{0, 4, 6, 6, 6, 8, 8, 7}));
        assertEquals(1, digitCounter.countDigits(new int[]{1, 1, 2, 2, 3, 3}));
    }

    @Test
    public void testCountDigitsWithMixedDuplicates() {
        assertEquals(1, digitCounter.countDigits(new int[]{1, 2, 2, 3, 3, 3}));
        assertEquals(3, digitCounter.countDigits(new int[]{0, 0, 1, 1, 1, 2, 2}));
    }

    @Test
    public void testCountDigitsWithAllSame() {
        assertEquals(6, digitCounter.countDigits(new int[]{6, 6, 6, 6}));
        assertEquals(9, digitCounter.countDigits(new int[]{9, 9, 9, 9, 9}));
    }
}
