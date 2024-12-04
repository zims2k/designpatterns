package at.zims2k.decorator.composite;

import at.zims2k.decorator.INotifier;

import java.util.List;

public class CompositeNotifier implements INotifier {
    private final List<INotifier> notifiers;

    public CompositeNotifier(List<INotifier> notifiers) {
        this.notifiers = notifiers;
    }

    @Override
    public void send(String message) {
        notifiers.forEach(notifier -> notifier.send(message));
    }

    @Override
    public String getUsername() {
        return notifiers.isEmpty() ? "" : notifiers.getFirst().getUsername();
    }
}
