package at.zims2k.decorator;

import lombok.RequiredArgsConstructor;

/**
 * Acts as a notifier, that does not notify in any way. Just to provide a notifier to provide the userName of the
 * software that is represented by this gradle module.
 */
@RequiredArgsConstructor
public class DefaultNotifierWrapper implements INotifier {

    private final String userName;

    @Override
    public void send(String message) {
        // Simply does nothing. Purpose of this class is to provide the userName.
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public INotifier getWrappedNotifier() {
        return this;
    }
}
