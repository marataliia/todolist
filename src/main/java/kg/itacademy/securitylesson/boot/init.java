package kg.itacademy.securitylesson.boot;
import kg.itacademy.securitylesson.entity.Task;
import kg.itacademy.securitylesson.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class init implements CommandLineRunner {
    @Autowired
    private TaskService taskService;
    @Override
    public void run(String... args) throws Exception {
//        taskService.create(new Task("First task", "Create app", true));
//        taskService.create(new Task("Second task", "Create app", false));
//        taskService.create(new Task("Third task", "Create app", false));
//        taskService.create(new Task("Fourth task", "Create app", true));
//        taskService.create(new Task("Fifth task", "Create app", false));
    }
}
