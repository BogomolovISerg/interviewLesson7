package ru.geekbrains.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "STUDENT")
public class Student {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "mark")
    private int mark;

    public Student() {
        super();
    }

    public Student(String name, int mark) {
        super();
        this.name = name;
        this.mark = mark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return String.format("Студент [id=%s, name=%s, mark=%s]", id, name, mark);
    }
}
