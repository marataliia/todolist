package kg.itacademy.securitylesson.controller;

import kg.itacademy.securitylesson.entity.Task;
import kg.itacademy.securitylesson.model.TaskModel;
import kg.itacademy.securitylesson.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TestController {
    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getAll(){
        return taskService.getAll();
    }

    @GetMapping("/{id}")
    public Task getById(@PathVariable Long id){
        return taskService.getById(id);
    }

    @PostMapping("/old")
    public Task create (@RequestBody Task task){
        return taskService.create(task);
    }

    @PostMapping
    public Task create(@RequestBody TaskModel taskModel, Principal principal){
        return taskService.create(taskModel, principal.getName());
    }

    @DeleteMapping
    public Task deleteById(@RequestHeader(name = "id") Long id){
        return taskService.deleteById(id);
    }

    @PutMapping
    public Task update(@RequestBody Task task){
        return taskService.update(task);
    }

    @GetMapping("/title")
    public List<Task> searchByTitle(@RequestHeader String title){
        return taskService.searchByTitle(title);
    }

    @GetMapping("/text")
    public List<Task> searchByText(@RequestHeader String text){
        return taskService.searchByText(text);
    }

    @GetMapping("/my-tasks")
    public List<Task> getTaskByToken(Principal principal){
        return taskService.getAllByUserLogin(principal.getName());
    }


}
