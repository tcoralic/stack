package stack;

/**
 * Generic Stack implementation using an array.
 * The stack follows the LIFO principle (Last In First Out):
 * The last inserted element is the first one to be removed.
 *
 * @param <T> Data type of the elements stored in the stack (Generic)
 */
public class Stack<T> {

    // Array that stores the stack elements
    // Object is used because Java does not allow direct generic arrays
    private Object[] elements;

    // Index of the top element in the stack
    // -1 means the stack is empty
    private int top;

    /**
     * Default constructor
     * Creates a stack with the default size of 10
     */
    public Stack() {

        // Create an array with space for 10 elements
        elements = new Object[10];

        // Stack is initially empty → top = -1
        top = -1;
    }

    /**
     * Constructor with custom capacity
     */
    public Stack(int capacity) {

        // Create an array with the given capacity
        elements = new Object[capacity];

        // Stack starts empty
        top = -1;
    }

    /**
     * Adds an element to the top of the stack (push)
     */
    public void push(T value) throws StackFullException {

        // Check if the stack is full
        // If top is at the last index of the array, there is no space left
        if (top == elements.length - 1) {

            // Throw an exception because the stack is full
            throw new StackFullException("Stack is full!");
        }

        // Increase the top index (move one position up)
        top++;

        // Store the new element at this position
        elements[top] = value;
    }

    /**
     * Removes and returns the top element of the stack (pop)
     */
    public T pop() throws StackEmptyException {

        // Check if the stack is empty
        if (top == -1) {

            // Throw an exception because no element can be removed
            throw new StackEmptyException("Stack is empty!");
        }

        // Retrieve the element from the stack
        // Cast is necessary because the array type is Object
        T value = (T) elements[top];

        // Decrease the top index (one element less in the stack)
        top--;

        // Return the removed element
        return value;
    }

    /**
     * Returns the top element without removing it (peek)
     */
    public T peek() throws StackEmptyException {

        // Check if the stack is empty
        if (top == -1) {

            // Throw an exception because no element exists
            throw new StackEmptyException("Stack is empty!");
        }

        // Return the top element (cast to T required)
        return (T) elements[top];
    }

    /**
     * Returns all elements of the stack as a String
     * Elements are separated by ";"
     */
    public String list() {

        // String that stores the result
        String result = "";

        // Loop through all elements currently in the stack
        for (int i = 0; i <= top; i++) {

            // Add the element to the result string
            result += elements[i];

            // If it is not the last element → add ";"
            if (i < top) {
                result += ";";
            }
        }

        // Return the final string
        return result;
    }
}