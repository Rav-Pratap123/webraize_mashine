import java.util.Scanner;

public class BeverageMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("===== Beverage Machine =====");

        while (running) {
            printMenu();
            System.out.print("Choose your beverage: ");

            if (!scanner.hasNextInt()) {
                if (!scanner.hasNextLine()) {
                    break;
                }
                System.out.println("Please enter a number from 1 to 3.");
                scanner.nextLine();
                continue;
            }

            int choice = scanner.nextInt();
            Beverage beverage = createBeverage(choice);

            if (beverage == null) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.println();
            System.out.println("Beverage: " + beverage.getName());
            System.out.println("Preparing " + beverage.getName() + "...");
            System.out.println(beverage.getName() + "  is ready!");
            System.out.println();
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("1. Coffee");
        System.out.println("2. Juice");
        System.out.println("3. Wine");
    }

    private static Beverage createBeverage(int choice) {
        switch (choice) {
            case 1:
                return new Coffee();
            case 2:
                return new Juice();
            case 3:
                return new Wine();
            default:
                return null;
        }
    }
}
