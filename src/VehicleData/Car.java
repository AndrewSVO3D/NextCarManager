package VehicleData;

public class Car {

    VehicleData vehicle;
    SalesData sale;

    public Car(VehicleData vehicle, SalesData sale) {
        this.vehicle = vehicle;
        this.sale = sale;
    }

    @Override
    public String toString() {
        return String.format(vehicle.toString() +
                "\nStock Number: #" + sale.getStockNumber() +
                "\nType: " + vehicle.getNumDoors() + "DR " + sale.getCarType().toString().toLowerCase()
                +"\nPrice: $" + sale.getSalePrice());

    }
}
