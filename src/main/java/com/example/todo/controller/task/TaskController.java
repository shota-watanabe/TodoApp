package com.example.todo.controller.task;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TaskController {

    @GetMapping("/tasks")
    public String list(Model model) {
        // 渡すデータをDTOにまとめる
        var task1 = new TaskDTO(1L,
                "Spring Bootを学ぶ",
                "TODO アプリケーションを作ってみる",
                "TODO"
                );
        var task2 = new TaskDTO(1L,
                "Spring Securityを学ぶ",
                "ログイン機能を作ってみる",
                "TODO"
                );
        var taskList = List.of(task1, task2);
        // 戻り値にテンプレートを指定
        // テンプレート側で「task」という名前で「Spring Bootを学ぶ」という文字列が渡る
        model.addAttribute("taskList", taskList);
        return "tasks/list";
    }
}
