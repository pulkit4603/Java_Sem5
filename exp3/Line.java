import java.util.Scanner;

public class Line {
    private int slope;
    private int yIntercept;
    private int x1, y1, x2, y2;

    // Slope-Y Intercept form (y = mx + c)
    public Line(int slope, int yIntercept) {
        this.slope = slope;
        this.yIntercept = yIntercept;
        System.out.println("Equation of Line: y = " + slope + "x + " + yIntercept);
    }

    // Slope-Point form (y - y1 = m(x - x1))
    public Line(int slope, int x1, int y1) {
        this.slope = slope;
        this.x1 = x1;
        this.y1 = y1;
        this.yIntercept = y1 - slope * x1;
        System.out.println("Equation of Line: y - " + y1 + " = " + slope + "(x - " + x1 + ")");
        System.out.println("Line in Slope-Y Intercept form: y = " + slope + "x + " + yIntercept);
    }

    // Two-Point form
    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        if (x2 != x1) {
            this.slope = (y2 - y1) / (x2 - x1);
            this.yIntercept = y1 - slope * x1;
            System.out.println(
                "Equation of Line: y - " + y1 + " =  (" + (y2 - y1) + "/(" + (x2 - x1) + "))(x - " + x1 + ")");
            System.out.println("Line in Slope-Y Intercept form: y =  " + slope + "x + " + yIntercept);
        } else {
            System.out.println("This is a vertical line: x = " + x1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String continueChoice;
        do {
            System.out.println("Choose the form of the line equation:");
            System.out.println("1: Slope-Y Intercept form (y = mx +  c)");
            System.out.println("2: Slope-Point form (y - y1 = m(x - x1))");
            System.out.println("3: Two-Point form");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the slope (m): ");
                    int slope1 = scan.nextInt();
                    System.out.println("Enter the y-intercept (c): ");
                    int intercept = scan.nextInt();
                    new Line(slope1, intercept);
                    break;
                case 2:
                    System.out.println("Enter the slope (m): ");
                    int slope2 = scan.nextInt();
                    System.out.println("Enter the x1 coordinate: ");
                    int x1 = scan.nextInt();
                    System.out.println("Enter the y1 coordinate: ");
                    int y1 = scan.nextInt();
                    new Line(slope2, x1, y1);
                    break;
                case 3:
                    System.out.println("Enter the x1 coordinate: ");
                    int point1X = scan.nextInt();
                    System.out.println("Enter the y1 coordinate: ");
                    int point1Y = scan.nextInt();
                    System.out.println("Enter the x2 coordinate: ");
                    int point2X = scan.nextInt();
                    System.out.println("Enter the y2 coordinate: ");
                    int point2Y = scan.nextInt();
                    new Line(point1X, point1Y, point2X, point2Y);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            System.out.println("Do you want to continue? (yes/no):  ");
            continueChoice = scan.next();
        } while (continueChoice.equalsIgnoreCase("yes"));
        System.out.println("Program terminated.");
        scan.close();
    }
}
