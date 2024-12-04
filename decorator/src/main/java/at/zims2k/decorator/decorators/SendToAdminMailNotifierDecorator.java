package at.zims2k.decorator.decorators;

import at.zims2k.decorator.INotifier;

public class SendToAdminMailNotifierDecorator extends BaseNotifierDecorator {

    public SendToAdminMailNotifierDecorator(INotifier wrappedINotifier) {
        super(wrappedINotifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.printf("Sending notification by mail to %s: THIS IS AN ADMIN COPY OF THE MESSAGE: %s%n", "admin@company.com", message);
    }
}
