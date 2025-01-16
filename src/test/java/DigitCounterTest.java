import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitCounterTest {

    private final DigitCounter digitCounter = new DigitCounter();

    @Test
    public void testCountDigitsWithNoDuplicates() {
        int[] arr1 = {1,1,1};
        int[] arr2 = {1,1,1,1,1};
        assertEquals(arr1, digitCounter.countDigits(new int[]{3, 7, 5}));
        assertEquals(arr2, digitCounter.countDigits(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testCountDigitsWithDuplicates() {
        int[] arr1 = {1,1,3,2,1};
        int[] arr2 = {2,2,2};
        assertEquals(arr1, digitCounter.countDigits(new int[]{0, 4, 6, 6, 6, 8, 8, 7}));
        assertEquals(arr2, digitCounter.countDigits(new int[]{1, 1, 2, 2, 3, 3}));
    }

    @Test
    public void testCountDigitsWithMixedDuplicates() {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,3,2};
        assertEquals(arr1, digitCounter.countDigits(new int[]{1, 2, 2, 3, 3, 3}));
        assertEquals(arr2, digitCounter.countDigits(new int[]{0, 0, 1, 1, 1, 2, 2}));
    }

    @Test
    public void testCountDigitsWithAllSame() {
        int[] arr1 = {4};
        int[] arr2 = {5};
        assertEquals(arr1, digitCounter.countDigits(new int[]{6, 6, 6, 6}));
        assertEquals(arr2, digitCounter.countDigits(new int[]{9, 9, 9, 9, 9}));
    }
}
