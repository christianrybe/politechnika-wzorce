package pl.krrybarc.communications;

import pl.krrybarc.communications.notifier.EmailNotifier;
import pl.krrybarc.communications.notifier.Notifier;
import pl.krrybarc.communications.reminder.EmailReminder;
import pl.krrybarc.communications.reminder.Reminder;

public class EmailCommsFactory extends CommsFactory {

    @Override
    public Reminder createReminder() {
        return new EmailReminder();
    }

    @Override
    public Notifier createNotifier() {
        return new EmailNotifier();
    }
}
