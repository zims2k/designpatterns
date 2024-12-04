package at.zims2k.decorator.decorators;

import at.zims2k.decorator.INotifier;
import lombok.Getter;

@Getter
public class MailNotifierDecorator extends BaseNotifierDecorator {

    private final String mailServer;

    public MailNotifierDecorator(INotifier wrappedINotifier, String mailServer) {
        super(wrappedINotifier);
        this.mailServer = mailServer;
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.printf("Sending notification by mail to %s: %s%n", databaseService.getMailAddressForUsername(getUsername()), message);
    }


}
