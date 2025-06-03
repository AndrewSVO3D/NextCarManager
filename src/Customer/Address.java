package Customer;

public class Address {
    private int bldNumber;
    private String street;
    private String city;
    private String state;
    private int zipCode;

    public Address(int bldNumber, String street, String city, String state, int zipCode) {
        this.bldNumber = bldNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public int getBldNumber() {
        return bldNumber;
    }

    public void setBldNumber(int bldNumber) {
        this.bldNumber = bldNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "bldNumber=" + bldNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}

