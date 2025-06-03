import java.util.Scanner;

public class Main {
   // MENUS
    public static void printMenu() {
        System.out.println("""
                1] Manage Inventory
                2] Manage Customers
                3] Manage Employees
                3] Manage Service
                """ + "\nEnter Choice >");
    }

    public static void invMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inventory Management " + "\n" + """
                1] Add Vehicle
                2] Remove Vehicle
                3] Search
                """);
        System.out.println("\nEnter Choice >");
        int choice = scan.nextInt();

    }

    public static void customerMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Manage Customers " + "\n" + """
                1] Purchase Vehicle
                2] Sell Vehicle
                3] Service Appointment
                """);
        System.out.println("\nEnter Choice >");
        int choice = scan.nextInt();
    }

    public static void employeeMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Manage Employees " + "\n" + """
                1] Add Employee
                2] Manage Employee
                3] Search
                """);
        System.out.println("\nEnter Choice >");
        int choice = scan.nextInt();

    }

    public static void serviceMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Manage Service " + "\n" + """
                1] Appointment Schedule
                2] Schedule Appointment
                3] Appointment Search
                4] Customer Search
                5] Parts Search
                """ + "\nEnter Choice >");
        int choice = scan.nextInt();

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu;
        while (true) {
            printMenu();
            if (!scan.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scan.nextLine();
                continue;
            }

            menu = scan.nextInt();
            scan.nextLine();

            if (menu == 1) {
                invMenu();
            }
            if (menu == 2) {
                customerMenu();
            }
            if (menu == 3) {
                employeeMenu();
            }
            if (menu == 4) {
                serviceMenu();
            } else {
                break;
            }
        }

    }
}
