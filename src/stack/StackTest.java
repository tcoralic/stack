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

            // Create stack for integers
            Stack<Integer> numberStack = new Stack<>(5);

            numberStack.push(10);
            numberStack.push(20);
            numberStack.push(30);

            System.out.println("Stack: " + numberStack.list());

            System.out.println("Peek: " + numberStack.peek());

            System.out.println("Pop: " + numberStack.pop());

            System.out.println("Stack after pop: " + numberStack.list());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test with text
        System.out.println("\nTEXT STACK TEST");

        try {

            Stack<String> textStack = new Stack<>(3);

            textStack.push("Hello");
            textStack.push("Java");
            textStack.push("Stack");

            System.out.println("Stack: " + textStack.list());

            // This will cause StackFullException
            textStack.push("Overflow");

        } catch (StackFullException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        // test empty stack
        System.out.println("\nEMPTY STACK TEST");

        try {

            Stack<String> emptyStack = new Stack<>(2);

            emptyStack.pop();

        } catch (StackEmptyException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}