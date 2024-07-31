import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {

    @ParameterizedTest
    @CsvSource({"0, 1", "1, 1", "5, 120", "19, 121645100408832000", "20, 2432902008176640000"})
    void testFactorialOfPositive(int input, long expected) {
        assertEquals(expected, Factorial.factorial(input),
                "Expected " + expected + " actual " + Factorial.factorial(input));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 21})
    void testFactorialOfNegative(int input) {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(input),
                "Expected Error for " + input);
    }
}