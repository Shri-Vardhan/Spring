package com.gradle.projects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Autowired
    Book b1;
    void perform(){
        b1.read();
    }
}