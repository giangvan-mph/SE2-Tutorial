package com.example.springboot1.service;

import com.example.springboot1.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAllEmployee ();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);

    void deleteEmployeeById (long id);
}
