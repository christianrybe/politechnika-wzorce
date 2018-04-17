package pl.krrybarc.supervision.task;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import lombok.RequiredArgsConstructor;
import pl.krrybarc.supervision.user.User;
import pl.krrybarc.supervision.user.UserService;

@RequiredArgsConstructor
public class TaskService {

    private final UserService userService;

    private final Map<Integer, Task> tasks = new HashMap<>();

    private final AtomicInteger counter = new AtomicInteger();

    private final TaskSummariser taskSummariser;

    public Task createTaskForUser(int userId, Integer... contributors) {
        Task task = new Task(counter.incrementAndGet(), userId,
                             contributors != null ? Arrays.asList(contributors) : Collections.emptyList());
        tasks.put(task.getId(), task);
        return task;
    }

    public Collection<Task> getAllTasksForUser(int userId) {
        //ASSUME RETURNS TASKS CORRECTLY ;)
        return Collections.EMPTY_LIST;
    }

    public void deleteTask(int taskId) {
        tasks.remove(taskId);
    }

    public void completeTask(int taskId) {
        Task task = tasks.get(taskId);
        List<Integer> userIds = new ArrayList(task.getContributors());
        userIds.add(task.getUserId());

        Set<String> emails = userIds.stream()
                                    .map(userService::getUserById)
                                    .map(User::getEmail)
                                    .collect(Collectors.toSet());

        taskSummariser.add(task);
    }

}
