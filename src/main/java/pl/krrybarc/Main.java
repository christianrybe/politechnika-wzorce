package pl.krrybarc;

import java.util.Random;

import pl.krrybarc.animals.bird.Bird;
import pl.krrybarc.supervision.user.User;

public class Main {

    public static void main(String[] args) {
        int userId = new Random().nextInt();
        User user = new User.Builder(userId)
            .withEmail("email")
            .withPhoneNumber("phoneNUmber")
            .build();
    }

}
