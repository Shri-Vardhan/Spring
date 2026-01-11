package com.gradle.projects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.Statement;

@SpringBootApplication
public class Test implements CommandLineRunner {

    @Autowired
    private DBconnection db;

    public static void main(String[] args) {
        SpringApplication.run(Test.class, args);
    }

    @Override
    public void run(String... args) {
        try (Connection con = db.getConnection();
             Statement stmt = con.createStatement()) {

            System.out.println("Database connection SUCCESSFUL");

            stmt.execute("""
                CREATE TABLE sample (
                    id NUMBER,
                    name VARCHAR2(30)
                )
            """);
        } catch (Exception e) {
            System.out.println("FAILED");
            e.printStackTrace();
        }
    }
}
