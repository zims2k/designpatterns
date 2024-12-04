package at.zims2k.decorator;

import at.zims2k.decorator.composite.CompositeNotifier;
import at.zims2k.decorator.decorators.FirewalledNotifierDecorator;
import at.zims2k.decorator.decorators.MailNotifierDecorator;
import at.zims2k.decorator.decorators.SendToAdminMailNotifierDecorator;
import at.zims2k.decorator.decorators.YoutrackNotifierDecorator;

import java.util.List;

/**
 * <p>
 *     Demonstrates the decorator pattern. The example demonstrates how each decorator
 *     extends the functionality via a wrapper mechanism.
 *     The advantage of this pattern here is, that each implementation of a notifier resides on it's own and is close
 *     to modification.
 * </p>
 * <p>
 *     The real benefit of the decorator pattern can be seen at the level of the {@link FirewalledNotifierDecorator},
 *     which adds functionality to check, if a message can be sent. For simplicity, the check functionality is
 *     mocked by a simple flag in the {@link FirewalledNotifierDecorator}'s constructor. Note, that the
 *     {@link FirewalledNotifierDecorator} is simply added as a wrapping object without the need of touching existing
 *     classes or mess with the inheritance of classes or something else.
 * </p>
 */
public class Main {
    public static void main(String[] args) {

        DefaultNotifierWrapper defaultNotifierWrapper = new DefaultNotifierWrapper("userA");

        List<INotifier> notifiers = List.of(
                new FirewalledNotifierDecorator(
                        new SendToAdminMailNotifierDecorator(
                                new MailNotifierDecorator(defaultNotifierWrapper, "mail.example.com")), false),
                new FirewalledNotifierDecorator(
                        new YoutrackNotifierDecorator(defaultNotifierWrapper, "youtrack.example.com"), true)
        );

        INotifier compositeNotifier = new CompositeNotifier(notifiers);
        compositeNotifier.send("My message");
    }
}
