package Constructor.java;

public class ClientmainClass {
    public static void main(String[] args) {
        client cl = new client("Anil","Vasai",50000);
        System.out.println(cl.getName());
        System.out.println(cl.getAddress());
        System.out.println(cl.getPrice());
    }
}
