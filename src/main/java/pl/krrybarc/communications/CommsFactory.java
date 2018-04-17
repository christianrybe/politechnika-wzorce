package pl.krrybarc.communications;

import pl.krrybarc.communications.notifier.Notifier;
import pl.krrybarc.communications.reminder.Reminder;
import pl.krrybarc.supervision.user.User;

public abstract class CommsFactory {

    private static final NullCommsFactory nullCommsFactory = new NullCommsFactory();
    private static final SmsCommsFactory smsCommsFactory = new SmsCommsFactory();
    private static final EmailCommsFactory emailCommsFactory = new EmailCommsFactory();

    public static CommsFactory getFactory(User user) {
        if (!user.getEmail().isEmpty()) {
            return emailCommsFactory;
        } else if (!user.getPhoneNumber().isEmpty()) {
            return smsCommsFactory;
        } else {
            return nullCommsFactory;
        }
    }

    public abstract Reminder createReminder();

    public abstract Notifier createNotifier();

}
