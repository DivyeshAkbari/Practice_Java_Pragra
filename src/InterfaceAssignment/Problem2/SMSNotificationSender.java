package InterfaceAssignment.Problem2;

public class SMSNotificationSender implements NotificationSender,SMSNotification {

   private String message;
   private String number;

    @Override
    public void sendNotification(String message) {

        this.message = message;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.number=phoneNumber;
    }

    @Override
    public void SendSMSNotification() {

        System.out.println("Sending SMS Notification to this "+number+" with the message "+message);

    }
}
