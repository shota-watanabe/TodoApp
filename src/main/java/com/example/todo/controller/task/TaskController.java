package com.example.todo.controller.task;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.service.task.TaskService;

@Controller
public class TaskController {

  private final TaskService taskService = new TaskService();

    @GetMapping("/tasks")
    public String list(Model model) {
        // 戻り値にテンプレートを指定
        // テンプレート側で「task」という名前で「Spring Bootを学ぶ」という文字列が渡る
        model.addAttribute("taskList", taskService.find());
        return "tasks/list";
    }
}
