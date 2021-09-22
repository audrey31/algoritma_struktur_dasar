package Stack;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Creating an empty Stack
        Stack<Integer> STACK = new Stack<Integer>();

        // Stacking int values
        STACK.push(8);
        STACK.push(5);
        STACK.push(9);
        STACK.push(2);
        STACK.push(4);

        STACK.add(2, 0);

        // Displaying the Stack
        System.out.println("The stack is: " + STACK);

        // Checking for the element 9
        System.out.println("Does the stack contains '9'? "
                    + STACK.search(9));

        // Checking for the element 10
        System.out.println("Does the stack contains '10'? "
                    + STACK.search(10));

        // Checking for the element 11
        System.out.println("Does the stack contains '11'? "
                    + STACK.search(11));

        // Checking for the element 11
        System.out.println("Does the stack contains '4'? "
                + STACK.search(4));

        // Checking for the element 11
        System.out.println("Does the stack contains '2'? "
                + STACK.search(2));

        // Checking for the element 11
        System.out.println("Does the stack contains '5'? "
                + STACK.search(5));

        STACK.add(10);

        System.out.println(STACK);
        }
    }

