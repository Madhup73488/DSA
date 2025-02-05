// Implementing ATM system

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total_balance = 42000;
        while (true) {
            System.out.println("Welcome to ATM :");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("Enter your choice :");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Your current balance is : " + total_balance);
                    break;
                }
                case 2: {
                    while (true) {
                        System.out.println("Enter the amount to deposit : ");
                        int depositAmount = sc.nextInt();
                        if (depositAmount > 0) {
                            total_balance += depositAmount;
                            System.out.println("Amount deposited successfully!!");
                            System.out.println("Your current balance is :" + total_balance);
                            break;
                        } else {
                            System.out.println("Invalid deposit amount..!");
                            continue;
                        }
                    }
                    break;

                }

                case 3: {
                    System.out.println("Enter amount to withdraw : ");
                    int withdrawAmount = sc.nextInt();
                    if (withdrawAmount > total_balance) {
                        System.out.println("Insufficient balance..!");
                        break;
                    } else {
                        total_balance -= withdrawAmount;
                        System.out.println("Amount withdrawn successfully");
                        System.out.println("Your Current balance is :" + total_balance);
                        break;
                    }
                }

                case 4: {
                    System.out.println("Thankyou for visiting ATM...!");
                    return;
                }

                default: {
                    System.out.println("Invalid choice....!!!!, please enter a valid choice");
                    break;
                }
            }
        }

    }
}
