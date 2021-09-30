package ru.sectorsj.hw7_spring.services;


import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sectorsj.hw7_spring.models.Student;
import ru.sectorsj.hw7_spring.repositories.StudentRepository;


import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService {

    private StudentRepository studentRepository;

    public Page<Student> findAll(int page, int size) {
        return studentRepository.findAll(PageRequest.of(page, size));
    }

    public Optional<Student> findOneById(Long id) {
        return studentRepository.findById(id);
    }

    public void save(Student student) {
        studentRepository.save(student);
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    @Transactional
    public void incrementMarkById(Long id, int amount) {
        Student s = studentRepository.findById(id).get();
        s.incrementMark(amount);
    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    @Transactional
    public void decrementMarkById(Long id, int amount) {
        Student s = studentRepository.findById(id).get();
        s.decrementMark(amount);
    }

}
