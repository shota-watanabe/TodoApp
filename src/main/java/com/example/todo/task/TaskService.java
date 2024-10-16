package com.example.todo.task;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TaskService {

  public List<TaskEntity> find() {
      // 渡すデータをDTOにまとめる
      var task1 = new TaskEntity(1L,
              "Spring Bootを学ぶ",
              "TODO アプリケーションを作ってみる",
              TaskStatus.TODO
              );
      var task2 = new TaskEntity(1L,
              "Spring Securityを学ぶ",
              "ログイン機能を作ってみる",
              TaskStatus.DOING
      );

      return List.of(task1, task2);
  }
}
