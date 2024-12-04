package at.zims2k.decorator.decorators;

import at.zims2k.decorator.INotifier;
import lombok.Getter;

@Getter
public class YoutrackNotifierDecorator extends BaseNotifierDecorator {

    private final String youtrackServer;

    public YoutrackNotifierDecorator(INotifier wrappedINotifier, String youtrackServer) {
        super(wrappedINotifier);
        this.youtrackServer = youtrackServer;
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.printf("Sending notification by YouTrack to %s: %s%n", databaseService.getYoutrackUserForUsername(getUsername()), message);
    }
}
