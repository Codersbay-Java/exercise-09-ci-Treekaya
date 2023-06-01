import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lukaswais.Calculator;

public class CalculatorTest {
    @Test
    void testAdd() {
        double result = Calculator.add(2.5, 3.7);
        Assertions.assertEquals(6.2, result, 0.0001);
    }

    @Test
    void testSubtract() {
        Assertions.assertEquals(Calculator.subtract(3, 3), 0);
    }

    @Test
    void testMultiply() {
        Assertions.assertEquals(4, Calculator.multiply(2, 2));
    }

    @Test
    void testDivide() {
        Assertions.assertEquals(2, Calculator.divide(2, 1));
    }

    /**
     * checks if the correct exception is thrown.
     */
    @Test
    void testDivideByZeroException() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(4, 2);
        });
    }

    /**
     * checks if the correct error message is thrown
     */
    @Test
    void testDivideByZeroExceptionMessage() {
        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(4, 0);
        });

        String expectedMessage = "Cannot divide by zero";
        String actualMessage = exception.getMessage();

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

}