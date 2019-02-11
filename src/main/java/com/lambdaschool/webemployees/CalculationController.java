package com.lambdaschool.webemployees;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// localhost:8080/calc/salary?id=1&raise=0.5
// preview what a given raise would look like without manipulating original data
@RestController
@RequestMapping("/calc")
public class CalculationController {
  @RequestMapping("/salary")
  public Employee checkRaise(@RequestParam(value="id") long id,
                             @RequestParam(value="raise") double raise) {
    Employee employee =
            new Employee(WebemployeesApplication.employees.findEmployee(e -> e.getId() == id));
    employee.setSalary(employee.getSalary() * (1.0 + raise));
    return employee;
  }
}
