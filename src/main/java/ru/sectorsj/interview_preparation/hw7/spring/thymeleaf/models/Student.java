package ru.sectorsj.hw7_spring.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "students")
public class Student {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "mark")
    private int mark;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    public void incrementMark(int amount) {
        mark += amount;
    }

    public void decrementMark(int amount) {
        mark -= amount;
    }

    public void incrementAge(int amount) {
        age += amount;
    }
}
