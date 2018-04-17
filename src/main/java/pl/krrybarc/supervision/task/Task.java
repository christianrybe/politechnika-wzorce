package pl.krrybarc.supervision.task;

import java.util.List;

import lombok.Data;

@Data
public class Task {

    private final int id;

    private final int userId;

    private final List<Integer> contributors;
}
