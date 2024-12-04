package at.zims2k.decorator;

public interface INotifier {
    void send(String message);

    String getUsername();

    INotifier getWrappedNotifier();
}
