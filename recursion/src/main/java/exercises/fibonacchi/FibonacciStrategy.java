package exercises.fibonacchi;

public interface FibonacciStrategy {
    /**
     * Returns the nth Fibonacci number.
     *
     * @param n position in the Fibonacci sequence
     * @return Fibonacci number at position n
     */
    long compute(int n);
}

