package Utilities;

import VehicleData.VehicleData;
import VehicleData.SalesData;
import VehicleData.Car;

import java.sql.*;
import java.util.HashMap;

public class InventoryLotManager {
    private static final String URL = "jdbc:mysql://localhost:3306/DealershipDatabase"; // your DB
    private static final String USER = "root"; // your username
    private static final String PASSWORD = "AndrewGTI01"; // your password

    public void insertCars(HashMap<String, Car> cars) {
        String insertSQL = "INSERT INTO cars (vin, year ,make, model, trim, transmission, fuel, drivetrain, doors, condition, carType, status, daysOnLot, salePrice, mileage) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = conn.prepareStatement(insertSQL);) {

            for (Car car : cars.values()) {
                VehicleData vehicleData = car.getVehicleData();
                SalesData salesData = car.getSalesData();

                statement.executeUpdate();
            }
            System.out.println("All cars inserted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
