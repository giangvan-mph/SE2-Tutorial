package com.example.springboot3.controller;

import com.example.springboot3.model.Employee;
import com.example.springboot3.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    //display list of employee

    @RequestMapping (value = "/list")
    public String getAllEmployee(Model model) {

        model.addAttribute("employees", employeeService.getAllEmployee());
        return "employeeList";
    }

    @GetMapping("/login")
    public String viewLoginPage() {
        return "login";
    }

    @GetMapping("/newEmployeeForm")
    public String showNewEmployeeForm (Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employeeAdd";
    }

    @PostMapping("/submit")
    public String saveEmployee (
            @ModelAttribute("employee")
            @RequestParam(value = "id", required = false) Long id,
            @Valid Employee employee, BindingResult result) {
        //save employee to database
        if (result.hasErrors()) {
            if (id == null) {
                return "employeeAdd";
            }
            else {
                return "updateEmployee";
            }
        }

        employeeService.saveEmployee(employee);
        return "redirect:/list";

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
        return "redirect:/list";
        //call delete method
    }
//
//
//

}
