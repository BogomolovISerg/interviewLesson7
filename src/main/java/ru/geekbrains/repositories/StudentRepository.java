package ru.geekbrains.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
