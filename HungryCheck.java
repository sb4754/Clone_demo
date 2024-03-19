import java.util.Scanner;

public class HungryCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Clearing the terminal screen
        clearScreen();

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

    // Method to clear the terminal screen
    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (Exception e) {
            // Handle any exceptions
            e.printStackTrace();
        }
    }
}