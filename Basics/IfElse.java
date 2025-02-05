import java.util.InputMismatchException;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks = 0;
        char grade;

        while (true) {
            try {
                System.out.println("Enter your marks:");
                marks = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input..!, Please enter a valid number..!!");
                sc.next();

            }
        }

        if (marks < 25) {
            grade = 'F';
        } else if (marks <= 44) {
            grade = 'E';
        } else if (marks <= 49) {
            grade = 'D';
        } else if (marks <= 59) {
            grade = 'C';
        } else if (marks <= 69) {
            grade = 'B';
        } else if (marks >= 79) {
            grade = 'A';
        } else {
            grade = 'X';
        }

        if (grade == 'X') {
            System.out.println("You entered invalid marks..!!");
        } else {
            System.out.println("Grade :" + grade);
        }
        sc.close();
    }
}
