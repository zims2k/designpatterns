package at.zims2k.decorator;

import at.zims2k.decorator.decorators.MailNotifierDecorator;
import at.zims2k.decorator.decorators.YoutrackNotifierDecorator;

/**
 * Demonstrates the decorator pattern. It is not a very, very good example, but it demonstrates how each decorator
 * extends the functionality via a wrapper mechanism. E.g. in this case here:
 * <ul>
 *     <li>{@link RootNotifier} does nothing</li>
 *     <li>{@link MailNotifierDecorator} extends the {@link RootNotifier}</li>
 *     <li>{@link YoutrackNotifierDecorator} extends the {@link MailNotifierDecorator}</li>
 * </ul>
 * The advantage of this pattern here is, that each implementation of a notifier resides on it's own and is close
 * to modification.
 */
public class Main {
    public static void main(String[] args) {

        RootNotifier rootNotifier = new RootNotifier("userA");

        MailNotifierDecorator mailDecorator = new MailNotifierDecorator(rootNotifier, "mail.example.com");
        @SuppressWarnings("UnnecessaryLocalVariable")
        YoutrackNotifierDecorator youtrackDecorator = new YoutrackNotifierDecorator(mailDecorator, "youtrack.example.com");

        @SuppressWarnings("UnnecessaryLocalVariable")
        INotifier notifier = youtrackDecorator;

        notifier.send("My message");
    }
}
