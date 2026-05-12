package chainofresponsibility;

public class NotificatorManager extends Notificator{
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        System.out.println(client.getNume()+ "Clientul nu a re nimic, a fost trimis notofcare catre manager");
    }
}
