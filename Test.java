package com.gradle.projects;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        DBconnection db = context.getBean(DBconnection.class);

        try (Connection con = db.getConnection()) {
            System.out.println("Connected successfully!");
        } catch (Exception e) {
            System.out.println(e);
        }

        context.close();
    }
}
