import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        KittenDormService kittenDormService = new KittenDormService();
        KittenDormAdapter adapter = new KittenDormAdapter(kittenDormService);

        System.out.println("Welcome to KittenDorm!");

        while (true) {
            System.out.print("Are you a service staff or owner? (Enter 'staff' or 'owner' or 'q' to quit): ");
            String userType = scanner.nextLine();

            if ("q".equalsIgnoreCase(userType)) {
                System.out.println("Goodbye!");
                break;
            }

            if ("staff".equalsIgnoreCase(userType)) {
                System.out.print("Enter found cat's name (on the collar): ");
                String collarName = scanner.nextLine();
                System.out.print("Enter found cat's age: ");
                int age = Integer.parseInt(scanner.nextLine());
                RawKittenData rawKittenData = new RawKittenData(collarName, age);

                kittenDormService.addFoundKitten(rawKittenData);

                System.out.println("Added found cat: " + collarName);
            } else if ("owner".equalsIgnoreCase(userType)) {
                System.out.print("Enter the kitten's name on the collar (or 'q' to quit): ");
                String collarName = scanner.nextLine();

                if ("q".equalsIgnoreCase(collarName)) {
                    System.out.println("Goodbye!");
                    break;
                }

                KittenInfo kittenInfo = adapter.getKittenInfo(collarName);

                if (kittenInfo != null) {
                    System.out.println("Kitten Info:");
                    System.out.println("Name: " + kittenInfo.getName());
                    System.out.println("Age: " + kittenInfo.getAge());
                } else {
                    System.out.println("Kitten not found.");
                }
            } else {
                System.out.println("Invalid input. Please enter 'staff', 'owner', or 'q' to quit.");
            }
        }
    }
}
