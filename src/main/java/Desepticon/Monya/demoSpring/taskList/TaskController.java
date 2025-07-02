package Desepticon.Monya.demoSpring.taskList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskService taskService;
    // внедрение зависимостей через конструктор
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Task>> getAllTasks() {
        return new ResponseEntity<>(taskService.getAllTasks(), HttpStatus.OK);

    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Task> getTask(@PathVariable("id") Long id) {
        Task task = taskService.getTask(id);
        if (task != null) {
            return new ResponseEntity<>(task, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    //такой способ для внесения в базу информации прямо адресной строки. В адресной строке любой ввод - это метод GET
    @RequestMapping(value = "/id/{id}/name/{name}/description/{description}/completed/{completed}", method = RequestMethod.GET)
       public ResponseEntity<Task> createTask(@PathVariable("id") Long id,
                                           @PathVariable("name") String name,
                                           @PathVariable("description") String description,
                                           @PathVariable("completed") boolean completed
    )
    {
        return new ResponseEntity<>(taskService.createTask(new Task(id,name,description,completed)),
                HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Task> createTask(@RequestBody Task newTask) {
        return new ResponseEntity<>(taskService.createTask(newTask),
                HttpStatus.CREATED);
    }




    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//@PutMapping(value = "/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable("id") Long id, @RequestBody
    Task updatedTask) {
        Task task = taskService.updateTask(id, updatedTask);
        if (task != null) {
            return new ResponseEntity<>(task, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteTask(@PathVariable("id") Long id) {
        taskService.deleteTask(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}