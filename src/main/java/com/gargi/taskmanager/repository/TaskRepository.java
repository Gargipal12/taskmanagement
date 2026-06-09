package com.gargi.taskmanager.repository;

import com.gargi.taskmanager.model.Task;
import com.gargi.taskmanager.model.TaskStatus;
import com.gargi.taskmanager.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(TaskStatus status);
}
