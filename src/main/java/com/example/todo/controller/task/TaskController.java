package com.example.todo.controller.task;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {

    @GetMapping("/tasks")
    public String list(Model model) {
        // 戻り値にテンプレートを指定
        // テンプレート側で「task」という名前で「Spring Bootを学ぶ」という文字列が渡る
        model.addAttribute("task", "Spring Bootを学ぶ");
        return "tasks/list";
    }
}
