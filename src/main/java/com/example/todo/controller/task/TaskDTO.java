package com.example.todo.controller.task;

import com.example.service.task.TaskEntity;

public record TaskDTO(
      long id,
      String summary,
      String descString,
      String status
) {
  public static TaskDTO toDTO(TaskEntity entity) {
    return new TaskDTO(
        entity.id(),
        entity.summary(),
        entity.description(),
        entity.status().name()
      );
  }
}
