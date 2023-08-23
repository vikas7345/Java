package Constructor.java;

public class client {
    String Name;
    String Address;
    int Price;

    public client(String name,String Address, int price) {
       this.Name = name;
       this.Address = Address;
        this.Price = price;
    }

    public int getPrice() {
        return Price;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }
}
