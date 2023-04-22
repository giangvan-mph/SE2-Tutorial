package com.example.springboot3.service;

import com.example.springboot3.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee ();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);

    void deleteEmployeeById (long id);
}
