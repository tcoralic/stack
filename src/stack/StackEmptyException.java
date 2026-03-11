package stack;

/**
 * Exception thrown when trying to read
 * from an empty stack.
 */
public class StackEmptyException extends Exception {

    /**
     * Constructor with error message
     */
    public StackEmptyException(String message) {
        super(message);
    }
}