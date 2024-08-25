package com.example.service.task;

public record TaskEntity(
  long id,
  String summary,
  String description,
  TaskStatus status
) {
}
