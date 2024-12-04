package at.zims2k.decorator.decorators;

import at.zims2k.decorator.INotifier;
import at.zims2k.decorator.service.DatabaseService;

public abstract class BaseNotifierDecorator implements INotifier {
    private final INotifier wrappedINotifier;
    protected final DatabaseService databaseService;

    public BaseNotifierDecorator(INotifier wrappedINotifier) {
        this.wrappedINotifier = wrappedINotifier;
        this.databaseService = new DatabaseService(); // e.g. from somewhere injected...
    }

    @Override
    public void send(String message) {
        wrappedINotifier.send(message);
    }

    @Override
    public String getUsername() {
        return wrappedINotifier.getUsername();
    }
}
