package Desepticon.Monya.demoSpring.taskList;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    private List<Task> tasks = new ArrayList<>();

    TaskService (){

        tasks.add(new Task(1L,"myFirstSBServer","realized List of tasks",true));
    }


    public List<Task> getAllTasks() {
        return tasks;
    }
    public Task getTask(Long id) {
        return tasks.stream()
                .filter(task-> task.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    public Task createTask(Task task) {
               tasks.add(task);
        return task;
    }
    public Task updateTask(Long id, Task updatedTask) {
        Task existingTask = getTask(id);
        if (existingTask != null) {
            existingTask.setName(updatedTask.getName());
            existingTask.setDescription(updatedTask.getDescription());
            existingTask.setCompleted(updatedTask.isCompleted());
        }
        return existingTask;
    }
    public void deleteTask(Long id) {
        tasks.removeIf(task-> task.getId().equals(id));
    }
}
