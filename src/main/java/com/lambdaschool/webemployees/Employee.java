package com.lambdaschool.webemployees;

import java.util.concurrent.atomic.AtomicLong;

public class Employee {
  private static final AtomicLong COUNTER = new AtomicLong();
  private long id;
  private String fname;
  private String lname;
  private double salary;
  private boolean has401k;
  private int companyId;
  private int healthPlanId;

  public Employee(String fname, String lname, double salary, boolean has401k, int companyId, int healthPlanId) {
    id = COUNTER.incrementAndGet();
    this.fname = fname;
    this.lname = lname;
    this.salary = salary;
    this.has401k = has401k;
    this.companyId = companyId;
    this.healthPlanId = healthPlanId;
  }

  public long getId() {
    return id;
  }

  public String getFname() {
    return fname;
  }

  public void setFname(String fname) {
    this.fname = fname;
  }

  public String getLname() {
    return lname;
  }

  public void setLname(String lname) {
    this.lname = lname;
  }

  public String getName() {
    return fname + " " + lname;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public boolean isHas401k() {
    return has401k;
  }

  public void setHas401k(boolean has401k) {
    this.has401k = has401k;
  }

  public int getCompanyId() {
    return companyId;
  }

  public void setCompanyId(int companyId) {
    this.companyId = companyId;
  }

  public int getHealthPlanId() {
    return healthPlanId;
  }

  public void setHealthPlanId(int healthPlanId) {
    this.healthPlanId = healthPlanId;
  }
}
