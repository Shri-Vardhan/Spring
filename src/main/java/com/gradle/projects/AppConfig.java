package com.gradle.projects;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.gradle.projects")
@PropertySource("classpath:application.properties")
public class AppConfig {

}