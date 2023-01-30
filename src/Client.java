import java.util.Scanner;

class Client {
    private int id;
    private String name;
    private String address;
    private String phoneNumber;

    Client(){

    }
    public Client(int id, String name, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void addClientFromInput(ClientBook clientBook) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter client ID: ");
        int id = sc.nextInt();
        System.out.print("Enter client name: ");
        String name = sc.next();
        System.out.print("Enter client address: ");
        String address = sc.next();
        System.out.print("Enter client phone number: ");
        String phoneNumber = sc.next();
        Client newClient = new Client(id, name, address, phoneNumber);
        clientBook.addClient(newClient);
    }

    public void assign(Client otherClient) {
        this.id = otherClient.id;
        this.name = otherClient.name;
        this.address = otherClient.address;
        this.phoneNumber = otherClient.phoneNumber;
    }

}
