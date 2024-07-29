import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {

    @ParameterizedTest
    @CsvSource({"0, 1", "1, 1", "5, 120"})
    void testFactorialOfPositive(int input, long expected) {
        assertEquals(expected, Factorial.factorial(input));
    }

    @Test
    void testFactorialOfNegative() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }
}
