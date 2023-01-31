import java.util.ArrayList;
import java.util.List;

public class ClientBook {
    private int id;
    private List<Client> clients = new ArrayList<>();

    ClientBook() {

    }

    public ClientBook(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void addClient(Client client) {
        this.clients.add(client);
    }

    public void displayClients() {
        for (Client client : clients) {
            System.out.println("Client ID: " + client.getId());
            System.out.println("Client Name: " + client.getName());
            System.out.println("Client Address: " + client.getAddress());
            System.out.println("Client Phone Number: " + client.getPhoneNumber());
            System.out.println("------------------------------");
        }
    }

    public void assign(ClientBook clientBook) {
        this.id = clientBook.id;
        this.clients = new ArrayList<>(clientBook.clients);
    }

    public void deleteClientFromClientBook(int id) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId() == id) {
                clients.remove(i);
                System.out.println("Client with ID " + id + " has been removed from the ClientBook.");
                return;
            }
        }
        System.out.println("Client with ID " + id + " was not found in the ClientBook.");
    }

}