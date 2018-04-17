package pl.krrybarc.supervision.task;

import pl.krrybarc.supervision.user.UserService;

public class DeletingTasksUserService extends UserService {

    private TaskService taskService;

    @Override
    public void finalizeTasks(int userId) {
        taskService.getAllTasksForUser(userId)
                   .forEach(
                       task ->
                           taskService.deleteTask(task.getId())
                   );
    }
}
