import java.util.Scanner;

public class HungryCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you hungry? (yes/no)");
        String response = scanner.nextLine().toLowerCase();

        if (response.equals("yes")) {
            System.out.println("You are hungry. You should consider having a meal.");
        } else if (response.equals("no")) {
            System.out.println("You are not hungry. Enjoy your day!");
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
        }

        scanner.close();
    }
}