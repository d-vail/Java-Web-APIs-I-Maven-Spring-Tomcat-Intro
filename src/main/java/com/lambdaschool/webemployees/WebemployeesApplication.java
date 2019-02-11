package com.lambdaschool.webemployees;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebemployeesApplication {
  static EmployeeList employees;

  public static void main(String[] args) {
    employees = new EmployeeList();
    SpringApplication.run(WebemployeesApplication.class, args);
  }

}

