package demos;

public class OutOfMemoryDemo {
    public static void main(String[] args) {
        // Intentionally create a situation that leads to OutOfMemoryError
        try {
            int[] largeArray = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.err.println("Caught OutOfMemoryError: " + e.getMessage());
        }
    }
}
