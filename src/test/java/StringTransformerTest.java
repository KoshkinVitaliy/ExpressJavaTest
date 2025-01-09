import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTransformerTest {

    private final StringTransformer transformer = new StringTransformer();

    @Test
    public void testTransformWithSingleCharacter() {
        assertEquals("a", transformer.transform("a"));
        assertEquals("b", transformer.transform("b"));
    }

    @Test
    public void testTransformWithTwoCharacters() {
        assertEquals("1b", transformer.transform("aB")); // 'a' -> 1, 'B' remains
        assertEquals("c1", transformer.transform("A")); // 'A' -> 1
    }

    @Test
    public void testTransformWithMultipleCharacters() {
        assertEquals("dlr15w", transformer.transform("world"));
        assertEquals("dlr15W", transformer.transform("World"));
        assertEquals("21r15t", transformer.transform("true"));
        assertEquals("21r15T", transformer.transform("True"));
    }

    @Test
    public void testTransformWithNoVowels() {
        assertEquals("bcdfg", transformer.transform("gfdbc"));
    }

    @Test
    public void testTransformWithAllVowels() {
        assertEquals("1519", transformer.transform("ioua")); // 'i' -> 9, 'o' -> 15, 'u' -> 21, 'a' -> 1
    }
}
