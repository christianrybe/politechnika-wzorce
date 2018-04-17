package pl.krrybarc.communications;

import pl.krrybarc.communications.notifier.Notifier;
import pl.krrybarc.communications.notifier.NullNotifier;
import pl.krrybarc.communications.reminder.NullReminder;
import pl.krrybarc.communications.reminder.Reminder;

public class NullCommsFactory extends CommsFactory {

    @Override
    public Reminder createReminder() {
        return new NullReminder();
    }

    @Override
    public Notifier createNotifier() {
        return new NullNotifier();
    }
}
