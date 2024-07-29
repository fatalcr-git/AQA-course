import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FactorialTest {
    @DataProvider(name = "factorialTest")
    public Object[][] factorialDataProvider() {
        return new Object[][] {
                {0, 1},
                {1, 1},
                {5, 120}
        };
    }

    @Test(dataProvider = "factorialTest")
    public void positiveTestFactorial(int n, int expected) {
        Assert.assertEquals(expected, Factorial.factorial(n));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeTestFactorial() {
        Factorial.factorial(-1);
    }
}
