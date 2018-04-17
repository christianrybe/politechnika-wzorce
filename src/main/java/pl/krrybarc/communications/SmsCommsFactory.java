package pl.krrybarc.communications;

import pl.krrybarc.communications.notifier.Notifier;
import pl.krrybarc.communications.notifier.SmsNotifier;
import pl.krrybarc.communications.reminder.Reminder;
import pl.krrybarc.communications.reminder.SmsReminder;

public class SmsCommsFactory extends CommsFactory {

    @Override
    public Reminder createReminder() {
        return new SmsReminder();
    }

    @Override
    public Notifier createNotifier() {
        return new SmsNotifier();
    }
}
