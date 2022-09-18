package com.example.demo;

public class Student {
    private int id ;
    private String name ;

    private ClassRoom classRoom ;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }
}
