package pl.krrybarc.communications.notifier;

import pl.krrybarc.supervision.user.User;

public class NotifierFactory {

    private static final EmailNotifier emailNotifier = new EmailNotifier();

    private static final SmsNotifier smsNotifier = new SmsNotifier();

    private static final NullNotifier nullNotifier = new NullNotifier();

    public static Notifier createNotifier(User user) {
        if (!user.getEmail().isEmpty()) {
            return emailNotifier;
        } else if (!user.getPhoneNumber().isEmpty()) {
            return smsNotifier;
        } else {
            return nullNotifier;
        }
    }
}
