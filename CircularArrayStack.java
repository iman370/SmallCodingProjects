import java.util.ArrayList;
import java.util.Scanner;

public class CircularArrayStack {

    static ArrayList<Integer> circularArray = new ArrayList<Integer>();
    static int top = -1;
    static int maxSize = 5;

    public static void push(int x) {
        top += 1;
        if (top == maxSize) {
            top = 0;
        }
        circularArray.set(top, x);
    }

    public static void pop() {
        if (top == -1) {
            top = maxSize - 1;
        }
        circularArray.set(top, 0);
        top = top - 1;
    }

    public static void initialiseStack() {
        for (int i=0; i<5; i++) {
            circularArray.add(0);
        }
    }

    public static void main(String[] args) {

        boolean stackUsed = false;

        CircularArrayStack.initialiseStack();

        Scanner userInput = new Scanner(System.in);
        System.out.println("What would you like to do?\n-PUSH - add an element to the stack\n-POP - remove an element from the stack");
        System.out.println("-VIEW - view the stack as a whole\n-RECENT - view the most recent item on the stack\n-X - quit");

        String input = userInput.next().toLowerCase();

        while (input != "x") {
            if (input.equals("push")) {
                stackUsed = true;
                System.out.println("What number would you like to enter into the stack? ");
                int number = userInput.nextInt();
                CircularArrayStack.push(number);
            } else if (input.equals("pop")) {
                if (stackUsed == false) {
                    System.out.println("Stack is empty.");
                } else {
                    CircularArrayStack.pop();
                }
            } else if (input.equals("view")) {
                if (stackUsed == false) {
                    System.out.println("Stack is empty.");
                } else {
                    System.out.println(circularArray);
                }
            } else if (input.equals("recent")) {
                if (stackUsed == false) {
                    System.out.println("Stack is empty.");
                } else {
                    System.out.println("The most recent item on the stack is: " + Integer.toString(circularArray.get(top)));
                }
            } else {
                System.out.println("Invalid input.");
            }

            System.out.println("Next");
            input = userInput.next();
        }
    }

}
