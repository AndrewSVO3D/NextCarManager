package VehicleData;

public class SalesData {
    public enum TitleType {
        CLEAN, SALVAGE, REBUILT, LEMON
    }

    public enum Condition {
        NEW_VEHICLE, USED_VEHICLE
    }

    public enum CarType {
        SEDAN, WAGON, HATCHBACK, COUPE, SUV
    }

    public enum LotStatus {
        IN_TRANSIT, PREP, ON_LOT
    }

    private TitleType titleType;
    private Condition condition;
    private CarType carType;
    private LotStatus status;
    private String stockNumber;
    private int daysOnLot;
    private int salePrice;


    public SalesData(TitleType titleType, Condition condition, CarType carType, String stockNumber, LotStatus status, int daysOnLot, int salePrice) {
        this.titleType = titleType;
        this.condition = condition;
        this.carType = carType;
        this.status = status;
        this.stockNumber = stockNumber;
        this.daysOnLot = daysOnLot;
        this.salePrice = salePrice;
    }

    public TitleType getTitleType() {
        return titleType;
    }

    public void setTitleType(TitleType titleType) {
        this.titleType = titleType;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public String getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber;
    }

    public int getDaysOnLot() {
        return daysOnLot;
    }

    public void setDaysOnLot(int daysOnLot) {
        this.daysOnLot = daysOnLot;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    @Override
    public String toString() {
        return "SalesData{" +
                "titleType=" + titleType +
                ", condition=" + condition +
                ", carType=" + carType +
                ", stockNumber=" + stockNumber +
                ", daysOnLot=" + daysOnLot +
                ", salePrice=" + salePrice +
                '}';
    }
}
