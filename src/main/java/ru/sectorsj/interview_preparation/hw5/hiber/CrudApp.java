package ru.sectorsj.interview_preparation.hw5.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class CrudApp {

    private static StudentDao studentDao;
    private static SessionFactory factory;

    public CrudApp(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public static void main(String[] args) {
        try {
            init();
            StudentDao studentDao = new StudentDao(factory);
            studentDao.findById(1L);
            studentDao.create();
            studentDao.delete(3l);
            studentDao.findAll();
            studentDao.update(2L, "Bob => updated", 34);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            shutdown();
        }
    }

    public static void init() {
        factory = new Configuration()
                .configure("configs.crud/hibernate.cfg.xml")
                .buildSessionFactory();
        Session session = null;

        try {
            String sql = Files.lines(Paths.get("students.sql")).collect(Collectors.joining(" "));
            session = factory.getCurrentSession();
            session.beginTransaction();
            session.createNativeQuery(sql).executeUpdate();
            session.getTransaction().commit();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public static void shutdown() {
        factory.close();
    }
}