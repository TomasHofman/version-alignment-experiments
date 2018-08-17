import io.undertow.client.UndertowClient;

public class HelloWorld {
    private UndertowClient client;

    public void main(String[] args) {
        client = UndertowClient.getInstance();
        System.out.println("Client: " + client);
    }
}
