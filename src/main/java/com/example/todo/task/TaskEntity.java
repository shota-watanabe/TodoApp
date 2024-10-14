package com.example.todo.task;

public record TaskEntity(
  long id,
  String summary,
  String description,
  TaskStatus status
) {
}
