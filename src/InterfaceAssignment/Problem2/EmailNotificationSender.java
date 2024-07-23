package InterfaceAssignment.Problem2;

public class EmailNotificationSender implements NotificationSender ,EmailNotification{


   private String mail;

    EmailNotificationSender(String mail)
    {
        this.mail = mail;
    }
    @Override
    public void settingRecipients() {
        System.out.println("Receipents mail ID is SettedUp");
        System.out.println("Mail id is "+mail);
    }

    @Override
    public void sendingEmailNotification() {
        System.out.println("Email notification sent to "+mail);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending message "+message +" to "+mail);
    }
}
