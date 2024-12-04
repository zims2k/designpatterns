package at.zims2k.decorator;

import at.zims2k.decorator.composite.CompositeNotifier;
import at.zims2k.decorator.decorators.MailNotifierDecorator;
import at.zims2k.decorator.decorators.YoutrackNotifierDecorator;

import java.util.List;

/**
 * Demonstrates the decorator pattern. The example demonstrates how each decorator
 * extends the functionality via a wrapper mechanism.
 * The advantage of this pattern here is, that each implementation of a notifier resides on it's own and is close
 * to modification.
 */
public class Main {
    public static void main(String[] args) {

        DefaultNotifierWrapper defaultNotifierWrapper = new DefaultNotifierWrapper("userA");

        List<INotifier> notifiers = List.of(
                new MailNotifierDecorator(defaultNotifierWrapper, "mail.example.com"),
                new YoutrackNotifierDecorator(defaultNotifierWrapper, "youtrack.example.com")
        );

        INotifier compositeNotifier = new CompositeNotifier(notifiers);
        compositeNotifier.send("My message");
    }
}