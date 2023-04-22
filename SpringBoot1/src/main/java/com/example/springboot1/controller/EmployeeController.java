package com.example.springboot1.controller;

import com.example.springboot1.model.Employee;
import com.example.springboot1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.springboot1.repository.EmployeeRepository;

import java.util.List;
import java.util.Objects;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    //display list of employee

    @RequestMapping (value = "/")
    public String getAllEmployee(Model model) {

        model.addAttribute("employees", employeeService.getAllEmployee());
        return "employeeList";
    }

    @GetMapping("/newEmployeeForm")
    public String showNewEmployeeForm (Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employeeAdd";
    }

    @PostMapping("/submit")
    public String saveEmployee (@ModelAttribute("employee") Employee employee) {
        //save employee to database
        employeeService.saveEmployee(employee);
        return "redirect:/";

    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable (value = "id") Long id, Model model) {
        //get employee from the service
        Employee employee = employeeService.getEmployeeById(id);

        //set employee as a model attribute to pre-populate form
        model.addAttribute("employee", employee);
        return "updateEmployee";

    }
//
    @GetMapping (value = "/detail/{id}")
    public String getEmployeeById (
            @PathVariable(value = "id") Long id, Model model) {
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "employeeDetail";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee (@PathVariable (value = "id") Long id) {
        employeeService.deleteEmployeeById(id);
        return "redirect:/";
        //call delete method
    }
//
//
//

}
