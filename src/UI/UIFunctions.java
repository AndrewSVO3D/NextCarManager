package UI;

import VehicleData.Car;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UIFunctions {
    public static void printMenu() {
        System.out.println("""
                
                1] Manage Inventory
                2] Manage Customers
                3] Manage Employees
                4] Manage Service
                """);
        System.out.print("Enter Choice > ");
    }

    public static void invMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                
                Inventory Management
                1] Add Vehicle
                2] Remove Vehicle
                3] Search
                4] Audit Inventory
                5] Exit
                """);
        System.out.print("Enter Choice > ");
        int choice = scan.nextInt();
    }

    public static void printInventory(HashMap<String, Car> inventoryEntry) {
        for (Map.Entry<String, Car> entry : inventoryEntry.entrySet()) {
            System.out.println("\nStock #: " + entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n--------------------------------------------------");
        }
    }

    public static void customerMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                
                Manage Customers
                1] Purchase Vehicle
                2] Sell Vehicle
                3] Service Appointment
                4] Exit
                """);
        System.out.print("Enter Choice > ");
        int choice = scan.nextInt();
    }

    public static void employeeMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                
                Manage Employees
                1] Add Employee
                2] Manage Employee
                3] Search
                4] Exit
                """);
        System.out.print("Enter Choice > ");
        int choice = scan.nextInt();
    }

    public static void serviceMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                
                Manage Service
                1] Appointment Schedule
                2] Schedule Appointment
                3] Appointment Search
                4] Customer Search
                5] Parts Search
                6] Exit
                """);
        System.out.print("Enter Choice > ");
        int choice = scan.nextInt();
    }
}
