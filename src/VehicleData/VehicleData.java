package VehicleData;

import java.util.Scanner;

import java.util.Scanner;

public class VehicleData {

    public enum Drivetrain {FWD, RWD, AWD}

    public enum FuelType {GAS, DIESEL, HYBRID, ELECTRIC}

    public enum TransType {MANUAL, AUTOMATIC}

    private Drivetrain drivetrain;
    private FuelType fuelType;
    private TransType transType;
    private String make;
    private String model;
    private String trim;
    private String vin;
    private int numDoors;
    private int modelYear;

    public VehicleData(int modelYear, String make, String model, String trim, String vin, TransType transmission, FuelType fuel, Drivetrain drivetrain, int numDoors) {
        this.drivetrain = drivetrain;
        this.fuelType = fuel;
        this.transType = transmission;
        this.modelYear = modelYear;
        this.make = make;
        this.model = model;
        this.trim = trim;
        this.vin = vin;
        this.numDoors = numDoors;
    }

    public static VehicleData createVehicle() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Year > ");
        int modelYear = scan.nextInt();
        scan.nextLine(); // consume newline

        System.out.print("Make > ");
        String make = scan.nextLine();

        System.out.print("Model > ");
        String model = scan.nextLine();

        System.out.print("Trim > ");
        String trim = scan.nextLine();

        System.out.print("Vin > ");
        String vin = scan.nextLine();

        TransType transType = null;
        while (transType == null) {
            System.out.print("Transmission (Manual/Auto) > ");
            try {
                transType = TransType.valueOf(scan.nextLine().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid transmission type. Try again.");
            }
        }

        FuelType fuelType = null;
        while (fuelType == null) {
            System.out.print("Fuel (Gas, Diesel, Hybrid, Electric > ");
            try {
                fuelType = FuelType.valueOf(scan.nextLine().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid type. Try again.");
            }
        }

        Drivetrain drivetrain = null;
        while (drivetrain == null) {
            System.out.print("Drivetrain (FWD, RWD, AWD) > ");
            try {
                drivetrain = Drivetrain.valueOf(scan.nextLine().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid drivetrain. Try again.");
            }
        }

        System.out.print("Number of doors > ");
        int numDoors = scan.nextInt();
        scan.nextLine(); // consume newline

        return new VehicleData(modelYear, make, model, trim, vin, transType, fuelType, drivetrain, numDoors);
    }

    public Drivetrain getDrivetrain() {
        return drivetrain;
    }

    public void setDrivetrain(Drivetrain drivetrain) {
        this.drivetrain = drivetrain;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public TransType getTransType() {
        return transType;
    }

    public void setTransType(TransType transType) {
        this.transType = transType;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }


    @Override
    public String toString() {
        return "VehicleData{" +
                "drivetrain=" + drivetrain +
                ", fuelType=" + fuelType +
                ", transType=" + transType +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", trim='" + trim + '\'' +
                ", vin='" + vin + '\'' +
                ", numDoors=" + numDoors +
                ", modelYear=" + modelYear +
                '}';
    }
}
