package InterfaceAssignment.Problem2;

public class PushNoticationSender implements NotificationSender,PushNotifications {


    private String message;

    @Override
    public void sendNotification(String message) {
        this.message = message;
        System.out.println("The Message is  "+message);
    }

    @Override
    public void sendingPushNotifications() {
        System.out.println("Sending Push Notifications with the message "+message);
    }
}
