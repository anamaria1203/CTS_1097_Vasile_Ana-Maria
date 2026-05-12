package chainofresponsibility;

public class NotificatorEmail extends Notificator{

    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if(client.getEmail() != null && !client.getEmail().isEmpty()){
            System.out.println(client.getNume()+ "a primit notificarea" + mesaj);
        }else if(super.getSuccesor()!=null){
            super.getSuccesor().trimiteNotificare(client, mesaj);
        }else{
            System.out.println("Clientul nu are email si nu are succesor");
        }
    }
}
