package pl.krrybarc.supervision.task;

import pl.krrybarc.communications.CommsFactory;
import pl.krrybarc.supervision.user.UserService;

public class TaskSummariser {

    private UserService userService;

    private static TaskSummariser INSTANCE;

    public TaskSummariser(UserService userService) {
        this.userService = userService;
    }

    public void add(Task task) {
        CommsFactory commsFactory = CommsFactory.getFactory(userService.getUserById(task.getUserId()));
        if (commsFactory != null) {
            commsFactory.createNotifier().notify(task);
        }
    }
}
