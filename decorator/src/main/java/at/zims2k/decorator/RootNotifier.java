package at.zims2k.decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RootNotifier implements INotifier {

    private final String userName;

    @Override
    public void send(String message) {
        // Simply does nothing. Purpose of this class is to provide the userName.
    }

    @Override
    public String getUsername() {
        return userName;
    }
}
