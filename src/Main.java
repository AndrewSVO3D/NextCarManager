import VehicleData.VehicleData;
import VehicleData.SalesData;
import VehicleData.Car;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    // MENUS
    public static void printMenu() {
        System.out.println("""
                1] Manage Inventory
                2] Manage Customers
                3] Manage Employees
                4] Manage Service
                Enter Choice >""");
    }

    public static void invMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                Inventory Management
                1] Add Vehicle
                2] Remove Vehicle
                3] Search
                """);
        System.out.print("Enter Choice > ");
        int choice = scan.nextInt();
    }

    public static void customerMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                Manage Customers
                1] Purchase Vehicle
                2] Sell Vehicle
                3] Service Appointment
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
                """);
        System.out.print("Enter Choice > ");
        int choice = scan.nextInt();
    }

    public static void main(String[] args) {
        HashMap<String, Car> inventoryMap = new HashMap<>();

        // Sample car
        VehicleData vehicle = new VehicleData(
                2024,
                "Audi",
                "S4",
                "Prestige",
                "VAG001",
                VehicleData.TransType.AUTOMATIC,
                VehicleData.FuelType.GAS,
                VehicleData.Drivetrain.AWD,
                4
        );

        SalesData sales = new SalesData(
                SalesData.TitleType.CLEAN,
                SalesData.Condition.NEW,
                SalesData.CarType.SEDAN,
                "0001",
                SalesData.LotStatus.ON_LOT,
                2,
                70000
        );

        Car car = new Car(vehicle, sales);
        inventoryMap.put(vehicle.getVin(), car);

        for (Map.Entry<String, Car> entry : inventoryMap.entrySet()) {
            Car currentCar = entry.getValue();
            VehicleData v = currentCar.getVehicleData();
            SalesData s = currentCar.getSalesData();

            System.out.println(v.getModelYear() + " " + v.getMake() + " " + v.getModel() +
                    " " + v.getTrim() +
                    "\nVIN: " + v.getVin() +
                    "\nStock Number: " + s.getStockNumber() +
                    "\nLot Status: " + s.getStatus().toString().toLowerCase() +
                    "\nDays on Lot: " + s.getDaysOnLot());
        }

        // Optional menu system (uncomment to activate)
        /*
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
                // VehicleData newVehicle = VehicleData.createVehicle();
                // SalesData newSales = SalesData.createSale();
                // Car newCar = new Car(newVehicle, newSales);
                // inventoryMap.put(newVehicle.getVin(), newCar);
            } else if (menu == 2) {
                customerMenu();
            } else if (menu == 3) {
                employeeMenu();
            } else if (menu == 4) {
                serviceMenu();
            } else {
                System.out.println("Invalid option.");
            }
        }
        */
    }
}
