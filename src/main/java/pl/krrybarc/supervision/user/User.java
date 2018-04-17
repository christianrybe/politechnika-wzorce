package pl.krrybarc.supervision.user;

import lombok.Data;

@Data
public class User {

    private final int id;

    private String email;

    private String phoneNumber;

    private boolean hasPaidForSms;

    public User(int id) {
        this.id = id;
    }

    public static User createUserWithEmail(int id, String email) {
        User user = new User(id);
        user.email = email;
        return user;
    }

    public static User createUserWithPhone(int id, String phoneNumber, boolean hasPaidForSms) {
        User user = new User(id);
        user.phoneNumber = phoneNumber;
        user.hasPaidForSms = hasPaidForSms;
        return user;
    }

    public static class Builder {

        private final User user;

        public Builder(int id) {
            this.user = new User(id);
        }

        public Builder withPhoneNumber(String phoneNumber) {
            user.phoneNumber = phoneNumber;
            return this;
        }

        public Builder withEmail(String email) {
            user.setEmail(email);
            return this;
        }

        public User build() {
            return user;
        }

    }
}
