import java.util.*;

public class Tester {
    public static SalariedEmployee[] empList = new SalariedEmployee[5];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            System.out.println("Enter the name, id, age, and raw salary of employee: ");
            String[] empDetails = sc.nextLine().split(" ");
            
            System.out.println("Enter true if employee is permanent," 
                + " otherwise false");
            boolean isPerm = sc.nextBoolean();
            sc.nextLine(); // Java bug hack: Consume the newline character

            empList[i] = new SalariedEmployee(empDetails[0],
                                                empDetails[1],
                                                Integer.parseInt(empDetails[2]), 
                                                Double.parseDouble(empDetails[3]), 
                                                isPerm);
        }

        double maxSalaryYet = 0.0;
        int index = 0;

        for (int i = 0; i < 5; i++){
            if (empList[i].getEmpSalary() > maxSalaryYet){
                index = i;
            }
            maxSalaryYet = Math.max(empList[i].getEmpSalary(), maxSalaryYet);
        }

        System.out.println("The employee with the maximum salary is '"
            + empList[index].getName() 
            + "' with the ID '" + empList[index].getId() 
            + "' whose age is " + empList[index].getAge()
            + ".\nHis Salary is: " + empList[index].getEmpSalary());
    }
}

