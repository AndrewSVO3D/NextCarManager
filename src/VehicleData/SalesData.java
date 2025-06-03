package VehicleData;

import java.util.Scanner;

public class SalesData {
    public enum TitleType {
        CLEAN, SALVAGE, REBUILT, LEMON
    }

    public enum Condition {
        NEW, USED
    }

    public enum CarType {
        SEDAN, WAGON, HATCHBACK, COUPE, SUV
    }

    public enum LotStatus {
        TRANSIT, PREP, ON_LOT
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

    public LotStatus getStatus() {
        return status;
    }

    public void setStatus(LotStatus status) {
        this.status = status;
    }



    public SalesData createSale() {
        Scanner scan = new Scanner(System.in);

        TitleType title = null;
        while (title == null) {
            System.out.print("Title Type (CLEAN, SALVAGE, REBUILT, LEMON) > ");
            try {
                title = TitleType.valueOf(scan.nextLine().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid title type. Please try again.");
            }
        }

        Condition condition = null;
        while (condition == null) {
            System.out.print("Condition (NEW_VEHICLE, USED_VEHICLE) > ");
            try {
                condition = Condition.valueOf(scan.nextLine().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid condition. Please try again.");
            }
        }

        CarType carType = null;
        while (carType == null) {
            System.out.print("Car Type (SEDAN, WAGON, HATCHBACK, COUPE, SUV) > ");
            try {
                carType = CarType.valueOf(scan.nextLine().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid car type. Please try again.");
            }
        }

        System.out.print("Stock Number > ");
        String stockNumber = scan.nextLine();

        LotStatus status = null;
        while (status == null) {
            System.out.print("Lot Status (IN_TRANSIT, PREP, ON_LOT) > ");
            try {
                status = LotStatus.valueOf(scan.nextLine().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid lot status. Please try again.");
            }
        }

        System.out.print("Days on Lot > ");
        int daysOnLot = scan.nextInt();
        scan.nextLine(); // consume leftover newline

        System.out.print("Sale Price > ");
        int salePrice = scan.nextInt();
        scan.nextLine(); // consume leftover newline

        return new SalesData(title, condition, carType, stockNumber, status, daysOnLot, salePrice);
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
