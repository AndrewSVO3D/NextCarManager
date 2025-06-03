package VehicleData;

public class Car {

    private VehicleData vehicleData;
    private SalesData salesData;

    VehicleData vehicle;
    SalesData sale;

    public Car(VehicleData vehicle, SalesData sale) {
        this.vehicle = vehicle;
        this.sale = sale;
    }

    public VehicleData getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleData vehicle) {
        this.vehicle = vehicle;
    }

    public SalesData getSale() {
        return sale;
    }

    public void setSale(SalesData sale) {
        this.sale = sale;
    }

    public VehicleData getVehicleData() {
        return vehicleData;
    }

    public SalesData getSalesData() {
        return salesData;
    }

    public String printVehicle() {
        return "%d %s %s %s\nVIN: %s \nTransmission: %s \nDrivetrain: %s\nFuel: %s\nDoors: %dDR %s".formatted(vehicle.getModelYear(), vehicle.getMake(), vehicle.getModel(), vehicle.getTrim(), vehicle.getVin(), vehicle.getTransType(), vehicle.getDrivetrain(), vehicle.getFuelType(), vehicle.getNumDoors(), sale.getCarType().toString().toLowerCase());
    }

    public String printSale() {
        return "Stock Number: %s\nSale Price $%d\nDays on Lot: %s\n".formatted(sale.getStockNumber(), sale.getSalePrice(), sale.getDaysOnLot());
    }

    @Override
    public String toString() {
        return String.format(vehicle.toString() +
                "\nStock Number: #" + sale.getStockNumber() +
                "\nType: " + vehicle.getNumDoors() + "DR " + sale.getCarType().toString().toLowerCase()
                + "\nPrice: $" + sale.getSalePrice());

    }
}
