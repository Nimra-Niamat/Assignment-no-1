public class Main {
    public static void main(String[] args) {
        PharmacyShop PharmacyShop =new PharmacyShop();
        
        Person owner = new Person("Ahmed Khan","+92000000");
        owner.displayinformation();

        Address  address = new Address("02", "Lahore", "58030");
        address.displayAddress();
    }
}
