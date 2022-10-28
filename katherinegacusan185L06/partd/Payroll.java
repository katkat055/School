package partd;
import java.util.Scanner;
import java.util.ArrayList;
public class Payroll {
public static void main(String[] args) {
    ArrayList<String> nameList = new ArrayList<String>();

    final double PAYRATE = 20;
    double grossPay;
    int[] hours;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("How many employees do you have? ");
    int numEmp = keyboard.nextInt();
    hours = new int[numEmp];

    // System.out.println("Enter the hours worked by all " + numEmp + " who all earn the same hourly rate");
    // for (int i = 0; i < numEmp; i++) {
    //     System.out.println("Employee #" + (i + 1) + ": ");
    //     hours[i] = keyboard.nextInt();
    // }

    System.out.println("Gross pay for each employee");
    int currentEmp = 0;
    for(int val: hours) {
        grossPay = val * PAYRATE;
        System.out.printf("Employee #%d: $%,.2f\n", (++currentEmp), grossPay);
    }

    keyboard.close();
}
}
