package Customer;

public class CustomerProfile {

    Address address;
    Name name;

    public CustomerProfile(Name name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String printCustomer() {
        return "Customer Details:" +
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
