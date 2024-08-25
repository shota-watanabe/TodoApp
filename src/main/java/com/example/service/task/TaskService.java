package com.example.service.task;

import java.util.List;

import com.example.todo.controller.task.TaskDTO;

public class TaskService {

  public List<TaskDTO> find() {
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

      return List.of(task1, task2);
  }
}
