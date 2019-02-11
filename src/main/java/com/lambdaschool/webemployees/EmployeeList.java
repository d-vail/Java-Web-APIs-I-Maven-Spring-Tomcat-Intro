package com.lambdaschool.webemployees;

import java.util.ArrayList;

public class EmployeeList {
  public ArrayList<Employee> employeeList = new ArrayList<>();

  public EmployeeList() {
    employeeList.add(new Employee("Steve", "Green", 45000, true, 1, 1));
    employeeList.add(new Employee("May", "Ford", 80000, true, 1, 1));
    employeeList.add(new Employee("John", "Jones", 75000, true, 1, 1));
  }

  public Employee findEmployee(CheckEmployee tester) {
    for (Employee e : employeeList) {
      if (tester.test(e)) {
        return e;
      }
    }

    return null;
  }
}
