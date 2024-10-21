package com.example.todo.controller.task;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.todo.task.TaskService;

import lombok.RequiredArgsConstructor;

@Controller
// Requiredな引数を初期化する(finalなど)
@RequiredArgsConstructor
public class TaskController {

  private final TaskService taskService;

    @GetMapping("/tasks")
    public String list(Model model) {
        var taskList = taskService.find()
            .stream()
            .map(TaskDTO::toDTO)
            .toList();
        // 戻り値にテンプレートを指定
        // テンプレート側で「task」という名前で「Spring Bootを学ぶ」という文字列が渡る
        model.addAttribute("taskList", taskList);
        return "tasks/list";
    }
}
