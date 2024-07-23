package InterfaceAssignment.Problem2;

public class TestMain {
    public static void main(String[] args) {


        EmailNotificationSender e1=new EmailNotificationSender("divyeshakabari01@gmail.com");
        e1.settingRecipients();
        e1.sendingEmailNotification();
        e1.sendNotification("How are you??");

        PushNoticationSender p1=new PushNoticationSender();

        p1.sendNotification("Hiii there");
        p1.sendingPushNotifications();

        SMSNotificationSender s1=new SMSNotificationSender();
        s1.sendNotification("Hi there");
        s1.setPhoneNumber("2896232310");
        s1.SendSMSNotification();
    }
}
