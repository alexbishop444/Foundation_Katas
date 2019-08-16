import javax.xml.stream.events.EndDocument;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the payslip generator!");
        System.out.println("Please Input your first name");
        String firstName = scanner.nextLine();
        System.out.println("Please input your surname");
        String lastName = scanner.nextLine();
        System.out.println("Please enter your annual salary");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input your super rate");
        double superAmount = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input your payment start date");
        String startDate = scanner.nextLine();
        System.out.println("Please input your end date");
        String endDate = scanner.nextLine();
        double tax = 0;
        double salaryTest = 878000;
        double salaryMonth = salary / 12;
        double salarySuper = (double)(salaryMonth*(superAmount/100.0f));
        double netincome = salaryMonth;
        if (salary > 18200 && salary <= 37000) {
            //salary - 18200 * .19
            for (double i = 18200; i < salary; i++) {
                tax += 0.19;
//                System.out.println(tax);
            }
        }

        else if (salary >= 37001 && salary <= 87000) {
            tax += 3572;
            for (double i = 37001; i < salary; i++) {
                tax += 0.325;
            }
        }
        else if (salary >= 87001 && salary < 180000) {
            tax += 19822;
            for (double i = 87001; i < salary; i++) {
                tax += 0.37;
            }
        }
        else if (salary >= 180000) {
            tax += 54232;
            for (double i = 180000; i < salary; i++) {
                tax += 0.45;
            }
        } else {
            tax = 0;
        }
        long taxrounded = Math.round(tax / 12);
        long netrounded = Math.round(netincome - taxrounded);
        long superrounded = Math.round(salarySuper);
        System.out.println("Your payslip has been generated:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Pay Period " + startDate + " - " + endDate);
        System.out.println("Income tax: " + taxrounded);
        System.out.println("Net income: " + netrounded);
        System.out.println("Super: " + superrounded);

    }
}

//
//        $18,201 – $37,000
//
//        19c for each $1 over $18,200
