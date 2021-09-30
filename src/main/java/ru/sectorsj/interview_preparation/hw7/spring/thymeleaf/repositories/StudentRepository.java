package ru.sectorsj.hw7_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sectorsj.hw7_spring.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
