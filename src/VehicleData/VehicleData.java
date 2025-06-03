package VehicleData;

public class VehicleData {

    public enum Drivetrain {FWD, RWD, AWD}

    public enum FuelType {GASOLINE, DIESEL, HYBRID, ELECTRIC}

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

    public String printBasicDetails(){
        return getModelYear() + " " + getMake() + " " + getModel() + " " + getTrim() +
                "\nVIN: " + getVin();
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
