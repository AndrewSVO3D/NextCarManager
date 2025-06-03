package Customer;

public class CustomerProfile {

    Address address;
    Name name;
    int customerID;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public CustomerProfile(Name name, Address address, int customerID) {
        this.name = name;
        this.address = address;
        this.customerID = customerID;
    }

    public String printCustomer() {
        return "Customer Profile:\n" + "\nCustomer ID: " + getCustomerID() +
                "\nName: " + name.getFirstName() + " " + name.getLastName() +
                "\nPhone Number: " + name.getPhoneNumber() +
                "\nEmail: " + name.getEmail();
    }

    @Override
    public String toString() {
        return "Customer Details: \n" +
                "address=" + address +
                ", \nname=" + name +
                '}';
    }
}
