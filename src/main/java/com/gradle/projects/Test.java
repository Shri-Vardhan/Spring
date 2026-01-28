package com.gradle.projects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
                Student student = context.getBean("student" , Student.class);
        student.perform();
    }

}
