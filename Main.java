import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please input your first name!");
        String first = myObj.nextLine();
        System.out.println("Please input your last name!");
        String last = myObj.nextLine();
        System.out.println("Please enter your annual salary!");
        String salary = myObj.nextLine();
        System.out.println("Please enter your work start year!");
        String work = myObj.nextLine();

        int worknumber = Integer.parseInt(work);
        int magicyear = worknumber + 65;
        float salarynumber = Float.parseFloat(salary);
        float salarymonth = salarynumber / 12;
        int salaryrounded = Math.round(salarymonth);


        System.out.println("Your magic details are:" + "\n" + "Name:" + first + " " + last + "\n" + "Monthly Salary: " + salaryrounded + "\n" + "Magic Year:" + magicyear);

    }
}
