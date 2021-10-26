package com.rustamsemenov.spring.springboot1.spring_course_springboot1.dao;


import com.rustamsemenov.spring.springboot1.spring_course_springboot1.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployee();

   public    void saveEmployee(Employee employee);

   public Employee getEmployee(int id);

   public void deleteEmployee(int id);
}
