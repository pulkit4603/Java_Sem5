import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackImpl intStack = new StackImpl(5);  // Stack size 5

        System.out.println("Enter 5 numbers to initialize the stack:");
        for (int i = 0; i < 5; i++) {
            int value = sc.nextInt();
            intStack.push(value);
        }

        while (true) {
            System.out.println("Enter 1 to push, 2 to pop, 3 to peek, 4 to exit:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a number to push:");
                    int value = sc.nextInt();
                    intStack.push(value);
                    break;
                case 2:
                    int poppedValue = intStack.pop();
                    if (poppedValue != -1) {
                        System.out.println("Popped: " + poppedValue);
                    }
                    break;
                case 3:
                    int topElement = intStack.peek();
                    if (topElement != -1) {
                        System.out.println("Top element: " + topElement);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
