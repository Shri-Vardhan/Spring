package com.gradle.projects;

import org.springframework.stereotype.Component;
import javax.sql.DataSource;
import java.sql.Connection;

@Component
public class DBconnection {

    private final DataSource dataSource;

    public DBconnection(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Connection getConnection() throws Exception {
        return dataSource.getConnection();
    }
}


