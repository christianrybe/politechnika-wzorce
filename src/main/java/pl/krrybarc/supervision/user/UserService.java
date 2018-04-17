package pl.krrybarc.supervision.user;

import java.util.HashMap;
import java.util.Map;

public abstract class UserService {

    private Map<Integer, User> users = new HashMap<>();

    public User getUserById(int id) {
        return users.get(id);
    }

    public User deleteUser(int id) {
        //<template-method>
        return null;
    }
}
