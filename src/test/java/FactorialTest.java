import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FactorialTest {
    @DataProvider(name = "factorialPositiveTest")
    public Object[][] factorialPositiveDataProvider() {
        return new Object[][]{{0, 1}, {1, 1}, {5, 120}, {19, 121645100408832000L}, {20, 2432902008176640000L}};
    }

    @DataProvider(name = "factorialNegativeTest")
    public Object[][] factorialNegativeDataProvider() {
        return new Object[][]{{-1, IllegalArgumentException.class}, {21, IllegalArgumentException.class}};
    }

    @Test(dataProvider = "factorialPositiveTest")
    public void positiveTestFactorial(int n, long expected) {
        Assert.assertEquals(
                expected,
                Factorial.factorial(n),
                "Factorial of " + n + " is " + expected + " but got " + Factorial.factorial(n));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeTestFactorialOfLowerLimit() {
        Factorial.factorial(-1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeTestFactorialOfUpperLimit() {
        Factorial.factorial(21);
    }
}
