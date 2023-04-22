package com.example.tut03.controller;

import com.example.tut03.model.Company;
import com.example.tut03.model.Employee;
import com.example.tut03.repository.CompanyRepository;
import com.example.tut03.repository.EmployeeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    CompanyRepository companyRepository;

    @RequestMapping(value = "/")
    public String getAllEmployees(Model model) {
        List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employees", employees);
        return "employeeList";
    }

    @RequestMapping(value = "/{id}")
    public String getEmployeeById(@PathVariable(value = "id") Long id, Model model) {
        Employee employee = employeeRepository.getById(id);
        model.addAttribute("employee", employee);
        return "employeeDetail";
    }

    @RequestMapping(value = "/save")
    public String saveUpdate(@RequestParam(value = "id", required = false) Long id, @Valid Employee employee, BindingResult result) {
        if (result.hasErrors()) {
            if (id == null) {
                return "employeeAdd";
            } else {
                return "employeeUpdate";
            }
        }
        employee.setId(id);
        employeeRepository.save(employee);
        return "redirect:/list";
    }

    @RequestMapping(value = "add")
    public String addEmployee(Model model) {
        Employee employee = new Employee();
        List<Company> companies = companyRepository.findAll();
        model.addAttribute("company", companies);
        model.addAttribute("employee", employee);
        return "employeeAdd";
    }

    @RequestMapping(value = "add")
    public String searchEmployee(Model model, @RequestParam(value = "name") String name) {
        List<Employee> employees = employeeRepository.findByNameContaining(name);
        model.addAttribute("employees", employees);
        return "employeeList";
    }

    @RequestMapping("/sort/asc")
    public String sortEmployeeAsc(Model model) {
        List<Employee> employees = employeeRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
        model.addAttribute("employees", employees);
        return "employeeList";
    }

    @RequestMapping("/sort/desc")
    public String sortEmployeeDesc(Model model) {
        List<Employee> employees = employeeRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));
        model.addAttribute("employees", employees);
        return "employeeList";
    }

}
