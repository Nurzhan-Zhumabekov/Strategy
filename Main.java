public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService(new EmailNotification());
        service.notifyUser("Welcome to our app!");

        service.setStrategy(new SMSNotification());
        service.notifyUser("Your verification code is 1234.");

        service.setStrategy(new PushNotification());
        service.notifyUser("You have a new message.");
    }
}
