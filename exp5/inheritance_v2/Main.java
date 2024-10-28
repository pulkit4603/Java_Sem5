package inheritance_v2;

import java.util.*;

public class Main {
    public static boolean flag;
    public static Diagram diag;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        flag = false;

        while (true) {
            System.out.println("Enter 1 to make a diagram,"
                + " 2 to find total area of current diagram,"
                + " 3 to erase it,"
                + " 4 to exit: ");

            int choice = sc.nextInt();           
            switch (choice) {
                case 1:
                    System.out.println("Enter number of shapes in your diagram:");
                    int numShapes = sc.nextInt();
                    diag = createDiagram(numShapes);
                    flag = true;
                    break;
                case 2:
                    if (flag){
                        System.out.println("The total area of your diagram is: " + diag.totalArea());
                    } else {
                        System.out.println("No diagram found!!");
                    }
                    break;
                case 3:
                    System.out.println("Erased!");
                    flag = false;
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

    public static Diagram createDiagram(int numShapes){
        Scanner sc = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<>();

        for (int i = 0; i < numShapes; i++){
            System.out.println("Enter 1 for Rectangle and 2 for Circle: ");
            int shapeType = sc.nextInt();
            
            if (shapeType == 1) {
                System.out.println("Enter color, length and width of rectangle: ");
                String color = sc.next();
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                shapes.add(new Rectangle(color, length, width));
            } else if (shapeType == 2) {
                System.out.println("Enter color, and radius of Circle: ");
                String color = sc.next();
                double radius = sc.nextDouble();
                shapes.add(new Circle(color, radius));
            } else {
                System.out.println("Invalid shape type. Try again.");
                i--; // repeat
            }
        }

        Shape[] shapesArray = shapes.toArray(new Shape[0]);

        return (new Diagram(shapesArray));
    }
}
