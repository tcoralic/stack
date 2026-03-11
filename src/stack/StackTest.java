package stack;

/**
 * Test class demonstrating the functionality
 * of the Stack implementation.
 */
public class StackTest {

    public static void main(String[] args) {

        // Test with numbers
        System.out.println("NUMBER STACK TEST");

        try {

            // Create a stack that stores Integer values
            // The stack has a capacity of 5 elements
            Stack<Integer> numberStack = new Stack<>(5);

            // Push numbers onto the stack
            numberStack.push(10);
            numberStack.push(20);
            numberStack.push(30);

            // Print all elements currently in the stack
            System.out.println("Stack: " + numberStack.list());

            // Show the top element without removing it
            System.out.println("Peek: " + numberStack.peek());

            // Remove and return the top element
            System.out.println("Pop: " + numberStack.pop());

            // Show the stack after removing the top element
            System.out.println("Stack after pop: " + numberStack.list());

        } catch (Exception e) {

            // Catch and print any exception message
            System.out.println(e.getMessage());
        }

        // Test with text values
        System.out.println("\nTEXT STACK TEST");

        try {

            // Create a stack that stores String values
            // Maximum capacity is 3 elements
            Stack<String> textStack = new Stack<>(3);

            // Push three text elements onto the stack
            textStack.push("Hello");
            textStack.push("Java");
            textStack.push("Stack");

            // Print all elements in the stack
            System.out.println("Stack: " + textStack.list());

            // This will exceed the stack capacity
            // and cause a StackFullException
            textStack.push("Overflow");

        } catch (StackFullException e) {

            // Handle the case when the stack is full
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {

            // Catch any other unexpected exceptions
            System.out.println(e.getMessage());
        }

        // Test behavior with an empty stack
        System.out.println("\nEMPTY STACK TEST");

        try {

            // Create a new empty stack
            Stack<String> emptyStack = new Stack<>(2);

            // Try to remove an element from an empty stack
            // This will cause a StackEmptyException
            emptyStack.pop();

        } catch (StackEmptyException e) {

            // Handle the case when trying to pop from an empty stack
            System.out.println("Error: " + e.getMessage());
        }
    }
}