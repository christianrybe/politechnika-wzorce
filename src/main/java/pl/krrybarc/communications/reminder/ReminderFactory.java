package pl.krrybarc.communications.reminder;

import pl.krrybarc.supervision.user.User;

public class ReminderFactory {

    private static final EmailReminder emailReminder = new EmailReminder();

    private static final SmsReminder smsReminder = new SmsReminder();

    private static final NullReminder nullReminder = new NullReminder();

    public static Reminder createReminder(User user) {
        if (!user.getEmail().isEmpty()) {
            return emailReminder;
        } else if (!user.getPhoneNumber().isEmpty()) {
            return smsReminder;
        } else {
            return nullReminder;
        }
    }
}
