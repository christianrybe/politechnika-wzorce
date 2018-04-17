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

    //<static-factory-method>

    //<builder>
}
