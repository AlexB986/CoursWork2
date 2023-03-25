package skypro;

import java.util.Collection;
import java.util.Map;

public class TaskService {
    private Map<Integer,Task> taskMap;
    private Collection<Task> removedTasks;

    public TaskService(Map<Integer,Task> taskMap) {
        this.taskMap=taskMap;
    }


}
