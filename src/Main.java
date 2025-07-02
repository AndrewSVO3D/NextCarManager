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
        HashMap<String, Car> carList = new HashMap<>();
        VehicleData vehicleData = new VehicleData(
                2020, 35000, "Volkswagen", "Golf GTI", "Autobahn",
                VehicleData.TransType.MANUAL, VehicleData.FuelType.GAS, VehicleData.Drivetrain.FWD,
                4, "Andy"
        );
        SalesData salesData = new SalesData(
                SalesData.TitleType.CLEAN, SalesData.Condition.USED, SalesData.CarType.HATCHBACK,
                SalesData.LotStatus.ON_LOT, 14, 30000
        );

        VehicleData vehicleData2 = new VehicleData(
                2016, 65000, "Volkswagen", "Golf GTI", "SE",
                VehicleData.TransType.AUTOMATIC, VehicleData.FuelType.GAS, VehicleData.Drivetrain.FWD,
                4, "Jacob"
        );
        SalesData salesData2 = new SalesData(
                SalesData.TitleType.CLEAN, SalesData.Condition.USED, SalesData.CarType.HATCHBACK,
                SalesData.LotStatus.ON_LOT, 15, 30000
        );

        VehicleData vehicleData3 = new VehicleData(
                2026, 5, "Volkswagen", "Tiguan", "SEL R-Line",
                VehicleData.TransType.AUTOMATIC, VehicleData.FuelType.GAS, VehicleData.Drivetrain.AWD,
                5, "VinPlaceholder"
        );
        SalesData salesData3 = new SalesData(
                SalesData.TitleType.CLEAN, SalesData.Condition.NEW, SalesData.CarType.SUV,
                SalesData.LotStatus.TRANSIT, 2, 42000
        );

// Create Car objects
        Car car = new Car(vehicleData, salesData);
        Car car2 = new Car(vehicleData2, salesData2);
        Car car3 = new Car(vehicleData3, salesData3);


    }
}
