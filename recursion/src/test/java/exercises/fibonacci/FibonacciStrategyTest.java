package exercises.fibonacci;

import exercises.fibonacchi.FibonacciStrategy;
import exercises.fibonacchi.IterativeFibonacci;
import exercises.fibonacchi.RecursiveFibonacci;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Fibonacci Strategy Tests")
class FibonacciStrategyTest {

    private void testStrategy(FibonacciStrategy strategy) {
        assertAll(
                () -> assertEquals(0, strategy.compute(0)),
                () -> assertEquals(1, strategy.compute(1)),
                () -> assertEquals(1, strategy.compute(2)),
                () -> assertEquals(2, strategy.compute(3)),
                () -> assertEquals(3, strategy.compute(4)),
                () -> assertEquals(5, strategy.compute(5)),
                () -> assertEquals(8, strategy.compute(6)),
                () -> assertEquals(13, strategy.compute(7)),
                () -> assertEquals(21, strategy.compute(8))
        );
    }

    @Nested
    @DisplayName("Recursive Fibonacci")
    class RecursiveTests {
        @Test
        void testRecursive() {
            testStrategy(new RecursiveFibonacci());
        }
    }

    @Nested
    @DisplayName("Iterative Fibonacci")
    class IterativeTests {
        @Test
        void testIterative() {
            testStrategy(new IterativeFibonacci());
        }
    }


}

