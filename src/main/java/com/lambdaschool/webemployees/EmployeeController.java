package com.lambdaschool.webemployees;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

// localhost:8080/data/allemployees
@RestController
@RequestMapping("/data")
public class EmployeeController {
  @RequestMapping("employee")
  public Employee getEmployee(@RequestParam(value="id") long id) {
    return WebemployeesApplication.employees.findEmployee(e -> e.getId() == id);
  }

  @RequestMapping("/allemployees")
  public ArrayList<Employee> getAllEmployees() {
    WebemployeesApplication.employees.employeeList.sort((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName()));
    return WebemployeesApplication.employees.employeeList;
  }
}
