package stack;

/**
 * Exception thrown when trying to push
 * an element into a full stack.
 */
public class StackFullException extends Exception {

    /**
     * Constructor with error message
     */
    public StackFullException(String message) {
        super(message);
    }
}