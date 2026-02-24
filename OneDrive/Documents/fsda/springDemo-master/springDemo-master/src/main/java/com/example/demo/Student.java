package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private Computer computer;

    public Student() {
        System.out.println("Student object created");
    }

    @Autowired
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void build() {
        computer.compile();
        System.out.println("Project build successfully");
    }
}
