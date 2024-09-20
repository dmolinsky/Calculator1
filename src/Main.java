import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int variable1, variable2, result;
        int choice;

        System.out.print("Enter variable 1: ");
        variable1 = scanner.nextInt();

        System.out.print("Enter variable 2: ");
        variable2 = scanner.nextInt();

        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("0. Stop");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    result = variable1 + variable2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = variable1 - variable2;
                    System.out.println("Result: " + result);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Wrong choice, try again.");
            }
        } while (choice != 0);

    }
}
