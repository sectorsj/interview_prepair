package ru.sectorsj.interview_preparation.hw5.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class StudentDao {

    private SessionFactory factory;

    public StudentDao(SessionFactory factory) {
        this.factory = factory;
    }

    public Student findById(Long id) {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            System.out.println(student);
            session.getTransaction().commit();
            return student;
        }
    }

    public List<Student> findAll() {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            List<Student> students = session.createQuery("SELECT i FROM Student i", Student.class).getResultList();
            System.out.println(students);
            session.getTransaction().commit();
            return students;
        }
    }

    public void create() {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Student student = new Student("Freddy", 85);
            System.out.println(student);
            session.save(student);
            session.getTransaction().commit();
            System.out.println(student);
        }
    }

    public void update(Long id, String newName, int newMark) {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            student.setName(newName);
            student.setMark(newMark);
            session.getTransaction().commit();
        }
    }

    public void delete(Long id) {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            session.delete(student);
            session.getTransaction().commit();
        }
    }
}