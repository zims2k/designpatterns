package at.zims2k.decorator.decorators;

import at.zims2k.decorator.INotifier;

import java.io.PrintStream;

public class FirewalledNotifierDecorator extends BaseNotifierDecorator {
    private final boolean sendIsAllowed;

    public FirewalledNotifierDecorator(INotifier wrappedINotifier, boolean sendIsAllowed) {
        super(wrappedINotifier);
        this.sendIsAllowed = sendIsAllowed;
    }

    @Override
    public void send(String message) {
        // mock checking:
        if (sendIsAllowed) {
            System.out.println("INFO: FirewalledNotifierDecorator allows sending the message");
            printWrapperChain(System.out);

            super.send(message);
        } else {
            System.err.println("ERROR: CANNOT SEND MESSAGE. FirewalledNotifierDecorator disallowed sending the message");
            printWrapperChain(System.err);
        }
    }

    private void printWrapperChain(PrintStream printStream) {
        printStream.println("WRAPPER CHAIN:");

        for (INotifier currentNotifier = this; currentNotifier != currentNotifier.getWrappedNotifier(); currentNotifier = currentNotifier.getWrappedNotifier()) {
            printStream.printf("- %s%n", currentNotifier.getClass().getSimpleName());
        }
    }
}
