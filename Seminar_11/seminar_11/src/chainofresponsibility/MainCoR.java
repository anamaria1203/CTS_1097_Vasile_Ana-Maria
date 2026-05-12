package chainofresponsibility;

import java.util.Arrays;
import java.util.List;

public class MainCoR {
    public static void main(String[] args) {
        Client client1 = new Client("Client 1", null, "client1@gmail.com");
        Client client2 = new Client("Client 2", "34863784683", null);
        Client client3 = new Client("Cleint 3", null, null);

        Notificator notificatorSMS = new NotificatorSMS();
        Notificator notificatorEmail = new NotificatorEmail();
        Notificator notificatorManager = new NotificatorManager();

        notificatorSMS.setSuccesor(notificatorEmail);
        notificatorEmail.setSuccesor(notificatorManager);

        List<Client> clienti = Arrays.asList(client1, client2, client3);

        clienti.forEach(client -> notificatorSMS.trimiteNotificare(client, "A primit notificarea"));
    }
}
