package com.gradle.projects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
public class
Test {
    @Autowired
    private DBconnection db;
    public static void main(String[] args) {
        SpringApplication.run(Test.class , args);
    }
    public void run(String...args) throws SQLException {
        db.getConnection();
    }
}
