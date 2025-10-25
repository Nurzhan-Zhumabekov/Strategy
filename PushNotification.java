public class PushNotification implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("Sending PUSH notification: " + message);
    }
}