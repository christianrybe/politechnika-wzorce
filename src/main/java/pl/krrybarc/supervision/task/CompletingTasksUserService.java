package pl.krrybarc.supervision.task;

import pl.krrybarc.supervision.user.UserService;

public class CompletingTasksUserService extends UserService {

    private TaskService taskService;

    @Override
    public void finalizeTasks(int userId) {
        taskService.getAllTasksForUser(userId)
                   .forEach(
                       task ->
                           taskService.completeTask(task.getId())
                   );
    }
}
