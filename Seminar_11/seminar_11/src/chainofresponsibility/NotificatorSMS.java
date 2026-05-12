package chainofresponsibility;

public class NotificatorSMS extends Notificator{

    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if(client.getNrTelefon() != null && !client.getNrTelefon().isEmpty()){
            System.out.println(client.getNume()+ "a primit notificarea" + mesaj);
        }else if(super.getSuccesor()!=null){
            super.getSuccesor().trimiteNotificare(client, mesaj);
        }else{
            System.out.println("Clientul nu are nr de telefon si nu are succesor");
        }
    }
}
